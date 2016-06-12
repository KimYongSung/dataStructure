package kys.study.dataStructure.sort.impl;

import kys.study.dataStructure.sort.AbstractSort;
import kys.study.dataStructure.sort.Sort;

public class QuickSort extends AbstractSort implements Sort {

	@Override
	public void sorting(int[] arr) {
		quick(arr, 0, arr.length-1);
	}

	private void quick(int[] arr, int start, int end){
		if(start < end){
			int left = start, right = end;
			int pivotPoisiton = (start+end)/2;
			int pivot = arr[pivotPoisiton];
			while(left < right){
				while(arr[left] < pivot) left++;
				while(left<right && arr[right] > pivot) right--;
				swap(arr, left, right);
			}
			quick(arr, start,left-1);
			quick(arr, left+1, end);
		}
	}

}

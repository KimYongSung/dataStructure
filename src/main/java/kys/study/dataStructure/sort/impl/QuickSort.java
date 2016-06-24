package kys.study.dataStructure.sort.impl;

import java.util.Comparator;

import kys.study.dataStructure.sort.AbstractSort;
import kys.study.dataStructure.sort.Sort;

public class QuickSort<T> extends AbstractSort implements Sort<T> {

	private void quick(T[] arr, int start, int end, Comparator<T> t){
		if(start < end){
			int left = start, right = end;
			int pivotPoisiton = (start+end)/2;
			T pivot = arr[pivotPoisiton];
			while(left < right){
				while(t.compare(arr[left], pivot) < 0 ) left++;
				while(left<right && (t.compare(arr[right], pivot) > 0)) right--;
				swap(arr, left, right);
			}
			quick(arr, start,left-1, t);
			quick(arr, left+1, end, t);
		}
	}

	@Override
	public void sorting(T[] arr, Comparator<T> t) {
		quick(arr, 0, arr.length-1, t);
	}

}

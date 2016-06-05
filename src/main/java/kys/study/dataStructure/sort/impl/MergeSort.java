package kys.study.dataStructure.sort.impl;

import java.util.LinkedList;
import java.util.List;

import kys.study.dataStructure.sort.AbstractSort;

public class MergeSort extends AbstractSort{

	@Override
	public void sorting(int[] arr) {
		divide(arr, 0, arr.length);
	}
	
	public void divide(int[] arr, int start, int end){
		if(end - start < 1) return;
		
		int middle = (start+end) / 2;
		divide(arr, start, middle);
		divide(arr, middle+1, end);
		
		merge(arr, start, middle, end);
	}

	public void merge(int[] arr, int start, int middle, int end){
		int leftIndex = start;
		int rightIndex = middle+1;
		
		List<Integer> temp = new LinkedList<Integer>();
		
		while(leftIndex <= middle && rightIndex <= end){
			if(arr[leftIndex] < arr[rightIndex] ){
				//temp[destIndex] = arr[leftIndex];
				temp.add(arr[leftIndex]);
				leftIndex++;
			}else{
				//temp[destIndex] = arr[rightIndex];
				temp.add(arr[leftIndex]);
				rightIndex++;
			}
		}
		
		while(leftIndex <= middle){
			//temp[destIndex] = arr[leftIndex];
			temp.add(arr[leftIndex]);
			leftIndex++;
		}
		
		while(rightIndex <= end){
			//temp[destIndex] = arr[rightIndex];
			temp.add(arr[leftIndex]);
			rightIndex++;
		}
		
		for(int index = start, dest = 0; index <= end; index++, dest++){
			arr[index] = temp.get(dest);
		}
	}
}

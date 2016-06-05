package kys.study.dataStructure.sort.impl;

import kys.study.dataStructure.sort.AbstractSort;

public class MergeSort extends AbstractSort{

	@Override
	public void sorting(int[] arr) {
		divide(arr,0,arr.length-1);
	}
	
	public void divide(int[] arr,int start, int end){
		if((end - start) < 1) return;
		int mid = (start+end) / 2;
		
		divide(arr,start, mid);
		divide(arr,mid+1, end);
		merge(arr, start, mid, end);
	}
	
	public void merge(int[] arr,int start,int mid, int end){
		int tempArr[] = new int[10];

		int left = start;
		int right = mid+1;
		int temp = start;
		
		while((left <= mid) && (right <= end)){
			if(arr[left] < arr[right]){
				tempArr[temp] = arr[left];
				left++;
			}else{
				tempArr[temp] = arr[right];
				right++;
			}
			temp++;
		}
		
		while(left <= mid){
			tempArr[temp] = arr[left];
			left++;
			temp++;
		}
		
		while(right <= end){
			tempArr[temp] = arr[right];
			right++;
			temp++;
		}
		
		for(int index = start; index <= end; index++)
			arr[index] = tempArr[index];
	}
}

package kys.study.dataStructure.sort.impl;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import kys.study.dataStructure.sort.AbstractSort;
import kys.study.dataStructure.sort.Sort;

public class MergeSort<T> extends AbstractSort  implements Sort<T> {

	private void divide(T[] arr,int start, int end, Comparator<T> t){
		if((end - start) < 1) return;
		int mid = (start+end) / 2;
		divide(arr,start, mid, t);
		divide(arr,mid+1, end, t);
		merge(arr, start, mid, end, t);
	}
	
	private void merge(T[] arr,int start,int mid, int end, Comparator<T> t){
		List<T> tempList = new LinkedList<T>();

		int left = start;
		int right = mid+1;
		
		while((left <= mid) && (right <= end)){
			if(t.compare(arr[left], arr[right]) < 0){
				tempList.add(arr[left]);
				left++;
			}else{
				tempList.add(arr[right]);
				right++;
			}
		}
		
		while(left <= mid){
			tempList.add(arr[left]);
			left++;
		}
		
		while(right <= end){
			tempList.add(arr[right]);
			right++;
		}
		
		Iterator<T> itr = tempList.iterator();
		for(int index = start; index <= end && itr.hasNext() ; index++)
			arr[index] = itr.next();
	}

	@Override
	public void sorting(T[] arr, Comparator<T> t) {
		divide(arr, 0, arr.length-1, t);	
	}
}

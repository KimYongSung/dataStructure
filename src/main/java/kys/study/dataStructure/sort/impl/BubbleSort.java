package kys.study.dataStructure.sort.impl;

import java.util.Comparator;

import kys.study.dataStructure.sort.AbstractSort;
import kys.study.dataStructure.sort.Sort;

public class BubbleSort<T> extends AbstractSort  implements Sort<T> {

	@Override
	public void sorting(T[] arr, Comparator<T> t) {
		int loopingCount = arr.length;
		for(int index1 = 0; index1 < loopingCount; index1++ ){
			for(int index2 = 0; index2 < loopingCount-1; index2++){
				if(t.compare(arr[index2], arr[index2+1]) > 0){
					swap(arr, index2, index2+1);
				}
			}
		}
	}
}

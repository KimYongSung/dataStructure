package kys.study.dataStructure.sort.impl;

import java.util.Comparator;

import kys.study.dataStructure.sort.AbstractSort;
import kys.study.dataStructure.sort.Sort;

public class InsertionSort<T> extends AbstractSort  implements Sort<T> {

	@Override
	public void sorting(T[] arr, Comparator<T> t) {
		int loopingCount = arr.length;
		for(int index = 1; index < loopingCount; index++){
			T temp = arr[index];
			int aux = index -1;
			
			while((aux>=0) && ( t.compare(arr[aux], temp)>0)){
				arr[aux+1] = arr[aux];
				aux--;
			}
			
			arr[aux+1] = temp;
		}
	}

}

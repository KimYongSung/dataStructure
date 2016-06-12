package kys.study.dataStructure.sort.impl;

import kys.study.dataStructure.sort.AbstractSort;
import kys.study.dataStructure.sort.Sort;

public class InsertionSort extends AbstractSort  implements Sort {

	@Override
	public void sorting(int[] arr) {
		int loopingCount = arr.length;
		for(int index = 1; index < loopingCount; index++){
			int temp = arr[index];
			int aux = index -1;
			
			while((aux>=0) && (arr[aux] > temp)){
				arr[aux+1] = arr[aux];
				aux--;
			}
			
			arr[aux+1] = temp;
		}
	}
}

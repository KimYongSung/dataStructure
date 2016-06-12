package kys.study.dataStructure.sort.impl;

import kys.study.dataStructure.sort.AbstractSort;
import kys.study.dataStructure.sort.Sort;

public class BubbleSort extends AbstractSort  implements Sort {

	@Override
	public void sorting(int[] value) {
		int loopingCount = value.length;
		for(int index1 = 0; index1 < loopingCount; index1++ ){
			for(int index2 = 0; index2 < loopingCount-1; index2++){
				if(value[index2] > value[index2+1]){
					swap(value, index2, index2+1);
				}
			}
		}
	}
}

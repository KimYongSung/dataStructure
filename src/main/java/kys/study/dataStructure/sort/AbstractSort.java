package kys.study.dataStructure.sort;

public abstract class AbstractSort implements Sort {

	/**
	 * 정수형 배열의 위치 변경합니다.
	 * @param value	  정수형 배열
	 * @param index1 위치를 변경할 배열 인덱스
	 * @param index2 위치를 변경할 배열 인덱스
	 */
	public void swap(int[] value, int index1, int index2){
		int temp = value[index1];
		value[index1] = value[index2];
		value[index2] = temp;
	}
}

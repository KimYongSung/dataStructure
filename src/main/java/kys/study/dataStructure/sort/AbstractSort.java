package kys.study.dataStructure.sort;

public abstract class AbstractSort{

	/**
	 * 정수형 배열의 위치 변경합니다. <br>
	 * index1와 index2가 서로 위치를 변경합니다.
	 * @param value	  정수형 배열
	 * @param index1 위치를 변경할 배열 인덱스
	 * @param index2 위치를 변경할 배열 인덱스
	 */
	public <T> void swap(T[] value, int index1, int index2){
		T temp = value[index1];
		value[index1] = value[index2];
		value[index2] = temp;
	}
}

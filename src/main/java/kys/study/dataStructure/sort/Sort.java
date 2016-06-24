package kys.study.dataStructure.sort;

import java.util.Comparator;

/**
 * <pre>
 * 정렬 인터페이스
 * </pre>
 * @author kim
 * @date 2016. 6. 5.
 */
public interface Sort<T> {
	
	/**
	 * 입력받은 정수형 배열 정렬
	 * @param arr
	 */
	void sorting(T[] arr, Comparator<T> t);
}

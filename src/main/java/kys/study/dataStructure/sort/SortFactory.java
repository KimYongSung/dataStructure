package kys.study.dataStructure.sort;

import kys.study.dataStructure.sort.impl.BubbleSort;
import kys.study.dataStructure.sort.impl.InsertionSort;
import kys.study.dataStructure.sort.impl.MergeSort;
import kys.study.dataStructure.sort.impl.QuickSort;

/**
 * <pre>
 * Sort FactoryMethod 패턴
 * </pre>
 * @author kim
 * @date 2016. 6. 5.
 */
public class SortFactory {

	/**
	 * Sort 구현 클래스 리턴
	 * @param str
	 * @return
	 */
	public static Sort getInstance(SortAlgorithm str){
		switch (str) {
		case BUBBLE:
			return new BubbleSort();
		case INSERTION:
			return new InsertionSort();
		case MERGE:
			return new MergeSort();
		case QUICK:
			return new QuickSort();
		default:
			return new MergeSort();
		}
	}
	
	/**
	 * <pre>
	 * Sort 알고리즘
	 * </pre>
	 * @author kim
	 * @date 2016. 6. 5.
	 */
	public enum SortAlgorithm{
		
		BUBBLE("bubble"),
		INSERTION("insertion"),
		QUICK("quick"),
		MERGE("merge");
		private String mode;
		
		private SortAlgorithm(String _mode){
			setMode(_mode);
		}

		public String getMode() {
			return mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}
		
	}
}

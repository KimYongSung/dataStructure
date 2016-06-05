package kys.study.dataStructure.sort;

import kys.study.dataStructure.sort.impl.BubbleSort;
import kys.study.dataStructure.sort.impl.InsertionSort;
import kys.study.dataStructure.sort.impl.MergeSort;

public class SortFactory {

	public static Sort getInstance(SortAlgorithm str){
		switch (str) {
		case BUBBLE:
			return new BubbleSort();
		case INSERTION:
			return new InsertionSort();
		case MERGE:
			return new MergeSort();
		default:
			return new InsertionSort();
		}
	}
	
	public enum SortAlgorithm{
		
		BUBBLE("bubble"),
		INSERTION("insertion"),
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

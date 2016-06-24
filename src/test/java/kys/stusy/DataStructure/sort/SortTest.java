package kys.stusy.DataStructure.sort;

import java.util.Comparator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import kys.study.dataStructure.sort.Sort;
import kys.study.dataStructure.sort.impl.BubbleSort;
import kys.study.dataStructure.sort.impl.InsertionSort;
import kys.study.dataStructure.sort.impl.MergeSort;
import kys.study.dataStructure.sort.impl.QuickSort;

public class SortTest {

	private Integer[] arr = new Integer[10];
	
	private Comparator<Integer> comparator = (Integer o1, Integer o2) -> {
		return o1 - o2;
	};
	
	@Before
	public void before(){
		arr[0] = 99;
		arr[1] = 25;
		arr[2] = 35;
		arr[3] = 77;
		arr[4] = 15;
		arr[5] = 24;
		arr[6] = 3;
		arr[7] = 45;
		arr[8] = 89;
		arr[9] = 59;
		
		System.out.println("정렬 전 :");
		printArr();
	}
	
	@Test
	public void bubbleTest(){
		Sort<Integer> sort = new BubbleSort<Integer>();
		sort.sorting(arr, comparator);
	}
	
	@Test
	public void insertionTest(){
		Sort<Integer> sort = new InsertionSort<Integer>();
		sort.sorting(arr, comparator);
	}
	
	@Test
	public void mergeTest(){
		Sort<Integer> sort = new MergeSort<Integer>();
		sort.sorting(arr, comparator);
	}
	
	@Test
	public void quickTest(){
		Sort<Integer> sort = new QuickSort<Integer>();
		sort.sorting(arr, comparator);
	}
	
	
	@After
	public void after(){
		System.out.println("정렬 후 :");
		printArr();
	}
	
	public void printArr(){
		StringBuilder strBuilder = new StringBuilder();
		
		for(int value : arr) 
			strBuilder.append("[").append(value).append("]");
		
		System.out.println(strBuilder.toString());
	}
}

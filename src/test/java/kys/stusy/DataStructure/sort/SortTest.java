package kys.stusy.DataStructure.sort;

import org.junit.Before;
import org.junit.Test;

import kys.study.dataStructure.sort.Sort;
import kys.study.dataStructure.sort.SortFactory;
import kys.study.dataStructure.sort.SortFactory.SortAlgorithm;

public class SortTest {

	private int[] arr = new int[10];
	
	@Before
	public void setArr(){
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
	}
	
	@Test
	public void bubbleTest(){
		Sort sort = SortFactory.getInstance(SortAlgorithm.BUBBLE);
		sort.sorting(arr);
		for(int value : arr){
			System.out.println(value);
		}
	}
	
	@Test
	public void insertionTest(){
		Sort sort = SortFactory.getInstance(SortAlgorithm.INSERTION);
		sort.sorting(arr);
		for(int value : arr){
			System.out.println(value);
		}
	}
	
	@Test
	public void mergeTest(){
		Sort sort = SortFactory.getInstance(SortAlgorithm.MERGE);
		sort.sorting(arr);
		for(int value : arr){
			System.out.println(value);
		}
	}
}

package kys.stusy.DataStructure.list;

import org.junit.Before;
import org.junit.Test;

import kys.study.dataStructure.list.List;
import kys.study.dataStructure.list.impl.MyLinkedList;

public class MyLinkedListTest {
	
	private List<String> list = new MyLinkedList<String>();
	
	@Before
	public void dataSetting(){
		list.put("1");
		list.put("2");
		list.put("3");
		list.put("4");
		list.put("5");
		list.put("6");
		list.put("7");
		list.put("8");
		list.put("9");
	}

	@Test
	public void listTest(){
		for(int i=0; i < list.length(); i++){
			System.out.println(list.get(i));
		}
		System.out.println("리스트 삭제 후");
		list.remove(list.length());
		list.remove(0);
		list.remove(4);
		for(int i=0; i < list.length(); i++){
			System.out.println(list.get(i));
		}
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void getErrorTest1(){
		list.get(10);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void getErrorTest2(){
		List<String> list = new MyLinkedList<String>();
		list.get(0);
	}
	
	@Test(expected=StackOverflowError.class)
	public void putErrorTest(){
		for(int i=0; i < 15; i++){
			list.put(""+i);
		}
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void removeErrorTest(){
		List<String> list = new MyLinkedList<String>();
		list.remove(10);
	}
	
}


package kys.stusy.DataStructure.list;

import org.junit.Before;
import org.junit.Test;

import kys.study.dataStructure.list.Stack;
import kys.study.dataStructure.list.impl.MyStack;
import kys.study.exception.StackUnderFlow;

public class MyLinkedStackTest {

	private Stack<String> stack = new MyStack<String>();
	
	@Before
	public void dataSetting(){
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		/*stack.push("5");
		stack.push("6");
		stack.push("7");
		stack.push("8");
		stack.push("9");*/
	}

	@Test
	public void listTest(){
		System.out.println(stack.top());
		String value = null;
		while((value=stack.pop()) != null){
			System.out.println(value);
		}
	}
	
	@Test(expected=StackUnderFlow.class)
	public void getErrorTest(){
		Stack<String> stack = new MyStack<String>();
		stack.top();
	}
}

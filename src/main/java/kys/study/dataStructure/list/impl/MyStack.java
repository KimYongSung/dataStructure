package kys.study.dataStructure.list.impl;

import kys.study.dataStructure.list.Stack;
import kys.study.exception.StackUnderFlow;

public class MyStack<T> extends MyLinkedList<T> implements Stack<T>{

	@Override
	public T top() {
		if(last == null) throw new StackUnderFlow();
		return last.getT();
	}

	@Override
	public T pop() {
		if(last == null) return null;
		T t = last.getT();
		remove(size-1);
		return t;
	}

	@Override
	public void push(T t) {
		put(t);
	}

	@Override
	public boolean empty() {
		return last == null ? true : false;
	}
}

package kys.study.dataStructure.list.impl;

import kys.study.dataStructure.list.List;

/**
 * <pre>
 * 내가 구현해 본 LinkdeList
 * 해당 구조는 Thread에 안전하지 않습니다.
 * </pre>
 * @author kim
 * @date 2016. 6. 4.
 * @param <T>
 */
public class MyLinkedList<T> implements List<T>{

    int size = 0;

	Node<T> first = null;

	Node<T> last = null;

	// test 용
	//private final int MAX = 10;
	private final int MAX = Integer.MAX_VALUE - 10;

	@Override
	public void put(T t) {
		if(size+1 == MAX) throw new StackOverflowError();
		add(t);
	}

	@Override
	public T get(int index){
		if(first == null || size < index) throw new IndexOutOfBoundsException();
		return schNode(index).getT();
	}

	@Override
	public void remove(int index) {
		if(last == null || size < index) throw new IndexOutOfBoundsException();
		if(index == size-1) { 
			if(last.getBefore() == null) last = null;
			else{
				last = last.getBefore();
				last.setNext(null);
			}
		}else if(index == 0){
			if(first.getNext() == null) first = null;
			else{
				first = first.getNext();
				first.setBefore(null);
			}
		}else removeNode(schNode(index));
		size--;
	}
	

	@Override
	public int length() {
		return size;
	}
	
	/**
	 * 리스트의 전체 길이를 절반으로 나눈뒤 검색 시작위치 변경
	 * @param index
	 * @return
	 */
	private Node<T> schNode(int index){
		return index < (size/2) ? firstStartSchNode(index) : lastStartSchNode(index);
	}
	
	/**
	 * 끝부터 해당 위치 검색
	 * @param index
	 * @return
	 */
	private Node<T> lastStartSchNode(int index){
		if(index == size-1) return last;
		
		Node<T> node = last;
		for(int position = size-1; position > index; position--)
			node = node.getBefore();
		
		return node;
	}
	
	/**
	 * 시작부터 해당 위치 검색
	 * @param index
	 * @return
	 */
	private Node<T> firstStartSchNode(int index){
		if(index == 0) return first;
		
		Node<T> node = first;
		for(int position = 1; position <= index; position++)
			node = node.getNext();
		
		return node;
	}
	
	/**
	 * <pre>
	 * List 추가
	 * first가 null일시 first와 last에 해당 노드 연결
	 * first가 null이 아니면 last노드 다음에 연결
	 * </pre>
	 * @param t
	 */
	private void add(T t){
		Node<T> lastNode = new Node<T>();
		lastNode.setT(t);
		if(first == null) {
			first = lastNode;
		}else{
			last.setNext(lastNode);
			lastNode.setBefore(last);
		}
		last = lastNode;
		size++;
	}
	
	/**
	 * 중간위치 node 삭제 처리
	 * @param node
	 */
	private void removeNode(Node<T> node){
 		Node<T> beforeNode = node.getBefore();
		Node<T> nextNode = node.getNext();
		beforeNode.setNext(nextNode);
		nextNode.setBefore(beforeNode);
	}

	public int getSize() {
		return size;
	}
	/**
	 * 첫번째 입력 값 리턴
	 * @return
	 */
	public T getFirst() {
		if(first == null) throw new IndexOutOfBoundsException();
		return first.getT();
	}

	/**
	 * 마지막 입력 값 리턴
	 * @return
	 */
	public T getLast(){
		return last.getT();
	}
}
/**
 * <pre>
 * List의 메모리 지정 클래스
 * </pre>
 * @author kim
 * @date 2016. 6. 4.
 * @param <T>
 */
class Node<T>{
	private T t = null;
	private Node<T> next = null;
	private Node<T> before = null;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public Node<T> getBefore() {
		return before;
	}
	public void setBefore(Node<T> before) {
		this.before = before;
	}
}
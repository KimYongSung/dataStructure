package kys.study.dataStructure.list;

public interface Stack<T> {
	
	/**
	 * Stack에 가장 윗 데이터를 넘긴다.
	 * @return
	 */
	T top();
	
	/**
	 * Stack에 데이터를 넘겨주고 해당 데이터를 삭제한다.
	 * @return
	 */
	T pop();
	
	/**
	 * Stack에 데이터를 인입한다.
	 * @param t
	 */
	void push(T t);
	
	/**
	 * Stack의 인입된 데이터 유무를 체크
	 * @return
	 */
	boolean empty();
}

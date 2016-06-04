package kys.study.dataStructure.list;

public interface List<T> {

	/**
	 * List에 데이터 인입
	 * @param t
	 */
	void put(T t);
	
	/**
	 * 특정 Index의 데이터 가져온다.
	 * @param index
	 * @return
	 */
	T get(int index);
	
	/**
	 * 특정 Index의 데이터 삭제
	 * @param index
	 */
	void remove(int index);
	
	/**
	 * 리스트의 전체 길이 리턴
	 * @return
	 */
	int length();
}

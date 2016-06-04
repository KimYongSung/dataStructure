package kys.study.exception;

public class StackUnderFlow extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public StackUnderFlow(){}
	
	public StackUnderFlow(String detailMessage){
		super(detailMessage);
	}
}

package com.reCapProject.RentACar.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data) {
		super(null, true);
		
	}
	
	public SuccessDataResult(String message) {
		super(null, true, message);
		
	}
	public SuccessDataResult(T data,String message) {
		super(data, true, message);
		
	}
	
}

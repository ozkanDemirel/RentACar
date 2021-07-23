package com.reCapProject.RentACar.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data, String message) {
		super(data, true, message);
	}

	public ErrorDataResult(T data) {
		super(null, true);
	}

	public ErrorDataResult(String message) {
		super(null, true, message);
	}

}

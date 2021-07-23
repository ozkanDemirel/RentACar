package com.reCapProject.RentACar.core.utilities.results;

public class ErrorResult<T> extends Result {

	public ErrorResult() {
		super(true);
	}

	public ErrorResult(String message) {
		super(true, message);
	}
}

package com.reCapProject.RentACar.core.utilities.results;

public class SuccesResult<T> extends Result {

	public SuccesResult() {
		super(true);
	}

	public SuccesResult(String message) {
		super(true, message);
	}

}

package com.bankActExceptions;

@SuppressWarnings("serial")
public class DuplicateActException extends Exception {
	public DuplicateActException(String errMsg)
	{
		super(errMsg);
	}

}

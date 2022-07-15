package com.dhathika.filecreation;

public class NameNotSupportedException extends RuntimeException{
	
	public NameNotSupportedException() {
		
	}
	
	public NameNotSupportedException(String message) {
		super(message);
	}
	
	public NameNotSupportedException(String message, Throwable cause)
	{
		super(message, cause);
	}
	
	@Override
	public String getLocalizedMessage() {
		
		return "I am a local message, a name never have special character @";
	}

}

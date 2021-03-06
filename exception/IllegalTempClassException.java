package com.ld.datacenter.poi.exception;
/**
 * override annotation exception
 * @author Cruz
 * @version 01-00
 * @Date 2017/3/31 10:10:00
 */
public class IllegalTempClassException extends RuntimeException{

	private static final long serialVersionUID = 1845298831506720372L;
	
	public IllegalTempClassException(){
		super();
	}
	
	
	public IllegalTempClassException(String message){
		super(message);
	}
	
	public IllegalTempClassException(Throwable Throwable){
		super(Throwable);
	}
	
	public IllegalTempClassException(String message,Throwable cause){
		super(message,cause);
	}
	
	public IllegalTempClassException(Class<?> cls,String message){
		super("entity ["+cls.getName()+"] "+message);
	}
}

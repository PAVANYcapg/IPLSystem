package com.controller;

@SuppressWarnings("serial")
public class FindResultException extends RuntimeException {
	private int id;
	public FindResultException(int id) {
		super("id " + id + " not found");
		this.id=id;
	}
	
	@Override
	public String toString() {
		return "id " + id + " is not avaliable";
	}
}

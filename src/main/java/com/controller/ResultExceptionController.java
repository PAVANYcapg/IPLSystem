package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ResultExceptionController {

	@ExceptionHandler(DeleteResultException.class)
	public ResponseEntity<?> handleDeleteException(DeleteResultException e, WebRequest req) {
		return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UpdateResultException.class)
	public ResponseEntity<?> handleUpdateException(UpdateMatchException e1, WebRequest req) {
		return new ResponseEntity<>(e1.toString(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(FindResultException.class)
	public ResponseEntity<?> handleFindException(FindMatchException e2, WebRequest req) {
		return new ResponseEntity<>(e2.toString(),HttpStatus.NOT_FOUND);
	}
}

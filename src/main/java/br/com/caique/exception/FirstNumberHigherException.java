package br.com.caique.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FirstNumberHigherException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public FirstNumberHigherException(String exception) {
		super(exception);
	}
}

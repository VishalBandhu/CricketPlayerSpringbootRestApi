package com.mindtree.cricket.player.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Player not found in the system")
public class PlayerNotFoundException extends Exception {
	private static final long serialVersionUID = 100L;
}

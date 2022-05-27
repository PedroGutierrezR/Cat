package com.citi.cat.app.ws.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.cat.app.delegate.FactDelegate;
import com.citi.cat.app.service.response.FactResponse;

@RestController
@RequestMapping("/fact")
public class FactController {

	@Autowired
	private FactDelegate factDelegate;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public FactResponse getFactResponse() {
		return factDelegate.getFactResponse();
	}
	
}

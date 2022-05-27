package com.citi.cat.app.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.citi.cat.app.service.FactService;
import com.citi.cat.app.service.response.FactResponse;

@Component("factDelegate")
public class FactDelegateImpl implements FactDelegate {

	@Autowired
	private FactService factService;
	
	@Override
	public FactResponse getFactResponse() {
		return factService.getFactResponse();
	}

}

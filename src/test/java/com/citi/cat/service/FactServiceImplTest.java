package com.citi.cat.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.citi.cat.app.service.FactService;
import com.citi.cat.app.service.helper.ServiceHelper;
import com.citi.cat.app.service.response.FactResponse;
import com.citi.cat.app.service.response.ResponseFromApi;

@SpringBootTest
public class FactServiceImplTest {

	@Autowired
	private FactService underTest;
	
	
	@Test
	void itShouldReturnAnFactResponseObject() {		
		// When
		 FactResponse factResponse = underTest.getFactResponse();
		
		// Then	
		assertThat(factResponse.getClass()).isEqualTo(FactResponse.class);
		 
	}
	
	@Test	
	void itShouldReturnAnString() {
		// Given	
		ResponseFromApi responseFromApi = new ResponseFromApi();
		responseFromApi.setFact("Mensaje cualquiera");
		responseFromApi.setLength(20);
		
		// when 
		String result = ServiceHelper.getTheCorrectOrder(responseFromApi);
		
		// Then
		assertThat(result.getClass()).isEqualTo(String.class);
		
	}
	
}

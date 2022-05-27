package com.citi.cat.app.service.helper;

import com.citi.cat.app.service.response.ResponseFromApi;

public class ServiceHelper {

	public static String getTheCorrectOrder(ResponseFromApi responseFromApi) {
		
		if(responseFromApi.getLength() % 2 != 0) {
			
			String fact = responseFromApi.getFact();
			System.out.println(fact);
			
			StringBuilder strb = new StringBuilder(fact);
			fact = strb.reverse().toString();
			System.out.println(fact);
			return fact;
			
		}
		return responseFromApi.getFact();
	}
	
}

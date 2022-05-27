package com.citi.cat.app.service.helper;

import com.citi.cat.app.service.response.ResponseFromApi;

public class ServiceHelper {

	public static String getTheCorrectOrder(ResponseFromApi responseFromApi) {
		
		// Evaluamos el resultado del módulo
		if(responseFromApi.getLength() % 2 != 0) {
			
			String fact = responseFromApi.getFact();
			// Le pasamos fact por el constructor a la clase StringBuilder
			StringBuilder strb = new StringBuilder(fact);
			// Utilizamos el método reverse() de la clase StringBuilder -> retorna StringBuilder
			// Pero utilizamos el método toString() para que retorne un String
			fact = strb.reverse().toString();
			return fact;
			
		}
		return responseFromApi.getFact();
	}
	
}

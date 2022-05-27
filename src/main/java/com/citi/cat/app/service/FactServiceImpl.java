package com.citi.cat.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.citi.cat.app.service.helper.ServiceHelper;
import com.citi.cat.app.service.response.FactResponse;
import com.citi.cat.app.service.response.ResponseFromApi;

@Service("factService")
public class FactServiceImpl implements FactService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public FactResponse getFactResponse() {

		// Creamos el objeto de respuesta
		FactResponse factResponse = new FactResponse();
		// Url a consular
		String url = "https://catfact.ninja/fact";

		try {
			
			// Obtenemos la respuesta de la Api y la guardamos en ResponseFromApi
			ResponseFromApi responseFromApi = restTemplate.getForObject(url, ResponseFromApi.class);
			// Hacemos los "set"
			factResponse.setResponse(ServiceHelper.getTheCorrectOrder(responseFromApi));
			factResponse.setMessage("Servicio finalizado correctamente");
			
		} catch (Exception e) {
			
			factResponse.setResponse("");
			factResponse.setMessage("Error al consultar Api");
			
		}

		return factResponse;
	}

}

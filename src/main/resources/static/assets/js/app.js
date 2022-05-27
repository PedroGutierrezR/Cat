$(document).ready(function() {

	// Llamada a función para desplegar un loading. (La función está al final)
	let loader = $("#loading-screen");
	configureLoadingScreen(loader);

	// Este evento va a escuchar el boton "Consultar Api" del jsp.
	$("#getFact").click(function() {

		// Ajax que solicita la información por método GET.
		$.ajax({
			type: "GET",
			dataType: "json",
			url: "/fact",
			contentType: 'application/json'
		})
			//Si todo sale bien entra a está función
			.done(function(data, textStatus, jqXHR) {
				console.log("La solicitud se ha completado correctamente.", data, textStatus, jqXHR);
				if (data.message == "Servicio finalizado correctamente") {
					swal({
						text: data.response,
						icon: "success"
					});
				} else {
					swal({
						text: data.message,
						icon: "error"
					});
				}
			})
			//Si algo sale mal entra a esta función.
			.fail(function(jqXHR, textStatus, errorThrown) {
				console.log("La solicitud a fallado: ", errorThrown, textStatus, jqXHR);
			})
	});

});

// Función que despliega un loading mientras se espera la respuesta desde la Api.
function configureLoadingScreen(loader) {
	$(document)
		.ajaxStart(function() {
			loader.fadeIn();
		})
		.ajaxStop(function() {
			loader.fadeOut();
		})
}

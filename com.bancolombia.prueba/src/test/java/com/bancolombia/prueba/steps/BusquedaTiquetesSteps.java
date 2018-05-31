package com.bancolombia.prueba.steps;

import java.util.List;

import com.bancolombia.prueba.pageobject.BusquedaTiquetesPage;

import net.thucydides.core.annotations.Step;

public class BusquedaTiquetesSteps {
	
	BusquedaTiquetesPage busquedaTiquetesPage;
	
	@Step
	public void ingreso_simulador(){
		//abrir página
		busquedaTiquetesPage.open();
		//gestionar información
		busquedaTiquetesPage.ingresoVuelos();
	}
	@Step
	public void seleccion_pasajeros() {
		busquedaTiquetesPage.numeroPasajeros();
	}
	
	@Step
	public void fechas_viaje() {
		busquedaTiquetesPage.fechasalida();
		busquedaTiquetesPage.fechaRegreso();
	}
	@Step
	public void gestion_ruta(List<List<String>> data, int id){
		busquedaTiquetesPage.origenVuelo(data.get(id).get(0).trim());
		busquedaTiquetesPage.destinoVuelo(data.get(id).get(1).trim());
	}
	@Step
	public void seleccionar_costos() {
		busquedaTiquetesPage.seleccionarCostos();
	}

}

package com.bancolombia.prueba.definitions;

import com.bancolombia.prueba.steps.BusquedaTiquetesSteps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.util.List;

public class BusquedaTiquetesDefinition {

	@Steps
	BusquedaTiquetesSteps busquedaTiquetesSteps;
	
	@Given("^Diligencio ingreso a pagina$")
	public void diligencio_ingreso_a_pagina() {
		busquedaTiquetesSteps.ingreso_simulador();
	}

	@When("^Diligencio formulario de busqueda$")
	public void diligencio_formulario_de_busqueda(DataTable dtDatosForm) {
		
		busquedaTiquetesSteps.seleccion_pasajeros();
		
		busquedaTiquetesSteps.fechas_viaje();
		
		List<List<String>> data=dtDatosForm.raw();
		for(int i=1; i<data.size(); i++) {
			busquedaTiquetesSteps.gestion_ruta(data, i);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {}	
		}
	}

	@Then("^Genero reporte externo$")
	public void genero_reporte_externo() {
		busquedaTiquetesSteps.seleccionar_costos();
	}
}

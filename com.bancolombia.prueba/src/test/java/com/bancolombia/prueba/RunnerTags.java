package com.bancolombia.prueba;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/BusquedaTiquetes.feature", tags = "@CasoExitoso")
public class RunnerTags {

}

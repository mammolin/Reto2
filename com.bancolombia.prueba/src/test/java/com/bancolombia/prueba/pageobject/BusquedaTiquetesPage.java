package com.bancolombia.prueba.pageobject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.openqa.selenium.Keys;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@DefaultUrl("https://www.despegar.com.co/")
public class BusquedaTiquetesPage extends PageObject {

	// ventana emergente
	@FindBy(xpath = "//*[@class='as-login-close as-login-icon-close-circled']")
	public WebElementFacade btnCerrarEmergente;

	// boton trayecto solo ida
	@FindBy(xpath = "//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[1]/form/span[2]/label/i")
	public WebElementFacade btnIda;

	// boton trayecto ida y vuelta
	// @FindBy(xpath="//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[1]/form/span[1]/label/i")
	// public WebElementFacade btnIdaRegreso;
	// Opción Vuelos
	@FindBy(xpath = "//SPAN[@class='nevo-header-navigation-menu-text'][text()='Vuelos']")
	public WebElementFacade urlVuelos;

	// label verificar seccion vuelos
	@FindBy(xpath = "//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[1]/div[1]/span")
	public WebElementFacade lblValidacion;

	// texto Origen
	@FindBy(xpath = "//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/input")
	public WebElementFacade txtOrigen;

	// texto Destino
	@FindBy(xpath = "//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/input")
	public WebElementFacade txtDestino;
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// fecha salida
	@FindBy(xpath = "//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]")
	public WebElementFacade lblFechaSalida;

	// datepiker salida
	@FindBy(xpath = "/html/body/div[4]/div/div[4]")
	public WebElementFacade dtpSalida;

	// mes Mayo salida
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[1]/div[1]/span[1]")
	public WebElementFacade lblMayoSalida;

	// mes Junio salida
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[2]/div[1]/span[1]")
	public WebElementFacade lblJunioSalida;

	// mes Julio salida
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[3]/div[1]/span[1]")
	public WebElementFacade lblJulioSalida;

	// mes Agosto salida
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[4]/div[1]/span[1]")
	public WebElementFacade lblAgostoSalida;

	// mes Septiembre salida
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[5]/div[1]/span[1]")
	public WebElementFacade lblSeptiembreSalida;

	// siguiente fecha
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div[2]")
	public WebElementFacade btnSiguienteFecha;
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// fecha regreso
	@FindBy(xpath = "//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/input")
	public WebElementFacade lblFechaRegreso;

	// datepiker regreso
	@FindBy(xpath = "/html/body/div[4]/div")
	public WebElementFacade dtpRegreso;

	// mes Mayo
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[5]/div[1]/span[1]")
	public WebElementFacade lblMayoRegreso;

	// mes Junio
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[5]/div[1]/span[1]")
	public WebElementFacade lblJunioRegreso;

	// mes Julio
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[5]/div[1]/span[1]")
	public WebElementFacade lblJulioRegreso;

	// mes Agosto
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[5]/div[1]/span[1]")
	public WebElementFacade lblAgostoRegreso;

	// mes Septiembre
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[5]/div[1]/span[1]")
	public WebElementFacade lblSeptiembreRegreso;

	// boton siguiente pantalla regreso
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div[2]")
	public WebElementFacade btnSigFechaRegreso;

	// boton dia regreso
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[5]/div[4]/span[29]")
	public WebElementFacade btnDiaRegreso;
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// boton día salida
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[5]/div[4]/span[1]")
	public WebElementFacade btnDiaSalida;

	// año salida
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[2]/div[1]/span[2]")
	public WebElementFacade lblAnoSalida;

	// campo pasajeros
	@FindBy(xpath = "//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/div[2]/div[6]/div[2]/div/input")
	public WebElementFacade btnPasajeros;

	// cantidad pasajeros
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div/input")
	public WebElementFacade lblCantidadPasajeros;

	// boton aumento # pasajeros
	@FindBy(xpath = "(//A[@class='steppers-icon-right sbox-3-icon-plus'])[11]")
	public WebElementFacade btnAumentar;

	// boton disminuye # pasajeros
	@FindBy(xpath = "//A[@class='steppers-icon-left sbox-3-icon-minus']")
	public WebElementFacade btnDisminuir;

	// boton buscar
	@FindBy(xpath = "//*[@id=\"searchbox-sbox-all-boxes\"]/div[2]/div/div/div[3]/div[2]/div[4]/div/a")
	public WebElementFacade btnBuscar;
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// label precio vuelos
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/span/fare/span/span/main-fare/span/span[2]/flights-price/span/flights-price-element/span/span/em/span[2]")
	public WebElementFacade lblPprecios;

	// contenedor lista de costos
	@FindBy(id = "clusters")
	// *[@id="clusters"]
	public WebElementFacade lblresultados;

	// verificiador de ciudad origen
	@FindBy(xpath = "//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/div/div/span")
	public WebElementFacade lblVerificaOrigen;

	// verificador ciudad destino
	@FindBy(xpath = "//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div/div/div/span[1]")
	public WebElementFacade lblVerificaDestino;
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// contenedor 1
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[1]/span/cluster/div")
	public WebElementFacade ctnContenedor1;

	// nombre vuelo 1
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li[1]/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")
	public WebElementFacade lblNombreUno;

	// precio vuelo 1
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span")
	public WebElementFacade lblPrecioUno;

	// contenedor 2
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[2]/span/cluster/div")
	public WebElementFacade ctnContenedor2;

	// nombre vuelo 2
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[2]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")
	public WebElementFacade lblNombreDos;

	// precio vuelo 2
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[2]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span")
	public WebElementFacade lblPrecioDos;

	// contenedor 3
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[3]/span/cluster/div")
	public WebElementFacade ctnContenedor3;

	// nombre vuelo 3
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[3]/span[1]/cluster/div/div/span/div/div/span[1]/route-choice/ul/li[1]/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")
	public WebElementFacade lblNombreTres;

	// precio vuelo 3
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[3]/span[1]/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span")
	public WebElementFacade lblPrecioTres;

	// contenedor 4
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[4]/span/cluster/div")
	public WebElementFacade ctnContenedor4;

	// nombre vuelo 4
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[4]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li[1]/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")
	public WebElementFacade lblNombreCuatro;

	// precio vuelo 4
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[4]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span")
	public WebElementFacade lblPrecioCuatro;

	// contenedor 5
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[5]/span/cluster/div")
	public WebElementFacade ctnContenedor5;

	// nombre vuelo 5
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[5]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")
	public WebElementFacade lblNombreCinco;

	// precio vuelo 5
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[5]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span")
	public WebElementFacade lblPrecioCinco;

	// contenedor 6
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[6]/span/cluster/div")
	public WebElementFacade ctnContenedor6;

	// nombre vuelo 6
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[6]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")
	public WebElementFacade lblNombreSeis;

	// precio vuelo6
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[6]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span")
	public WebElementFacade lblPrecioSeis;

	// contenedor 7
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[7]/span/cluster/div")
	public WebElementFacade ctnContenedor7;

	// nombre vuel 7
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[7]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")
	public WebElementFacade lblNombreSiete;

	// precio vuelo 7
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[7]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span")
	public WebElementFacade lblPrecioSiete;

	// contenedor 8
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[8]/span/cluster/div")
	public WebElementFacade ctnContenedor8;

	// nombre vuelo 8
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[8]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")
	public WebElementFacade lblNombreOcho;

	// precio vuelo 8
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[8]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span")
	public WebElementFacade lblPrecioOcho;

	// contenedor 9
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[9]/span/cluster/div")
	public WebElementFacade ctnContenedor9;

	// nombre vuelo 9
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[9]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")
	public WebElementFacade lblNombreNueve;

	// precio vuelo 9
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[9]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span")
	public WebElementFacade lblPrecioNueve;

	// contenedor 10
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[10]/span/cluster/div")
	public WebElementFacade ctnContenedor10;

	// nombre vuelo 10
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[10]/span/cluster/div/div/span/div/div/span[1]/route-choice/ul/li/route/itinerary/div/span/itinerary-element[2]/span/itinerary-element-airline/span/span/span/span[2]")
	public WebElementFacade lblNombreDiez;

	// precio vuelo 10
	@FindBy(xpath = "//*[@id=\"clusters\"]/span[10]/span/cluster/div/div/span/fare/span/span/div[1]/item-fare/p/span/flights-price/span/flights-price-element/span/span")
	public WebElementFacade lblPrecioDiez;

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void ingresoVuelos() {
		if (btnCerrarEmergente.isVisible() | btnCerrarEmergente.isDisplayed()) {
			btnCerrarEmergente.click();
		}
		urlVuelos.click();
		// verificar seccion correcta
		String strMensaje = lblValidacion.getText();
		assertThat(strMensaje, containsString("Encuentra tu Vuelo"));
	}

	public void numeroPasajeros() {
		btnPasajeros.click();
		btnAumentar.click();
		// String strMensaje =btnPasajeros.getText();
		// int cantidad =0;
		// cantidad = Integer.parseInt(strMensaje);
		// System.out.println("LA CANTIDAD DE PASAJEROS ES:"+cantidad);

	}

	public void fechasalida() {
		lblFechaSalida.click();
		if (dtpSalida.isVisible() | dtpSalida.isDisplayed()) {
			// System.out.println("vamos bien");
			if (lblMayoSalida.isVisible() | lblMayoSalida.isDisplayed()) {
				//System.out.println("entró al IF mayo");
				btnSiguienteFecha.click();
				if (lblJunioSalida.isVisible() | lblJunioSalida.isDisplayed()) {
					//System.out.println("entró al IF junio");
					btnSiguienteFecha.click();
					if (lblJulioSalida.isVisible() | lblJulioSalida.isDisplayed()) {
						//System.out.println("entró al IF julio");
						btnSiguienteFecha.click();
						if (lblAgostoSalida.isVisible() | lblAgostoSalida.isDisplayed()) {
							//System.out.println("entró al IF agosto");
							btnSiguienteFecha.click();
							if (lblSeptiembreSalida.isVisible() | lblSeptiembreSalida.isDisplayed()) {
								//System.out.println("entró al IF Septiembre");
								String dato = "";
								dato = btnDiaSalida.getText();
								int datoInt = 0;
								datoInt = Integer.parseInt(dato);
								//System.out.println(datoInt);
								if (datoInt == 1) {
									btnDiaSalida.click();
								}
							}
						}
					}
				}
			}
			//System.out.println("salió de los IF");
			// String dato="";
			// dato = lblJunioSalida.getText();
			// System.out.println(dato);
			//
			// String dato2="";
			// dato2 = lblAnoSalida.getText();
			// System.out.println(dato2);
			//
			//
			//
			// String dato3="";
			// dato = lblJunioSalida.getText();
			// System.out.println(dato);
			//
			// String dato4="";
			// dato2 = lblAnoSalida.getText();
			// System.out.println(dato2);
		} else if (lblJunioSalida.isVisible() | lblJunioSalida.isDisplayed()) {
			System.out.println("entró al IF junio");
			btnSiguienteFecha.click();
			if (lblJulioSalida.isVisible() | lblJulioSalida.isDisplayed()) {
				//System.out.println("entró al IF julio");
				btnSiguienteFecha.click();
				if (lblAgostoSalida.isVisible() | lblAgostoSalida.isDisplayed()) {
					//System.out.println("entró al IF agosto");
					btnSiguienteFecha.click();
					if (lblSeptiembreSalida.isVisible() | lblSeptiembreSalida.isDisplayed()) {
						//System.out.println("entró al IF Septiembre");
						String dato = "";
						dato = btnDiaSalida.getText();
						int datoInt = 0;
						datoInt = Integer.parseInt(dato);
						//System.out.println(datoInt);
						if (datoInt == 1) {
							btnDiaSalida.click();
						}
					}
				}
			}
		}
	}

	public void fechaRegreso() {
		if (dtpRegreso.isVisible() | dtpRegreso.isDisplayed()) {
			//System.out.println("vamos bien regreso");

			if (lblSeptiembreRegreso.isVisible() | lblSeptiembreRegreso.isDisplayed()) {
				//System.out.println("entró al IF Septiembre");
				String dato = "";
				dato = btnDiaRegreso.getText();
				int datoInt = 0;
				datoInt = Integer.parseInt(dato);
				//System.out.println(datoInt);
				if (datoInt == 29) {
					btnDiaRegreso.click();
				}
			}
			//System.out.println("salió de los IF regreso");
		}
	}

	public void origenVuelo(String dato) {
		String dato2 = "";
		txtOrigen.click();
		txtOrigen.clear();
		txtOrigen.typeAndEnter(dato);
		// txtOrigen.sendKeys(dato);
		// txtOrigen.sendKeys(Keys.ENTER)
		txtOrigen.click();
		dato2 = txtOrigen.getText();
		//System.out.println(dato2);
		if (dato2 == "") {
			txtOrigen.click();
			txtOrigen.typeAndEnter(dato);
		}
		txtOrigen.click();
		txtOrigen.waitUntilClickable();
	}

	public void destinoVuelo(String dato) {
		txtDestino.click();
		txtDestino.waitUntilClickable();
		txtDestino.click();
		txtDestino.clear();
		txtDestino.typeAndEnter(dato);
		txtDestino.click();
		
		// txtDestino.sendKeys(dato);
		// txtDestino.sendKeys(Keys.ENTER);
		btnBuscar.click();
	}

	public void seleccionarCostos() {
		if (lblresultados.isVisible() | lblresultados.isDisplayed()) {
			
			System.out.println("entramos a búsqueda de precios");
			
			if (ctnContenedor1.isDisplayed()) {
				String nombreUno = "";
				nombreUno = lblNombreUno.getText();

				String precioUno = "";
				precioUno = lblPrecioUno.getText();
				System.out.println(nombreUno + " " + precioUno);
			}
			if (ctnContenedor2.isDisplayed()) {
				String nombreDos = "";
				nombreDos = lblNombreDos.getText();

				String precioDos = "";
				precioDos = lblPrecioDos.getText();
				System.out.println(nombreDos + " " + precioDos);
			}
			if (ctnContenedor3.isDisplayed()) {
				String nombreTres = "";
				nombreTres = lblNombreTres.getText();

				String precioTres = "";
				precioTres = lblPrecioTres.getText();
				System.out.println(nombreTres + " " + precioTres);
			}
			if (ctnContenedor4.isDisplayed()) {
				String nombreCtr = "";
				nombreCtr = lblNombreCuatro.getText();

				String precioCtr = "";
				precioCtr = lblPrecioCuatro.getText();
				System.out.println(nombreCtr + " " + precioCtr);
			}
			if (ctnContenedor5.isDisplayed()) {
				String nombreCnco = "";
				nombreCnco = lblNombreCinco.getText();

				String precioCnco = "";
				precioCnco = lblPrecioCinco.getText();
				System.out.println(nombreCnco + " " + precioCnco);
			}
			if (ctnContenedor6.isDisplayed()) {
				String nombreSeis = "";
				nombreSeis = lblNombreSeis.getText();

				String precioSeis = "";
				precioSeis = lblPrecioSeis.getText();
				System.out.println(nombreSeis + " " + precioSeis);
			}
			if (ctnContenedor7.isDisplayed()) {
				String nombreSiete = "";
				nombreSiete = lblNombreSiete.getText();

				String precioSiete = "";
				precioSiete = lblPrecioSiete.getText();
				System.out.println(nombreSiete + " " + precioSiete);
			}
			if (ctnContenedor8.isDisplayed()) {
				String nombreOcho = "";
				nombreOcho = lblNombreOcho.getText();

				String precioOcho = "";
				precioOcho = lblPrecioOcho.getText();
				System.out.println(nombreOcho + " " + precioOcho);
			}
			if (ctnContenedor9.isDisplayed()) {
				String nombreNve = "";
				nombreNve = lblNombreNueve.getText();

				String precioNve = "";
				precioNve = lblPrecioNueve.getText();
				System.out.println(nombreNve + " " + precioNve);
			}
			if (ctnContenedor10.isDisplayed()) {
				String nombreDiez = "";
				nombreDiez = lblNombreDiez.getText();

				String precioDiez = "";
				precioDiez = lblPrecioDiez.getText();
				System.out.println(nombreDiez + " " + precioDiez);
			}
		}
	}
}

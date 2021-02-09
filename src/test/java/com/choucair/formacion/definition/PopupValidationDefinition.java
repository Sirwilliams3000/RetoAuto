package com.choucair.formacion.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PopupValidationDefinition {

	@Given("^Seleccionar la opcion Hoteles$")
	public void seleccionar_la_opcion_Hoteles() {
	   	    
	}

	@Given("^Seleccionar cualquier destino$")
	public void seleccionar_cualquier_destino() {
	    
	}

	@Given("^Ingresar la fecha de Check In \"([^\"]*)\"$")
	public void ingresar_la_fecha_de_Check_In(String txtFechain) {
	    
	}

	@Given("^Ingresar la fecha de Check Out \"([^\"]*)\"$")
	public void ingresar_la_fecha_de_Check_Out(String txtfechaout) {
	   
	}

	/*@Given("^Selecciona (\\d+) Adultos$")
	public void selecciona_Adultos(int arg1) {
	
	}

	@Given("^Seleccionar (\\d+) Niños$")
	public void seleccionar_Niños(int arg1) {
	  
	}*/

	@Given("^Seleccionar la opcion Buscar$")
	public void seleccionar_la_opcion_Buscar() { 
	}

	@When("^No se este logueado$")
	public void no_se_este_logueado() {
	    // Escriba aquí el código que convierta la frase anterior en acciones concretas
	}

	@Then("^Verificar caso fallido$")
	public void verificar_caso_fallido() {
	}

}


/*public class PopupValidationDefinition {
	
	@Steps
	PopupValidationSteps popupValidationSteps;

	@Given("^Autentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_y_clave(String Usuario, String Clave) {
		popupValidationSteps.login_colorlib(Usuario, Clave);
	}

	@Given("^Ingreso a la funcionalidad Forms Validation$")
	public void ingreso_a_la_funcionalidad_Forms_Validation() {
		popupValidationSteps.ingresar_form_validation();
	}

	@When("^Diligencio el formulario Popup Validation$")
	public void diligencio_el_formulario_Popup_Validation() {
	}

	@Then("^Verifico Ingreso exitoso$")
	public void verifico_Ingreso_exitoso() {
	
}
} */

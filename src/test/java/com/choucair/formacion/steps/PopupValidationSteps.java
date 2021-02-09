package com.choucair.formacion.steps;

//import static org.hamcrest.Matchers.containsString;
//import static org.hamcrest.MatcherAssert.assertThat;


import com.choucair.formacion.pageobjects.ColorlibMenuPage;
import com.choucair.formacion.pageobjects.colorlibLoginPage;
import net.thucydides.core.annotations.Step;


public class PopupValidationSteps {
	
	colorlibLoginPage  colorlibLoginPage;
	ColorlibMenuPage   ColorlibMenuPage;
	
	@Step
	public void login_colorlib(String strUsuraio, String strPass) {
//		a. Abrir navegador con la url de prueba 
		colorlibLoginPage.open();
/*		b. Ingresar usuario demo 
		c. Ingresar password demo 
		d. Click en botón Sign in */
		colorlibLoginPage.IngresarDatos (strUsuraio, strPass);
//		e. Verificar la Autenticación (label en home) 
		colorlibLoginPage.VerificaHome();

	}
@Step
public void ingresar_form_validation() {
	ColorlibMenuPage.menuFormValidation(); 
	//ColorlibMenuPage.menuForms.click();
	//ColorlibMenuPage.menuFormValidation.click();
	//String strMensaje = lblFormValidation.getText();
	//assertThat (strMensaje, containsString("Popup Validation"));
}

}
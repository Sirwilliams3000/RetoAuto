package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@Steps 
PopupReservSteps PopupReservSteps;

@DefaultUrl("https://www.phptravels.net/home")
public class InReservPage extends PageObject {

	//Selccion a destino
		@FindBy(xpath="//*[@id=\'s2id_autogen16\']/a/span[1]")
		public WebElementFacade txtDestination;
	//Ingresar fecha Check In
		@FindBy(xpath="//*[@id=\'checkin\']")
		public WebElementFacade txtFechain;
	//Ingresar fecha Check Out
		@FindBy(xpath="//*[@id=\'checkout\']")
		public WebElementFacade txtfechaout;
	//Seleccionar 2 adultos
		// No es necesario ya que su valor por default es 2
	//Seleccionar 0 niños
			// No es necesario ya que por default su valor es 0
	// Click en Buscar
		@FindBy(xpath="//*[@id=\'hotels\']/div/div/form/div/div/div[4]/button")
		public WebElementFacade btnSignIn;
		
		@FindBy(xpath="/html/body/div[1]/div/div/div[3]/a")
		public WebElementFacade lblpage;


	public void IngresarDatos(String strdestino, String strFechaIn, String strFechaOut) {
		txtDestination.sendKeys(strdestino);
		txtFechain.sendKeys(strFechaIn);
		txtfechaout.sendKeys(strFechaOut);
		btnSignIn.click();
	}
	public void VerificaLogin() {
		String Labelv = "Buy Now";
		String strMensaje = lblpage.getText();
		assertThat(strMensaje, containsString(Labelv));
	}
}


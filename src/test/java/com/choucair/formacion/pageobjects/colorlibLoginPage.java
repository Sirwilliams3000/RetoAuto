package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
//@DefaultUrl("https://dev2.alkomprar.com/emailVerification")
public class colorlibLoginPage extends PageObject{
	
//Campo usurio
	//@FindBy(xpath="//*[@id='login']/form/input[1]")
	@FindBy(xpath="//input[@placeholder='Username']")
	public WebElementFacade txtUsername;
//Campo Pass
	//@FindBy(xpath="//*[@id='login']/form/input[2]")
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElementFacade txtUPassword;
//Boton
	//@FindBy(xpath="//*[@id='login']/form/button")
	@FindBy(xpath="//button[@class='btn btn-lg btn-primary btn-block']")
	public WebElementFacade btnSignIn;
//Label del home a verificar
	@FindBy(xpath="//*[@id='bootstrap-admin-template']")
	public WebElementFacade lblHomePpal;
	
	public void IngresarDatos (String strUsurio, String strPass) {
		txtUsername.sendKeys(strUsurio);
		txtUPassword.sendKeys(strPass);
		btnSignIn.click();
	}
	public void VerificaHome() {
		String labelv = "Bootstrap-Admin-Template";
		String strMensaje = lblHomePpal.getText();
		assertThat(strMensaje, containsString(labelv));
	}
	}

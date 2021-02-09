package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.InReservPage;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.*;

public class PopupReservSteps {
	
	InReservPage InReservPage;
	
	@Step
//	a. Abrir el navegador con la URL destino
	InReservPage.open();
/*	b. Selcciona Hotel
	c. Selccion a destino
	d. Ingresar fecha Check In
	e. Ingresar fecha Check Out
	f. Seleccionar 2 adultos
	g. Seleccionar 0 niños
	h. Dar click en Buscar */
	InReservPage VerificaLogin(); 

}

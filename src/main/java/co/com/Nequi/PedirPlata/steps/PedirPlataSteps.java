package co.com.Nequi.PedirPlata.steps;

import java.util.List;

import org.openqa.selenium.WebElement;

import co.com.Nequi.PedirPlata.pages.PedirPlataPages;
import net.thucydides.core.annotations.Step;

public class PedirPlataSteps {

	PedirPlataPages PedirPlataPages;
	
	public WebElement lblNombre;
	public List<WebElement> Contraseña;
	public WebElement Reconocimiento;
	public WebElement ReconocimientoFacial;
	public WebElement Transacciones;
	public WebElement PedirPlata;
	public WebElement Mandar;
	public WebElement Realizar;
	public WebElement Solicitud;
	public WebElement Seleccionar;
	public WebElement Aceptar;
	

	@Step
	public void OpenPage() {
		System.out.println("Successfully completed the test");
	}
	
	@Step
	public void clicNombre() {
		lblNombre = PedirPlataPages.getLblNombre();
		lblNombre.click();
	}
	
	@Step
	public void clicContraseña() {
		Contraseña = PedirPlataPages.getContraseña();
		seleccioarnumero("1");
		seleccioarnumero("2");
		seleccioarnumero("3");
		seleccioarnumero("4");
	}
	
	public void seleccioarnumero(String num) {
		for (int i = 0; i < Contraseña.size(); i++) {
			System.out.println(Contraseña.get(i).getText());
			if (Contraseña.get(i).getText().equals(num)) {
				Contraseña.get(i).click();
				break;
			}
		}}
		
		
		@Step
		public void clicReconocimiento() {
			System.out.println("Reconocimientos");
			Reconocimiento = PedirPlataPages.getReconocimiento();
			Reconocimiento.click();
			
		}
		
		@Step
		public void clicReconocimientoFacial() {
			System.out.println("ReconocimientoFacial");
			ReconocimientoFacial = PedirPlataPages.getReconocimientoFacial();
			ReconocimientoFacial.click();
	}
		@Step
		public void clicTransacciones() {
			System.out.println("Transacciones");
			Transacciones = PedirPlataPages.getTransacciones();
			Transacciones.click();
		
		}
		@Step
		public void clicPedir() {
			System.out.println("Pide");
			PedirPlata = PedirPlataPages.getPide();
			PedirPlata.click();
	
		}
		@Step
		public void clicMandar() {
			System.out.println("A quien le Pide");
			Mandar = PedirPlataPages.getMandar();
			Mandar.click();
		}
		@Step
		public void clicSeleccionar() {
			System.out.println("Seleccionar");
			Seleccionar = PedirPlataPages.getSeleccionar();
			Seleccionar.click();
			
		}
		@Step
		public void clicAceptar() {
			System.out.println("Seleccionar");
			Aceptar = PedirPlataPages.getAceptar();
			Aceptar.click();
			
		}
		@Step
		public void clicRealizar() {
			System.out.println("Cuanto");
			Realizar = PedirPlataPages.getRealizar();
			Realizar.sendKeys("50");
		}
		@Step
		public void clicSolicitud() {
			System.out.println("Mensaje");
			Solicitud = PedirPlataPages.getSolicitud();
			Solicitud.click();
}}


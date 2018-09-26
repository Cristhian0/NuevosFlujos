package co.com.Nequi.PedirPlata.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;

public class PedirPlataPages extends PageObject {

	@FindBy(className = "android.widget.Button")
	private WebElement lblNombre;

	@FindBy(className = "android.widget.Button")
	private List<WebElement> Contraseña;

	@FindBy(xpath = "//*[@text='Reconocimiento facial Tu cara es solo tuya y con ella evitas que alguien entre a tu cuenta. ']")
	private WebElement Reconocimiento;

	@FindBy(xpath = "//*[@text='Ahora no ']")
	private WebElement ReconocimientoFacial;

	@FindBy(xpath = "//*[@text='index']")
	private WebElement Transacciones;

	@FindBy(xpath = "//*[@text='Pide']")
	private WebElement Pedir;
	
	@FindBy(xpath = "//*[@text='+']")
	private WebElement Mandar;
	
	@FindBy(xpath = "//*[@text='Nequi Qa ']")
	private WebElement Seleccionar;
	
	@FindBy(xpath = "//*[@text='']")
	private WebElement Aceptar;
	
	@FindBy(className ="android.widget.EditText")
	private WebElement Realizar;
	
	@FindBy(xpath = "//*[@text='Pedir']")
	private WebElement Solicitud;
	
	

	public WebElement getLblNombre() {
		return lblNombre;
	}

	public List<WebElement> getContraseña() {
		return Contraseña;
	}

	public WebElement getReconocimiento() {

		return Reconocimiento;
	}

	public WebElement getReconocimientoFacial() {
		return ReconocimientoFacial;
	}

	public WebElement getTransacciones() {
		return Transacciones;

	}

	public WebElement getPide() {
		return Pedir;
	}

	public WebElement getMandar() {
		return Mandar;
	}

	public WebElement getRealizar() {
		return Realizar;
	}

	public WebElement getSolicitud() {
		return Solicitud;
	}

	public WebElement getSeleccionar() {
		return Seleccionar;
	}

	public WebElement getAceptar() {
		return Aceptar;
	}

}

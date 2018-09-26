package co.com.Nequi.PedirPlata.stepDefinitions;

import co.com.Nequi.PedirPlata.steps.PedirPlataSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class I_want_to_use_this_template_for_my_feature_file_stepDefinition {

	@Steps
	PedirPlataSteps PedirPlataSteps;

	@Given("^I want to write a step with preconditions$")
	public void iWantToWriteAStepWithPrecondition() throws Exception {
		PedirPlataSteps.OpenPage();
	}

	@When("^Completar acciones$")
	public void iCompleteAction() throws Exception {
		PedirPlataSteps.clicNombre();
	}
	
	@And("^otras acciones$")
	public void iCompleteActio() throws Exception {
		PedirPlataSteps.clicContraseña();
	}
	
	@And("^Autentificacion$")
	public void iCompleteActio1() throws Exception {
		PedirPlataSteps.clicReconocimiento();
	}
	
	@And("^Aprovar la forma facial$")
	public void iCompleteActio2() throws Exception {
		PedirPlataSteps.clicReconocimientoFacial();
	}
	
	@And("^Transaccion$")
	public void iCompleteActio3() throws Exception {
		PedirPlataSteps.clicTransacciones();
	}
	@And("^PedirPlara$")
	public void iCompleteActio4() throws Exception {
		PedirPlataSteps.clicPedir();
	}

	@And("^A quien le vas a pedir$")
	public void iCompleteActio5() throws Exception {
		PedirPlataSteps.clicMandar();
	}
	
	@And("^Seleccionar el cliente a quien deseo Pedirle$")
	public void iCompleteActio6() throws Exception {
		PedirPlataSteps.clicSeleccionar();
	}
	
	@And("^Aceptar$")
	public void iCompleteActio9() throws Exception {
		PedirPlataSteps.clicAceptar();
	}
	@And("^Cuanto le vas a pedir$")
	public void iCompleteActio7() throws Exception {
		PedirPlataSteps.clicRealizar();
	}
	@And("^Que mensaje le quieres enviar$")
	public void iCompleteActio8() throws Exception {
		PedirPlataSteps.clicSolicitud();
	}
	
	@Then("^Valido$")
	public void iValidateTheOutcomes() throws Exception {
		System.out.println("listo");
	}

//clic
	
	
//			@Given("^Quiero ingresar un paso con la precondición$")
//			public void quiero_ingresar_un_paso_con_la_precondición() throws Exception {
//			CineSteps.OpenPage();
//		}
//		
//			@When("^Completo la accion$")
//			public void completo_la_accion() throws Exception {
//			CineSteps.clicContraseña();
//		}
//		
//			@Then("^Valido$")
//			public void valido() throws Exception {
//			System.out.println("listo");
//		}
}


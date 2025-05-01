package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.*;

public class FreeRangeSteps {
    SoftAssert soft = new SoftAssert();
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCompraCurso compraCursoPage = new PaginaCompraCurso();
    PaginaRegistro registro = new PaginaRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section){
        landingPage.clickOnSectionNavigationBar(section);
    }

    @When("^(?:I|The user|The client) (?:go|goes) to select plan web$")
    public void navigationToPlansSelector(){
        landingPage.clickElegirPlan();
    }

    @Then("^(?:I|The user|The client) can validate the options in the checkout options$")
    public void validateCheckoutPlans(){
        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.00 / mes • 14 productos","Academia: $176 / año • 14 productos","Free: Gratis • 3 productos");
        soft.assertEquals(lista, listaEsperada);
        soft.assertAll();
    }

    public void Ejemplulis() {
        String palabraEsperada = "Pepe";
        String palabraEncontrada = "Papa";
 
        // Soft Assertions: No detienen la ejecución al fallar. Ideal para verificar
        // muchas cosas pequeñas a la vez.
        soft.assertEquals(palabraEsperada, palabraEncontrada);
        soft.assertTrue(palabraEncontrada.contains(palabraEsperada));
        soft.assertNotEquals(palabraEncontrada,palabraEsperada);
 
        soft.assertAll();
 
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeRangeTest {
    private WebDriver driver;
    
    @BeforeMethod
    public void setUp(){
        //Inicializa el webdriver para chrome
        System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\edge\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    @Test
    public void navegamosAFreeRangeTesters(){
        //Navegamos a la pagina web
        driver.get("https://www.freerangetesters.com");
    }

    @AfterMethod
    public void tearDown(){
        //Cierra el navegador despues de la prueba
        if (driver != null){
            driver.quit();
        }
    }
}

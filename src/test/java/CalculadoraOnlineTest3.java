import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/****************************************/
// Historia de Usuario:
// Como usuario de la calculadora en línea,
// quiero poder ingresar una división con cero
// para recibir una indicación de que la operación no es válida.
//
// Prueba de Aceptación: Verificar que se muestre un mensaje indicando que la división entre cero no es una operación válida.
//
// Caso de Prueba 3:
// Título: División entre cero y cero
// Precondiciones:
// El usuario tiene que tener conexión a Internet.
// El usuario tiene que haber ingresado a la página de la calculadora en línea.
//
// Pasos:
// 1. Ingresar a la página de la calculadora en línea.
// 2. Presionar el número cero en el campo de la calculadora.
// 3. Presionar el botón de división.
// 4. Ingresar nuevamente el número cero en el campo de la calculadora.
// 5. Presionar el botón de igual.
//
// Resultado Esperado: La calculadora debe mostrar un mensaje de error 'Not a Number' para indicar que la operación de división entre cero no es válida.
/****************************************/

public class CalculadoraOnlineTest3 {

    private WebDriver driver;

    @BeforeTest
    public void setDriver() throws Exception{
        String path = "C:/Users/micae/Downloads/chromedriver-win64/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void verificarDivisionEntreCero(){

        /********** Preparación de la prueba **********/

    	//1. Ingresar a la página de la calculadora en línea
        String calculadoraUrl = "https://www.onlinerekenmachine.com/es/calculadora";
        driver.get(calculadoraUrl);

        /*********** Lógica de la prueba ***********/

        //2. Presionar el número cero en el campo de la calculadora
        WebElement numeroCero1 = driver.findElement(By.xpath("/html/body/main/section[2]/div/div/form/div[6]/input[2]"));
        numeroCero1.click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        //3. Presionar el botón de división
        WebElement botonDivision = driver.findElement(By.xpath("/html/body/main/section[2]/div/div/form/div[3]/input[5]"));
        botonDivision.click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        //4. Ingresar nuevamente el número cero en el campo de la calculadora
        WebElement numeroCero2 = driver.findElement(By.xpath("/html/body/main/section[2]/div/div/form/div[6]/input[2]"));
        numeroCero2.click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        //5. Presionar el botón de igual
        WebElement botonIgual = driver.findElement(By.xpath("/html/body/main/section[2]/div/div/form/div[7]/input"));
        botonIgual.click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch(Exception e) {
            System.out.println(e);
        }

        /************ Verificación de la situación esperada ***************/
        // Verificar que se muestre el mensaje de error 'Not a Number'
        WebElement mensajeError = driver.findElement(By.id("display"));
        String resultadoObtenido = mensajeError.getAttribute("value");
        String resultadoEsperado = "Not a Number";

        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @AfterTest
    public void closeDriver() throws Exception{
        driver.quit();
    }
}

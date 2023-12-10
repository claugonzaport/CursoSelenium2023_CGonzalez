package codigo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
    public static void main(String[] args) throws InterruptedException{

        String RutaProyecto =System.getProperty("user.dir");
        String rutaDrive= RutaProyecto+ "\\src\\test\\resources\\drivers\\chromedriver.exe";

    //enlazar el driver via properties
        System.setProperty("webdriver.chrome.driver",rutaDrive);

        //instanciar objetps para emular el browser
        //WebDriver driver = new ChromeDriver();
        // driver.get("https://google.cl");
//Instanciar objetos para emular el browser
        WebDriver driver = new ChromeDriver();

        //Crear el ejecutor de javascript para el scrolling via evento
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.bci.cl/personas");

        Thread.sleep(2000);

        //Localizador (By) es una forma de localizar los elementos web de un sitio
        //Existen 8 estrategias de busqueda:
        // ID,className, Name, tagname, linktext, partialLinktext, xpath(Relativo/Absoluto),cssSelector

        //By
        By localizadorBtnHazteCliente = By.xpath("//button[contains(text(),'Hazte Cliente')]");

        //Elemento Web (Botón, txt, dropDownList, label, link, etc)
        WebElement btnHazteCliente = driver.findElement(localizadorBtnHazteCliente);

        btnHazteCliente.click();

        Thread.sleep(1000);
        Thread.sleep(1000);

        //driver.findElement(By.xpath("//button[@data-slide='next']")).click();

        //Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Abrir cuenta')]")).click();
      // driver.findElement(By.xpath("//button[contains(text(),'Abrir cuenta')]")).click();



    }
}

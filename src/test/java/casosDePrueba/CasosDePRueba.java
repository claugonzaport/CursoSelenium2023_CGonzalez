package casosDePrueba;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class CasosDePRueba {
    //Atributos
    WebDriver driver;
    JavascriptExecutor js;
    String rutaProyecto = System.getProperty("user.dir");

    String rutaDriver = rutaProyecto + "\\src\\test\\resources\\drivers\\chromedriver.exe";
    @BeforeEach
    public void preCondiciones(){
        System.setProperty("webdriver.chrome.driver", rutaDriver);
        driver = new ChromeDriver();

        js = (JavascriptExecutor) driver;

        driver.get("https://www.cajalosandes.cl/");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();
    }
    @AfterEach
    public void posCondiciones(){
        driver.quit();
    }

    @Test
    public void CP001_mostrar_SomosAndes() throws InterruptedException {


        By localizadorSeguro = By.xpath("//p[contains(text(),'Somos Andes')]");

        WebElement btnSeguro = driver.findElement(localizadorSeguro);

        btnSeguro.click();

        //By titulo = By.xpath("//h1[contains(text(),'Somos Andes')]");
       // WebElement tit = driver.findElement(titulo);
        WebElement element = driver.findElement(By.xpath("//h1[contains(text(),'Somos Andes')]"));
        boolean status = element.isDisplayed();

        Assertions.assertEquals(true, status);
    }

////
    @Test
    public void CP002_gestionar_beneficios() throws InterruptedException {


    By localizadorTrabajador = By.xpath("//p[contains(text(),'Trabajadores')]");

    WebElement btnTrabajador = driver.findElement(localizadorTrabajador);

    btnTrabajador.click();

    By localizadorBeneficios = By.xpath("//span[contains(text(),'Beneficios para ti')]");

    WebElement btnbeneficios = driver.findElement(localizadorBeneficios);

    btnbeneficios.click();


    WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Salud')]"));
    boolean status = element.isDisplayed();

    Assertions.assertEquals(true, status);
}
    @Test
    public void CP003_pensionados() throws InterruptedException {


        By localizadorPensionados = By.xpath("//p[contains(text(),'Pensionados')]");

        WebElement btnPensionados = driver.findElement(localizadorPensionados);

        btnPensionados.click();

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Conoce tus beneficios en farmacia')]"));
        boolean status = element.isDisplayed();

        Assertions.assertEquals(true, status);
    }
//h1[@class='banner-page__main__content-title']
@Test
public void CP004_empresas() throws InterruptedException {


    By localizadorEmpresas = By.xpath("//p[contains(text(),'Empresas')]");

    WebElement btnEmpresas = driver.findElement(localizadorEmpresas);

    btnEmpresas.click();

    WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Novedades para ')]"));
    boolean status = element.isDisplayed();

    Assertions.assertEquals(true, status);
}
@Test
    public void CP005_mostrar_Exafiliados() throws InterruptedException {


        By localizadorExafiliados = By.xpath("//p[contains(text(),'Ex afiliados')]");

        WebElement btnExafiliados = driver.findElement(localizadorExafiliados);

        btnExafiliados.click();


        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Conoce Sigo Siendo Andes')]"));
        boolean status = element.isDisplayed();

        Assertions.assertEquals(true, status);
    }

}

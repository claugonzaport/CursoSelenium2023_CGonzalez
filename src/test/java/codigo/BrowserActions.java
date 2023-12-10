package codigo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class BrowserActions {
    public static void main(String[] args) throws InterruptedException{
    //String rutaDrive= "C:\\Testing\\Tarea_SelemiumBCI\\src\\test\\resources\\drivers\\chromedriver.exe";
        String RutaProyecto =System.getProperty("user.dir");
        String rutaDrive= RutaProyecto+ "\\src\\test\\resources\\drivers\\chromedriver.exe";

    //enlazar el driver via properties
        System.setProperty("webdriver.chrome.driver",rutaDrive);
        //instanciar objetps para emular el browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.cl");
        System.out.println("el titulp del sitio es " +driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().to("https://www.tsoftglobal.com");
        System.out.println("el titulp del sitio es " +driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.quit();





    }
}

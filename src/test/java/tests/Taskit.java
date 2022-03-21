package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Taskit {
    @Test
    public void LOGINTASKIT() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\roger.drumond\\Downloads\\API_Rest_Aula_Youtube\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();

        navegador.get("http://www.juliodelima.com.br/taskit/");

        navegador.findElement(By.id("signup")).click();
        navegador.findElement(By.name("name")).click();
        navegador.findElement(By.name("name")).sendKeys("VENOMROOGER DRUMOND");
        navegador.findElement(By.name("login")).click();
        navegador.findElement(By.name("login")).sendKeys("roger.macedodrumond@gmail.com");
        navegador.findElement(By.name("password")).click();
        navegador.findElement(By.name("password")).sendKeys("123456");
        navegador.findElement(By.xpath("//a[normalize-space()='Save']")).click();




        assertEquals(1,1);

        navegador.quit();

    }
}

package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;


public class SignTest {
    @Test
    public void testeFazerloginnoTaskit(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\roger.drumond\\Downloads\\API_Rest_Aula_Youtube\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        navegador.get("http://www.juliodelima.com.br/taskit");

        navegador.manage().window().maximize();

             navegador.findElement(By.linkText("Sign in")).click();

        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("julio0001");
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys("123456");

        navegador.findElement(By.linkText("SIGN IN")).click();

        String saudacao = navegador.findElement(By.className("me")).getText();


        assertEquals("Hi, Julio",saudacao);

        navegador.findElement(By.linkText("Logout")).click();

        navegador.quit();


    }
}

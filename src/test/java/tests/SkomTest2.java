package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

;

//Abrir o Navegador Chrome, Acessar o Menu de Contexto>>Administraçao>>Download do Log
public class SkomTest2 {
    @Test
    public void FazerLoginSKOM() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\roger.drumond\\Downloads\\API_Rest_Aula_Youtube\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.manage().window().maximize();

        //Automaçao de Teste Base Teste SKOM
        navegador.get("http://sdeteste.nuvemdatacom.com.br:9521/mge/");


        //Login com Usuario
        navegador.findElement(By.id("login")).sendKeys("SUP");
        navegador.findElement(By.id("password")).sendKeys("");


        //Botao 'Entrar'
        navegador.findElement(By.xpath("//*[contains(text(), 'Entrar')]")).click();

        Thread.sleep(20000);

        //Clicar no Menu de Contexto
        navegador.findElement(By.xpath("//div[@class='Taskbar-icon icon-user-photo']//img[@class='gwt-Image']")).click();

        //Clicar na opção Administraçao do menu de Contexto
        navegador.findElement(By.xpath("//span[normalize-space()='Administração']")).click();

        Thread.sleep(20000);

        //Encontrar o IFrame
        navegador.switchTo().frame(navegador.findElement(By.xpath("//iframe[@class='gwt-Frame']")));

        //Clicar no botao 'Download do Log'
        navegador.findElement(By.xpath("//span[normalize-space()='Download do Log']")).click();


        assertEquals(1,1);


    }


}
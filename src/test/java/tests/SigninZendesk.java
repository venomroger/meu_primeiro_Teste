package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class SigninZendesk {
    @Test
    public void LogarZendeskeregistrarticket() throws InterruptedException  {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\roger.drumond\\Downloads\\API_Rest_Aula_Youtube\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.manage().window().maximize();

        //Logar no Zendesk - Acess Normal
        navegador.get("https://sankhya.zendesk.com/access/normal");

        //Logar com usuario:
        navegador.switchTo().frame(navegador.findElement(By.xpath("//iframe[@scrolling='no']")));
        navegador.findElement(By.id("user_email")).sendKeys("roger.drumond@sankhya.com.br");
        navegador.findElement(By.id("user_password")).sendKeys("roger23");
        navegador.findElement(By.name("commit")).click();

        //Acessar Admin
        Thread.sleep(20000);
        navegador.findElement(By.xpath("//a[contains(@class,'admin_link')]")).click();
        Thread.sleep(3000);
       //Acessar Menu de Extensao
        navegador.findElement(By.cssSelector("a[href='/agent/admin/extensions']")).click();

        //Acessar o Icone avatar e fazer LOGOUT
        navegador.findElement(By.xpath("//figure[@class='StyledAvatar-sc-1ck6yn1-0 dxNwKx StyledAvatar-sc-1cov3o-1 fHtCrt sc-frDJqD gCfeTV']")).click();
        navegador.findElement(By.xpath("//li[@id='downshift-1-item-8']")).click();

        assertEquals(1,1);

    }
}

package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class thugnine {
    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\roger.drumond\\Downloads\\API_Rest_Aula_Youtube\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        navegador.manage().window().maximize();
        navegador.get("http://www.thugnine.com.br");

        navegador.findElement(By.id("txtBuscaPrincipal")).sendKeys("bone");
        navegador.findElement(By.id("btnBusca")).click();
        navegador.findElement(By.className("logoHome")).click();
        navegador.findElement(By.xpath("//a[normalize-space()='NOVA COLEÇÃO']")).click();
        navegador.findElement(By.xpath("//a[normalize-space()='ROUPAS']")).click();
        navegador.findElement(By.xpath("//a[normalize-space()='ACESSÓRIOS']")).click();
        navegador.findElement(By.xpath("//a[normalize-space()='HEADWEAR']")).click();
        navegador.findElement(By.xpath("//a[normalize-space()='BAZAR']")).click();
        navegador.findElement(By.className("logoHome")).click();
        navegador.findElement(By.xpath("//img[@alt='categoria - camisetas']")).click();
        navegador.findElement(By.className("logoHome")).click();
        navegador.findElement(By.xpath("//a[normalize-space()='SOBRE A THUG']")).click();
        //navegador.findElement(By.className("ytp-cued-thumbnail-overlay")).sendKeys(Keys.SPACE);

        navegador.close();

    }
}
//<iframe width="911" height="315" src="https://www.youtube.com/embed/X3uAshBxSf0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class apithiago {
    @Test

    public void main(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\roger.drumond\\Downloads\\API_Rest_Aula_Youtube\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        navegador.manage().window().maximize();

        navegador.get("https://studies-react.netlify.app/");

        String termobusca = "playstation";

        navegador.findElement(By.name("tarefa")).sendKeys(termobusca.toLowerCase());
        navegador.findElement(By.name("tempo")).sendKeys("000005");
        navegador.findElement(By.xpath("//button[normalize-space()='Adicionar']")).click();
        navegador.findElement(By.cssSelector(".Item_item__15APz")).click();
        navegador.findElement(By.xpath("//button[normalize-space()='Começar!']")).click();

        WebElement cursocompletado = navegador.findElement(By.className("Item_concluido__U1P7_"));


        navegador.quit();




    }
}

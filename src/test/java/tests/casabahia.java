package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class casabahia {
    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\roger.drumond\\Downloads\\API_Rest_Aula_Youtube\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        navegador.manage().window().maximize();
        navegador.get("http://www.mercadolivre.com.br");

        navegador.findElement(By.id("cb1-edit")).sendKeys("playstation");
        navegador.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement resultadoPesquisa = navegador.findElement(By.className("ui-search-result__content-wrapper"));
        String resultado = resultadoPesquisa.getText();
        resultado = resultado.toLowerCase();

        if(resultado.contains("panela") || resultado.contains("pressao") ) {
            System.out.println("Sucesso na Pesquisa");
        } else {
            System.out.println("Erro na Pesquisa");
            System.out.println("O resultado foi:" + resultado);
        }
        navegador.close();
        //assertEquals(1,1);
    }
}

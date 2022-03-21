package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test {
    WebDriver driver;


    @Before
    public void criardriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\roger.drumond\\Downloads\\API_Rest_Aula_Youtube\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.mercadolivre.com.br");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @Test
    public void acessarduvidas(){
        driver.findElement(By.linkText("Contato")).click();
    }

    @Test
    public void fazerbusca() {
        String termobusca = "playstation";

        driver.findElement(By.id("cb1-edit")).sendKeys(termobusca.toLowerCase());
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String result = driver.findElement(By.className("ui-search-result__content-wrapper")).getText();
        result = result.toLowerCase();

        boolean resultadoteste;

        if(result.contains(termobusca)) {
            System.out.println("Teste OK");
            resultadoteste = true;
        } else {
                System.out.println("Erro na busca");
                System.out.println("O resultado da busca foi" + result);
                resultadoteste = false;
            }

        Assert.assertTrue(resultadoteste);
        }


    @After
    public void fechardriver() {
        driver.close();
        driver.quit();
    }
}

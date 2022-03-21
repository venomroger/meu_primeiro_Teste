package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

;

//Abrir o Navegador Chrome, acessar base teste e cadastrar um produto
public class SkomTest {
    @Test
    public void FazerLoginSKOM() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\roger.drumond\\Downloads\\API_Rest_Aula_Youtube\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.manage().window().maximize();

        navegador.get("http://sdeteste.nuvemdatacom.com.br:9515/mge/");



        navegador.findElement(By.id("login")).sendKeys("SUP");
        navegador.findElement(By.id("password")).sendKeys("");



        navegador.findElement(By.xpath("//*[contains(text(), 'Entrar')]")).click();

        Thread.sleep(20000);

        //Acessar o Menu
        navegador.findElement(By.xpath("//div[@class='Taskbar-icon icon-menu']")).click();


        //Acessar 'Configurações'
        navegador.findElement(By.xpath("//body[1]/div[6]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]")).click();

        Thread.sleep(2000);

        navegador.findElement(By.cssSelector(".popupContent"));

        navegador.findElement(By.xpath("//div[contains(text(),'Cadastros')]")).click();
        Thread.sleep(2000);

        navegador.findElement(By.xpath("//body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]")).click();
        Thread.sleep(2000);

        navegador.findElement(By.xpath("//body[1]/div[7]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]")).click();

        Thread.sleep(20000);

        //Encontrar o IFrame
        navegador.switchTo().frame(navegador.findElement(By.xpath("//iframe[@class='gwt-Frame']")));

        navegador.findElement(By.xpath("//span[normalize-space()='Novo registro']")).click();

        Thread.sleep(10000);

        navegador.findElement(By.cssSelector("input[title='Preencha este campo.']")).sendKeys("AUTOMAÇAO TESTE ROGER");

        //navegador.findElement(By.xpath("//span[normalize-space()='Impostos']")).click();

        //navegador.findElement(By.cssSelector("Digite o código e tecle Enter")).sendKeys("03078300");

        navegador.findElement(By.xpath("//button[@ng-if='isShowSaveButton()']//span[@class='glyphicons glyphicons-ok-2']")).click();

        assertEquals(1,1);

        navegador.quit();

    }


}

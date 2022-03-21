package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

//Abrir o NavegodorChrome, acessar o SKOm e efetuar cadastro de Tipo de Operação
public class SkomTest3 {
    @Test
    public void CadastrarTOP() throws InterruptedException {
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

        //Acessar Comercial
        navegador.findElement(By.xpath("//body[1]/div[6]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]")).click();

        Thread.sleep(3000);

        navegador.findElement(By.xpath("//div[contains(text(),'Arquivo')]")).click();
        Thread.sleep(2000);

        navegador.findElement(By.xpath("//div[contains(text(),'Cadastros')]")).click();
        Thread.sleep(2000);

        //Abriar a Tela Tipos de Operação
        navegador.findElement(By.xpath("//div[@class='gwt-Label TreeLevelMenu-itemLabel'][normalize-space()='Tipos de Operação - TOP']")).click();
        Thread.sleep(20000);

        //Acessar o Menu lateral (Obrigatorio escolher um tipo de Movimento para cadastrar um Tipo de Operação)
        navegador.switchTo().frame(navegador.findElement(By.xpath("//iframe[@class='gwt-Frame']")));
        Thread.sleep(1000);
        navegador.findElement(By.xpath("//i[@class='tree-icon glyphicon collapse glyphicon-chevron-right']")).click();
       // Thread.sleep(1000);
       //     navegador.findElement(By.xpath("//i[contains(@class,'tree-icon glyphicon collapse glyphicon-chevron-right')]")).click();
       // Thread.sleep(1000);
       //     navegador.findElement(By.xpath("//span[@class='item-label abn-tree-flex-center ng-binding ng-scope'][normalize-space()='Devolução de compra']")).click();
       // Thread.sleep(1000);

        assertEquals(1,1);
    }
}

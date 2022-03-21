package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PedidoSKOM {
    @Test
    public void IncluirPedido() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\roger.drumond\\Downloads\\API_Rest_Aula_Youtube\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        navegador.get("http://sdeteste.nuvemdatacom.com.br:9515/mge/");
        navegador.findElement(By.id("login")).sendKeys("SUP");
        navegador.findElement(By.id("password")).sendKeys("");
        navegador.findElement(By.xpath("//*[contains(text(), 'Entrar')]")).click();

        //Acessar o Menu
        Thread.sleep(20000);
        navegador.findElement(By.xpath("//div[@class='Taskbar-icon icon-menu']")).click();
        navegador.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]")).click();
        navegador.findElement(By.xpath("//div[contains(text(),'Consulta')]")).click();
        navegador.findElement(By.xpath("//div[contains(text(),'Portal de Vendas')]")).click();

        //Encontrar o Iframe da Workspace-Portal de Vendas
        navegador.switchTo().frame(navegador.findElement(By.xpath("//iframe[@class='gwt-Frame']")));
        //navegador.findElement(By.xpath("//button[@id='btnNovoDocumento']//img")).click();


        //Aplicar Filtro-Portal de Vendas
        navegador.findElement(By.xpath("//button[normalize-space()='Aplicar']")).click();
        navegador.findElement(By.xpath("//span[@class='glyphicons glyphicons-duplicate']")).click();
        navegador.findElement(By.xpath("//button[normalize-space()='Confirmar']")).click();
        navegador.findElement(By.xpath("//button[normalize-space()='OK']")).click();






    }
}

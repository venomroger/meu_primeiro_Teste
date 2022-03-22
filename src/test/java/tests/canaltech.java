package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class canaltech {
    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\roger.drumond\\Downloads\\API_Rest_Aula_Youtube\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://canaltech.com.br/");

        driver.findElement(By.xpath("//a[@href='/video/']//div[@class='styles__ChipContainer-sc-h2xn3p-0 iiNSam']//span[@class='styles__ChipText-sc-h2xn3p-3 czzXnZ'][normalize-space()='ver tudo']")).click();
        //driver.findElement(By.xpath("//a[@class='col-xs-6 feature-item big']//div[@class='box cover-img-wrap txt-in']")).click();


        driver.quit();

    }
}

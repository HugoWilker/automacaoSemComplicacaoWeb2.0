package br.com.chronosacademy.automacaoWeb;

import br.com.chronosacademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeWeb {

    WebDriver driver;
    Driver driverWeb;

    @Before
    public void inicializaTeste() {
        driverWeb = new Driver("ie");
        driver = driverWeb.getDriver();

        driver.get("https://www.chronosacademy.com.br");
    }
    @Test

    public void primeiroTeste(){


        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();

        Assert.assertEquals("Porque Tempo É Conhecimento", titulo );


    }

    @After
     public void finalizaTest(){

        driver.quit();

   }


}

package br.com.ProjBasico.automacaoWeb;

import br.com.ProjBasico.core.Driver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class TesteWeb {

    WebDriver driver;
    Driver driverWeb;

@Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");

    }

    @Test
    public void primeiroTeste(){
        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento", titulo);

        driver.close();
    }


}

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
        driver.get("http://www.voeazul.com.br");

    }

    @Test
    public void primeiroTeste(){
        String xpathTitulo = "#spa-root > main > div > div.aem-page.AzulPage.page.basicpage > div > div.aem-container.aem-Grid.aem-Grid--12.aem-Grid--default--12 > div:nth-child(3) > div.aem-container.aem-Grid.aem-Grid--12.aem-Grid--default--12.aem-Grid--tablet--12.aem-Grid--phone--12 > div:nth-child(5) > div.container-capsule.containerDefault.css-1pkuz94 > div:nth-child(1) > div.text-container.css-1ig5eym > h2 > span";
        WebElement txtTitulo = driver.findElement(By.cssSelector(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Nossas melhores ofertas para você", titulo);

        driver.close();
    }


}

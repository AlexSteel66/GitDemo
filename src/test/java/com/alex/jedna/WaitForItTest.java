package com.alex.jedna;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForItTest {
//ssssss
WebDriver driver;
@Before
public void setUp(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("http://localhost/waitforit.php");

    }

@Test
public void MainTest(){
    Assert.assertEquals("WAIT FOR IT !", driver.findElement(By.xpath("//h1[contains(text(),'wait for it !')]")).getText());
    Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'wait for it !')]")).getText().contains("IT !"));

}
    @After
    public void teardown(){
        driver.close();
        driver.quit();
    }
}
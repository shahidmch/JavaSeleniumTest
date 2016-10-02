package com.asianweb.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

/**
 * Created by Rahul on 23-04-2016.
 */
public class BaseTest {

    protected WebDriver driver;
    protected String baseURL= "http://asianweb.me/packmeup/contact/";

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.navigate().to(baseURL);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();;
    }
}

package com.spartaglobal.demoqaselenium.DemoPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DroppablePage {

    private String URL;
    private WebDriver driver;
    private By moveFrom = By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div[1]");
    private By moveTo = By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div[2]");


    public DroppablePage(WebDriver driver, String url){
        this.driver = driver;
        this.URL = url;
    }

    public DroppablePage goToPage()
    {
        driver.navigate().to(URL);
        return this;
    }

    public int dragItem(){

        WebElement from = driver.findElement(moveFrom);

        WebElement to = driver.findElement(moveTo);
        Actions act = new Actions(driver);
        act.dragAndDrop(from,to).build().perform();
        int k = from.getLocation().getY();

        return k;
    }




}

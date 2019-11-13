package com.spartaglobal.demoqaselenium.DemoPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.net.URL;
import java.util.List;

public class SortablePage {

    private String URL;
    private WebDriver driver;
    private By twoPath = By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/ul/li[2]");
    private By sixPath = By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/ul/li[6]");


    public SortablePage(String url, WebDriver driver){
        this.URL = url;
        this.driver = driver;
    }

    public SortablePage goToPage()
    {
        driver.navigate().to(URL);
        return this;
    }

    public List<WebElement> sortItemsDown(){
        WebElement from = driver.findElement(twoPath);
        int movefrom = from.getLocation().getY();
        WebElement to = driver.findElement(sixPath);
        int moveTo = to.getLocation().getY();
        Actions act = new Actions(driver);

        int newYpositon = moveTo - movefrom + 1;
        act.dragAndDropBy(from,0,newYpositon).build().perform();

        List<WebElement> sorted = driver.findElements(By.id("sortable"));

        return sorted;
    }
    public List<WebElement> sortItemsUp(){
        WebElement from = driver.findElement(sixPath);
        int moveFrom = from.getLocation().getY();
        WebElement to = driver.findElement(twoPath);
        int moveTo = to.getLocation().getY();
        Actions act = new Actions(driver);

        int newYpositon = moveTo - moveFrom - 1;
        act.dragAndDropBy(from,0,newYpositon).build().perform();

        List<WebElement> sorted = driver.findElements(By.id("sortable"));

        return sorted;
    }




}

package com.spartaglobal.demoqaselenium.DemoPageObjects;

import com.spartaglobal.demoqaselenium.Config.SeleniumConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//*[@id="selectable"]

public class SelectablePage {

    private WebDriver driver;
    private String URL;
    private By selectableOptions = By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/ol");

    public SelectablePage(WebDriver driver, String url){
        this.driver = driver;
        this.URL = url;
    }

    public SelectablePage goToPage(){
        driver.navigate().to(URL);
        return this;
    }


    public SelectablePage goThroughSelectOptions(){
//        WebElement selectable = driver.findElement(selectableOptions);
//        Select select = new Select(selectable);
//        for (int i = 0; i < select.getOptions().size() ; i++) {
//            select.selectByIndex(i);
//            System.out.println(select.getFirstSelectedOption());
//            System.out.println(selectable.getAttribute("value"));
//        }

        List<WebElement> myList = driver.findElements(selectableOptions);

        for (WebElement item: myList) {
            System.out.println(item.getText());
            item.click();

        }

        return this;
    }







}

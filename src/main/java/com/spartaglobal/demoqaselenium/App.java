package com.spartaglobal.demoqaselenium;

import com.spartaglobal.demoqaselenium.Config.SeleniumConfig;
import com.spartaglobal.demoqaselenium.Config.URLCinfig;
import com.spartaglobal.demoqaselenium.DemoPageObjects.DroppablePage;
import com.spartaglobal.demoqaselenium.DemoPageObjects.SelectablePage;
import com.spartaglobal.demoqaselenium.DemoPageObjects.SortablePage;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {



        URLCinfig urlCinfig = new URLCinfig();
        SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "C:\\Users\\Adrian Odbierzychleb\\Downloads\\chromedriver.exe");
        SelectablePage selectablePage = new SelectablePage(seleniumConfig.getDriver(),urlCinfig.getBaseURL("selectable"));
        DroppablePage droppablePage = new DroppablePage(seleniumConfig.getDriver(),urlCinfig.getBaseURL("droppable"));
        SortablePage sortablePage = new SortablePage(urlCinfig.getBaseURL("sortable"), seleniumConfig.getDriver());
        List<WebElement> list = sortablePage.goToPage().sortItemsUp();
        for (WebElement ele: list) {
            System.out.println(ele.getText());
        }


    }
}

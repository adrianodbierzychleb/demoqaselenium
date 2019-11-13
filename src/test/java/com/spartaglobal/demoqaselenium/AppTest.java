package com.spartaglobal.demoqaselenium;

import static org.junit.Assert.assertTrue;

import com.spartaglobal.demoqaselenium.Config.SeleniumConfig;
import com.spartaglobal.demoqaselenium.Config.URLCinfig;
import com.spartaglobal.demoqaselenium.DemoPageObjects.DroppablePage;
import com.spartaglobal.demoqaselenium.DemoPageObjects.SortablePage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private static SortablePage sortablePage;
    private static DroppablePage droppablePage;

    @BeforeClass
    public static void setup(){
        URLCinfig urlCinfig = new URLCinfig();
        SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "C:\\Users\\Adrian Odbierzychleb\\Downloads\\chromedriver.exe");
        sortablePage = new SortablePage(urlCinfig.getBaseURL("sortable"),seleniumConfig.getDriver());
        droppablePage = new DroppablePage(seleniumConfig.getDriver(),urlCinfig.getBaseURL("droppable"));
    }

    @Test
    public void droppableTest(){
        int expected = 354;
        Assert.assertEquals(expected,droppablePage.goToPage().dragItem());
    }


    @Test
    public void sortableTestUp()
    {
        String expected = "Item 1\nItem 6\nItem 2\nItem 3\nItem 4\nItem 5\nItem 7";
        Assert.assertEquals(expected,sortablePage.goToPage().sortItemsUp().get(0).getText());
    }

    @Test
    public void sortableTestDown(){
        String expected = "Item 1\nItem 3\nItem 4\nItem 5\nItem 6\nItem 2\nItem 7";
        Assert.assertEquals(expected,sortablePage.goToPage().sortItemsDown().get(0).getText());
    }
}

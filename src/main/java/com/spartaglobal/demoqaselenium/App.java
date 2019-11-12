package com.spartaglobal.demoqaselenium;

import com.spartaglobal.demoqaselenium.Config.SeleniumConfig;
import com.spartaglobal.demoqaselenium.Config.URLCinfig;
import com.spartaglobal.demoqaselenium.DemoPageObjects.SelectablePage;

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




    }
}

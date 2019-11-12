package com.spartaglobal.demoqaselenium.Config;

public class URLCinfig {

    private String baseURL = "http://demoqa.com/";


    public String getBaseURL(String challenge)
    {
        return baseURL + challenge;
    }

}

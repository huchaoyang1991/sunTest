package com.sun.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by huchaoyang on 2018/9/24.
 */
public class TestDemoUI2 {
    @Test
    public void test1(){
        String str="";
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("url");
        WebElement ele=webDriver.findElement(By.id("aaa"));
        Object object=new Object();
        Matcher m= Pattern.compile(""+"(\\d+)"+"").matcher("");
        if(m.find())
             str=m.group(1);
        System.out.println();
    }
}

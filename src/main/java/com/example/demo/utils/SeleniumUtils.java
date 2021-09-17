package com.example.demo.utils;

import lombok.extern.slf4j.Slf4j;
/*
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
*/

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class SeleniumUtils {
    public static String driverPath="D:\\data\\chromedriver.exe";

    static {
        boolean isWin = System.getProperty("os.name").toLowerCase().indexOf("win") >= 0;
        boolean isLinux = System.getProperty("os.name").toLowerCase().indexOf("linux") >= 0;
        if(isWin){
            driverPath="D:\\data\\chromedriver.exe";
        }else if(isLinux){
            driverPath="/root/chromedriver";
        }
    }

    public static void createImages(String urlPath,String savePath){
        System.setProperty("webdriver.chrome.driver",driverPath);
/*
        //手机
        //创建无Chrome无头参数
        ChromeOptions headlessOptions = new ChromeOptions();
        headlessOptions.addArguments("no-sandbox");
        headlessOptions.addArguments("-headless");
        headlessOptions.addArguments("--user-agent=iphone 8");

        //实例化一个Chrome浏览器的实例
        WebDriver driver = new ChromeDriver(headlessOptions);
        driver.manage().window().setSize(new Dimension(414, 736));
        //FirefoxDriver driver = new FirefoxDriver();
        driver.get(urlPath);
        //截屏操作
        //截图到output
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            //复制内容到指定文件中
            FileUtils.copyFile(scrFile, new File(savePath));
            log.info("图片保存:{}",savePath);
        } catch (IOException e) {
            e.printStackTrace();
            log.error("图片保存失败");
        }
        driver.close();*/
    }
}

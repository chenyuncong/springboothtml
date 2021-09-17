//package com.example.demo;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class SeleniumTest {
//    public void testScreenshoutByTakesScreenshot() {
//        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
//        //实例化一个Chrome浏览器的实例
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//        driver.get("https://www.cnblogs.com/longronglang");
//        driver.manage().window().maximize();
//        //执行屏幕截图操作
//        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        //通过FileUtils中的copyFile()方法保存getScreenshotAs()返回的文件;"屏幕截图"即时保存截图的文件夹
//        try {
//            FileUtils.copyFile(srcFile, new File("D:\\screenshot\\通过TakesScreenshot截图.jpg"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void main(String[] args) throws IOException, Exception {
//        System.setProperty("webdriver.chrome.driver","D:\\data\\chromedriver.exe");
//
//        //手机
//        //创建无Chrome无头参数
//        ChromeOptions headlessOptions = new ChromeOptions();
//        headlessOptions.addArguments("no-sandbox");
//        headlessOptions.addArguments("-headless");
//        headlessOptions.addArguments("--user-agent=iphone 8");
//
//        //实例化一个Chrome浏览器的实例
//        WebDriver driver = new ChromeDriver(headlessOptions);
//        driver.manage().window().setSize(new Dimension(414, 736));
//        //FirefoxDriver driver = new FirefoxDriver();
//        driver.get("http://127.0.0.1:5501/index.html");
//        //截屏操作
//        //截图到output
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        try {
//            String savePath = "D:\\data\\example.jpg";
//            //复制内容到指定文件中
//            FileUtils.copyFile(scrFile, new File(savePath));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        driver.close();
//    }
//}

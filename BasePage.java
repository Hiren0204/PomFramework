package com.demo.nopcomerce.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.opera.OperaDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    WebDriver driver;
    Properties prop;
    FileInputStream file;


    public WebDriver initialiseDriver(String browserName) {
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\IdeaProjects\\JavaLearning\\JavaLearning\\POMFrameWork1\\src\\" +
                   // "test\\resources\\BrowserDriver\\chromedriver.exe");
             driver = new ChromeDriver();

        } else if (browserName.equals("opera")) {
            System.setProperty("webdriver.opera.driver", "C:\\Users\\Owner\\IdeaProjects\\JavaLearning\\JavaLearning\\POMFrameWork1\\src\\test\\resources\\" +
                    "BrowserDriver\\geckodriver.exe");
            driver = new OperaDriver();

        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\IdeaProjects\\JavaLearning\\JavaLearning\\POMFrameWork1\\src\\test\\resources\\" +
                    "BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println(browserName + "Browser is invalid, please enter correct browser name");
        }
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
        return driver;
    }


// to  read properties from configure. properties we use the below method
public Properties initialiseProperties() {
        prop= new Properties();
try {
    file = new FileInputStream("C:\\Users\\Owner\\IdeaProjects\\JavaLearning\\JavaLearning\\POMFrameWork1\\src\\test\\resources\\configure.properties");
prop.load(file);

}catch (FileNotFoundException e){
    System.out.println("Configure file not found , please check.....");

}
catch (IOException e){
    System.out.println("Properties could not be loaded........");
    e.printStackTrace();
}
return  prop;
}
}

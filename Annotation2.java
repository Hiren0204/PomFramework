import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Annotation2 {
    WebDriver driver;
    @Test
    void test1() throws InterruptedException{
        System.out.println("Test Case 1");
        Thread.sleep(4000);
        driver.findElement(By.id("Email")).sendKeys("hiren1640@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Hiral@0708");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }
    @Test
    void  test2(){
        System.out.println("Test Case 2");
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("Execute before Method");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Owner\\IdeaProjects\\Software\\src\\Driver\\geckodriver.exe");
        driver= new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("Execute After Method");
        driver.quit();

    }
    @BeforeClass
    void beforeClass(){
        System.out.println("Execute before Class");}

    @AfterClass
    void afterClass(){
        System.out.println("Execute after Class");}
    @BeforeTest
    void beforeTest(){
        System.out.println("Execute before Test");
    }
    @AfterTest
    void afterTest(){
        System.out.println("Execute after test");
    }


}

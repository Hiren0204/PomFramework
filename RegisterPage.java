package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;

    //1- creating page objest in form of By Locators.
    By registerButton = By.cssSelector("a[class='ico-register']");
    By radioButtonmale = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastname = By.id("LastName");
    By Dateofbirth = By.name("DateOfBirthDay");
    By Dateofmonth = By.name("DateOfBirthMonth");
    By Dateofyear = By.name("DateOfBirthYear");
    By emailId = By.id("Email");
    By CompanyName = By.id("Company");
    By password = By.id("Password");
    By confirmpassword = By.id("ConfirmPassword");
    By RegisterButton = By.id("register-button");

    // now we create constructor of registerpage.

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }


    public String getPageTitle() throws InterruptedException {
        String rpTitle = driver.getTitle();
        Thread.sleep(4000);
        System.out.println("Register page title is" + rpTitle);
        return rpTitle;
    }

   // public boolean verifyregisterButton() throws InterruptedException {
     //   Thread.sleep(4000);
     //   return driver.findElement(registerButton).isDisplayed();

    

    public void doRegister(String FirstName, String LastName, String day, String month, String year,
                           String email, String Company, String pwd, String ConfirmPassword) throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(registerButton).click();
        driver.findElement(radioButtonmale).click();
        Thread.sleep(2000);
        driver.findElement(firstName).sendKeys(FirstName);
        driver.findElement(lastname).sendKeys(LastName);
        Thread.sleep(2000);
        driver.findElement(Dateofbirth).sendKeys(day);
        driver.findElement(Dateofmonth).sendKeys(month);
        driver.findElement(Dateofyear).sendKeys(year);
        Thread.sleep(2000);
        driver.findElement(emailId).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(CompanyName).sendKeys(Company);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(confirmpassword).sendKeys((ConfirmPassword));
        driver.findElement(RegisterButton).click();
    }


    //public void doRegister(String firstName, String lastName, String day, String month, String year, String company, String password, String confirmPassword) {
    }
//}


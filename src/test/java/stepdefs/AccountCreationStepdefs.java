package stepdefs;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class AccountCreationStepdefs {

//private WebDriver driver= DriverFactory.getdriver();

    public static final String closePreTag = "</pre>";
    public static final String closeBoldTag = "</b>";
    public static final String openBoldTag = "<b>";
    public static final String openPreTag = "</pre>";

    WebDriver driver = new ChromeDriver();

    private By createaccount = By.xpath("(//a[text()=\"Create an Account\"])[1]");
    private By first_Name = By.xpath("//input[@title=\"First Name\"]");
    private By last_Name = By.xpath("//input[@title=\"Last Name\"]");
    private By email = By.xpath("//input[@title=\"Email\"]");
    private By password = By.xpath("//input[@title=\"Password\"]");
    private By confirm_pas = By.xpath("//input[@title=\"Confirm Password\"]");
    private By create = By.xpath("//button[@class=\"action submit primary\"]");



    @Given("Open Application")
    public void open_application() {

        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        System.out.println(driver.getTitle());

    }

    @Given("Click on Create an Account")
    public void click_on_create_an_account() {

//           wait.until(ExpectedConditions.visibilityOfElementLocated(createaccount));
            driver.findElement(createaccount).click();


    }

    @Then("Fill Information for Create Account")
    public void fill_information_for_create_account() throws IOException {
//        List<List<String>> data = dataTable.asList();
//        List<String> hdr =data.get(0);
//for(int a=0;a.hdr.size();a++){

        driver.findElement(first_Name).sendKeys("Taylor");
        driver.findElement(last_Name).sendKeys("Swift");
        driver.findElement(email).sendKeys("taylor1.swift@gmail.com");
        driver.findElement(password).sendKeys("TaySwi0!");
        driver.findElement(confirm_pas).sendKeys("TaySwi0!");
        driver.findElement(create).click();

        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);


//        FileUtils.copyFile(SrcFile,
//                new File("c:\\Users\\tanya.yadav\\Pictures\\Saved Pictures" + SrcFile + ".jpeg"));
//
        FileUtils.copyFile(SrcFile,
                new File("c:\\screenshot\\screenshot.png"));
     //   C:\Users\tanya.yadav\Pictures\Saved Pictures

    }

    @Then("Sign In Account")
    public void sign_in_application() {
//        List<List<String>> data = dataTable.asList();
//        List<String> hdr =data.get(0);
//for(int a=0;a.hdr.size();a++){

        driver.findElement(first_Name).sendKeys("Taylor");
        driver.findElement(last_Name).sendKeys("Swift");
        driver.findElement(email).sendKeys("taylor.swift@gmail.com");
        driver.findElement(password).sendKeys("TaySwi0!");
        driver.findElement(confirm_pas).sendKeys("TaySwi0!");
        driver.findElement(create).click();


    }
}

package TestPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class RegistrationFormsTest extends StudentInfo1 {
    private WebDriver driver;

    //Page URL
    private static String PAGE_URL="https://demoqa.com/";

    //Locators

    //Apply as Developer Button
    @FindBy(id = "firstName")
    WebElement fillfirstName;

    @FindBy(id = "lastName")
     WebElement fillLastName;

    @FindBy(id = "userNumber")
     WebElement fillMobileNumber;

    @FindBy(how = How.XPATH, using = "//*[@id='genterWrapper']/div[2]/div[1]/label")
     WebElement fillGender;

    @FindBy(id = "submit")
     WebElement clickSubmit;



    //Constructor
    public RegistrationFormsTest(WebDriver driver){

        this.driver=driver;
//        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public RegistrationFormsTest fillStudentName(){
        fillfirstName.sendKeys(Name);
        return this;
    }

    public RegistrationFormsTest fillStudentLastName(){
        fillLastName.sendKeys(lastName1);
        return this;
    }

    public RegistrationFormsTest fillNumber(){
        fillMobileNumber.sendKeys(mobileNumber1);
        return this;
    }

    public RegistrationFormsTest gender(){
        fillGender.click();
        return this;
    }

    public void submit(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        clickSubmit.click();
    }
}

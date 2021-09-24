package TestPackage;

import io.qameta.allure.Severity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class SubmitTestTest extends StudentInfo1 {
    private WebDriver driver;

    //Page URL
    private static String PAGE_URL="https://demoqa.com/";

    //Locators

    //Apply as Developer Button
    @FindBy(how = How.XPATH, using = "//*[@id='example-modal-sizes-title-lg']")
    private WebElement checkSubmitTest;

    @FindBy(how = How.CSS, using = "body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(1) > td:nth-child(2)")
    private WebElement filledName;
    SoftAssert softAssert = new SoftAssert();
    @FindBy(how = How.CSS, using = "body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(4) > td:nth-child(2)")
    private WebElement filledMobileNumber;



    //Constructor
    public SubmitTestTest(WebDriver driver){

        this.driver=driver;
//        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public SubmitTestTest checkSubmit(){
        softAssert.assertEquals(checkSubmitTest.getText(),"Thanks for submitting the form");
        System.out.println(checkSubmitTest.getText());
        return this;
    }

    public SubmitTestTest checkName(){
        softAssert.assertEquals(fullName,filledName.getText());
        System.out.println(filledName.getText());
        return this;
    }

        public SubmitTestTest checkMobileNumber(){
        softAssert.assertEquals(mobileNumber1,filledMobileNumber.getText());
        System.out.println(filledMobileNumber.getText());
        return this;
    }
}

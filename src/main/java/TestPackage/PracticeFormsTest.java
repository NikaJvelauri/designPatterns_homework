package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormsTest {
    private WebDriver driver;

    //Page URL
    private static String PAGE_URL="https://demoqa.com/";

    //Locators

    //Apply as Developer Button
    @FindBy(how = How.XPATH, using = "//*[@id='app']/div/div/div[2]/div[1]/div/div/div[2]/div")
    private WebElement practiceFormButton;

    //Constructor
    public PracticeFormsTest(WebDriver driver){

        this.driver=driver;
//        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void clickOnPracticeForm(){

        practiceFormButton.click();

    }
}


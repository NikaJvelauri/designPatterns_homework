package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class test {
    private WebDriver driver;

    //Page URL
    private static String PAGE_URL="https://demoqa.com/";

    //Locators

    //Apply as Developer Button
    @FindBy(how = How.XPATH, using = "//*[@id='app']/div/div/div[2]/div/div[2]")
    private WebElement developerApplyButton;

    //Constructor
    public test(WebDriver driver){

        this.driver=driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void clickOnDeveloperApplyButton(){

        developerApplyButton.click();

    }
}


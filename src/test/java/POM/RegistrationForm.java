package POM;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationForm extends StudentInfo{
    SelenideElement firstname = $(By.id("firstName"));
    SelenideElement lastName = $(By.id("lastName"));
    SelenideElement mobileNumber = $(By.id("userNumber"));
    SelenideElement gender = $(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
    SelenideElement submit = $(By.id("submit"));

    public void fillFirstName(){
        firstname.sendKeys(Name);
    }

    public void fillLastName(){
        lastName.sendKeys(lastName1);
    }

    public void fillMobileNumber(){
        mobileNumber.sendKeys(mobileNumber1);
    }

    public void fillGender(){
        gender.click();
    }

    public void clickSubmit(){
        submit.scrollTo();
        submit.click();
    }
}

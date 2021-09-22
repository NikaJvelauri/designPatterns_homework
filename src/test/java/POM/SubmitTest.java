package POM;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;

public class SubmitTest extends StudentInfo{
    SelenideElement checkSubmitTest = $(By.xpath("//*[@id=\"example-modal-sizes-title-lg\"]"));
    SoftAssert softAssert = new SoftAssert();
    SelenideElement filledName = $(By.cssSelector("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(1) > td:nth-child(2)"));
    SelenideElement filledMobileNumber = $(By.cssSelector("body > div.fade.modal.show > div > div > div.modal-body > div > table > tbody > tr:nth-child(4) > td:nth-child(2)"));

    public void checkSubmit(){
        softAssert.assertEquals(checkSubmitTest.getText(),"Thanks for submitting the form");
        System.out.println(checkSubmitTest.getText());
    }

    public void checkName(){
        softAssert.assertEquals(fullName,filledName.getText());
        System.out.println(filledName.getText());
    }
    public void checkMobileNumber(){
        softAssert.assertEquals(mobileNumber1,filledMobileNumber.getText());
        System.out.println(filledMobileNumber.getText());
    }
}

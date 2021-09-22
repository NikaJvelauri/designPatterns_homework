package POM;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PracticeForms {
    SelenideElement practiceForms = $(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div"));

    public void goToPracticeForms(){
        practiceForms.click();
    }
}

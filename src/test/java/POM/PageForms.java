package POM;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageForms {
    SelenideElement PageForms = $(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]"));

    public void goToPageForms(){
        PageForms.click();
    }
}

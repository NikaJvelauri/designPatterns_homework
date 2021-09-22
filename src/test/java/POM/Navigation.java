package POM;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class Navigation {
    String url = "https://demoqa.com/";

    public void navigation(){
        Configuration.startMaximized = true;
        open(url);
    }
}

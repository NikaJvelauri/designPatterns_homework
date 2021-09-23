package POM;


import TestPackage.PracticeFormsTest;
import TestPackage.SubmitTestTest;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import TestPackage.PageFormsTest;
import TestPackage.RegistrationFormsTest;


import java.util.concurrent.TimeUnit;

public class PageForms{
    WebDriver driver;



    @BeforeClass
    public void setup(){
        //use FF Driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void goToPageForms(){



        PageFormsTest pageFormsTest = new PageFormsTest(driver);
        PracticeFormsTest practiceForms = new PracticeFormsTest(driver);

        RegistrationFormsTest register = new RegistrationFormsTest(driver);
        SubmitTestTest submit = new SubmitTestTest(driver);



        pageFormsTest.clickOnDeveloperApplyButton();


        practiceForms.clickOnPracticeForm();


//        //Fluent API (methods can be chained together to form a single statement)
        register.fillStudentName().fillStudentLastName().fillNumber().gender();


        register.submit();

        submit.checkSubmit().checkName().checkMobileNumber();

    }



    @AfterClass
    public void close(){
        driver.close();
    }
}

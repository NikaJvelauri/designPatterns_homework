package POM;

import TestPackage.PracticeFormsTest;
import TestPackage.SubmitTestTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.*;
import TestPackage.PageFormsTest;
import TestPackage.RegistrationFormsTest;
import java.util.concurrent.TimeUnit;

//@Listeners({TestListener.class})
@Epic("Homework")
@Feature("Registering")
public class FinalResult {
    WebDriver driver;



    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }

    @Story("goToPageForms")
    @Step("This is step 1")
    @Test(priority = 1, description = "Going into page forms")
    @Description("Going into page forms")
    @Attachment(value = "Page screenshot", type = "image/png")
    @Severity(SeverityLevel.NORMAL)
    public void goToPageForms()  {
        PageFormsTest pageFormsTest = new PageFormsTest(driver);
        pageFormsTest.clickOnDeveloperApplyButton();
    }
    @Step("This is step 2")
    @Description("Going into practice forms")
    @Test(priority = 2,description = "Going into practice forms")
    @Attachment(value = "Page screenshot", type = "image/png")
    @Story("practiceForm")
    @Severity(SeverityLevel.NORMAL)
    public void practiceForm() {
        PracticeFormsTest practiceForms = new PracticeFormsTest(driver);
        practiceForms.clickOnPracticeForm();
    }
    @Step("This is step 3")
    @Description("Filling information")
    @Test(priority = 3, description = "Filling information")
    @Story("register")
    @Attachment(value = "Page screenshot", type = "image/png")
    @Severity(SeverityLevel.NORMAL)
    public void register(){
        RegistrationFormsTest register = new RegistrationFormsTest(driver);
        register.fillStudentName("Nika").fillStudentLastName("Jvelauri").fillNumber("0123456789").gender();

    }

    @Step("This is step 4")
    @Description("Submitting")
    @Test(priority = 4, description = "Submitting")
    @Story("submit")
    @Attachment(value = "Page screenshot", type = "image/png")
    @Severity(SeverityLevel.NORMAL)
    public void submit(){
        RegistrationFormsTest register = new RegistrationFormsTest(driver);
        register.submit();
    }

    //am tesls enabled=falseti vskipavt
    @Flaky
    @Step("This is step 4")
    @Test(priority = 5, description = "checking information")
    @Story("check")
    @Description("checking information")
    @Attachment(value = "Page screenshot", type = "image/png")
    @Severity(SeverityLevel.NORMAL)
    public void check() {
        SubmitTestTest submit = new SubmitTestTest(driver);
        submit.checkSubmit().checkName().checkMobileNumber();
        throw new SkipException("skipException");
    }





    @AfterClass
    public void close(){
        driver.close();
    }
}

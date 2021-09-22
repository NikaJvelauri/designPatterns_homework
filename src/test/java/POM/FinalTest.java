package POM;

import org.junit.Test;

import javax.security.auth.login.Configuration;

public class FinalTest {

    @Test
    public void finalTest() throws InterruptedException {

        Navigation navigation = new Navigation();
        PageForms pageForms = new PageForms();
        PracticeForms practiceForms = new PracticeForms();
        RegistrationForm register = new RegistrationForm();
        SubmitTest submit = new SubmitTest();

        navigation.navigation();

        pageForms.goToPageForms();

        practiceForms.goToPracticeForms();

        register.fillFirstName();
        register.fillLastName();
        register.fillMobileNumber();
        register.fillGender();
        Thread.sleep(2000);
        register.clickSubmit();

        submit.checkSubmit();
        Thread.sleep(2000);
        submit.checkName();
        submit.checkMobileNumber();


    }
}

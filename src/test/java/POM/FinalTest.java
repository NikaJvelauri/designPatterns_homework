package POM;

import org.junit.Test;

import javax.security.auth.login.Configuration;

public class FinalTest {

    @Test
    public void finalTest(){

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

        register.clickSubmit();

        submit.checkSubmit();

        submit.checkName();
        submit.checkMobileNumber();


    }
}

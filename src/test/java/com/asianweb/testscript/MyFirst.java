package com.asianweb.testscript;

import com.asianweb.pages.ContactPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by Rahul on 23-04-2016.
 */
public class MyFirst extends BaseTest {

    @Test
    public void emailValidationTest(){
        ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
        contactPage.inputName("Javed");
        contactPage.inputEmail("wringEmial");
        contactPage.inputSubject("Testing subject");
        contactPage.inputMessage("Testing Testing Testing Testing Testing Testing Testing Testing Testing ");
        contactPage.clikSendButton();
        contactPage.validateEmail("The e-mail address entered is invalid");
    }

    @Test
    public void validationTest(){
        ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
        contactPage.clikSendButton();
        contactPage.validateName("The field is required");
        contactPage.validateName("The field is required");

    }
    @Test
    public void submitContactForm(){
        ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
        contactPage.inputName("Javed");
        contactPage.inputEmail("test123@gmail.com");
        contactPage.inputSubject("Testing subject");
        contactPage.inputMessage("Testing Testing Testing Testing Testing Testing Testing Testing Testing ");
        contactPage.clikSendButton();
        contactPage.verifySuccess("Thank you for your message. It has been sent");

    }
}

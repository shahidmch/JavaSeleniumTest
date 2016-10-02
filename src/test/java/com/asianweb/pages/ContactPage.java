package com.asianweb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by Rahul on 23-04-2016.
 */
public class ContactPage {

    @FindBy(xpath="//*[@name='your-name']")
    private WebElement name;

    @FindBy(xpath="//*[@name='your-email']")
    private WebElement email;

    @FindBy(xpath="//*[@name='your-subject']")
    private WebElement subject;

    @FindBy(xpath="//*[@name='your-message']")
    private WebElement message;

    @FindBy(xpath="//*[@value='Send']")
    private WebElement send;

    @FindBy(xpath=".//input[@name='your-email']/following-sibling::span")
    private WebElement elEmailValidaion;

    @FindBy(xpath=".//input[@name='your-name']/following-sibling::span")
    private WebElement elNameValidaion;

    @FindBy(xpath="//*[contains(@class, 'wpcf7-mail-sent-ok')]")
    private WebElement successElement;

    public ContactPage inputName(String nameValue){
        name.clear();
        name.sendKeys(nameValue);
        return this;
    }

    public ContactPage inputEmail(String emailID){
        email.clear();
        email.sendKeys(emailID);
        return this;
    }

    public ContactPage verifySuccess(String messageValue){
        String successMsg = successElement.getText();
        Assert.assertTrue(successMsg.contains(messageValue));
        return this;
    }

    public ContactPage validateName(String messageValue){
        String nameVaidationMsg = elNameValidaion.getText();
        Assert.assertTrue(nameVaidationMsg.contains(messageValue));
        return this;
    }

    public ContactPage validateEmail(String messageValue){
        String emailVaidatonMsg = elEmailValidaion.getText();
        Assert.assertTrue(emailVaidatonMsg.contains(messageValue));
        return this;
    }
    public ContactPage inputSubject(String subjectText){
        subject.clear();
        subject.sendKeys(subjectText);
        return this;
    }

    public ContactPage inputMessage(String messageText){
        message.clear();
        message.sendKeys(messageText);
        return this;
    }

    public ContactPage clikSendButton(){
        send.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

}

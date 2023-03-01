package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

    public AccountRegistrationPage(WebDriver driver) {
        super(driver);
    }

    // Elements
    @FindBy(name = "firstname")
    WebElement txtfirstname;

    @FindBy(name = "lastname")
    WebElement txtlastname;

    @FindBy(name = "email")
    WebElement txtemail;

    @FindBy(name = "telephone")
    WebElement txttelephone;

    @FindBy(name = "password")
    WebElement txtPassword;

    @FindBy(name = "confirm")
    WebElement txtConfirm;

    @FindBy(name = "agree")
    WebElement txtAgree;

    @FindBy(xpath = "//*[@id='content']/form/div/div/input[2]")
    WebElement txtContinue;

    @FindBy(name = "/html/body/div[2]/div/div/h1")
    WebElement msgConfirmation;
    // Actions
    public void setFirstname(String firstname) {
        txtfirstname.sendKeys(firstname);
    }

    public void setLastname(String lastname) {
        txtlastname.sendKeys(lastname);
    }

    public void setEmail(String email) {
        txtemail.sendKeys(email);
    }

    public void setTelephone(String telephone) {
        txttelephone.sendKeys(telephone);
    }

    public void setPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void setconfirmPassword(String confirm) {
        txtConfirm.sendKeys(confirm);
    }

    public void setAgree() {
        txtAgree.click();
    }
    public void setContinue() {
        txtContinue.click();
    }

    public String getConfirmationMessage() {
        try {
            return msgConfirmation.getText();
        }catch (Exception e) {
            return e.getMessage();
        }
    }
}

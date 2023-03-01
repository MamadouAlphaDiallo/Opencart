package testCase;

import org.junit.Assert;
import org.junit.Test;
import pageObject.AccountRegistrationPage;
import pageObject.HomePage;

public class TC_001_AccountRegistrationTest extends BaseClass {

    @Test
    public void testAccountRegistration() {

            HomePage homePage = new HomePage(driver);
            homePage.clickAccount();
            homePage.clickRegister();

            AccountRegistrationPage accountRegistrationPage = new AccountRegistrationPage(driver);
            accountRegistrationPage.setFirstname("DIALLO");
            accountRegistrationPage.setLastname("Alpha");
            accountRegistrationPage.setEmail(randomString()+"@gmail.com");
            accountRegistrationPage.setTelephone(randomNumber());
            String password = randomAlphaNumeric();
            accountRegistrationPage.setPassword(password);
            accountRegistrationPage.setconfirmPassword(password);
            accountRegistrationPage.setAgree();
            accountRegistrationPage.setContinue();
            String msgconfirmation = accountRegistrationPage.getConfirmationMessage();
            Assert.assertEquals(msgconfirmation, "Your Account Has Been Created!");

    }


}

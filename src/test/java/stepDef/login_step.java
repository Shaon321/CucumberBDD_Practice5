package stepDef;

import base.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.login_page;

public class login_step extends Setup {
    login_page login = new login_page(driver);

    @Given("I am at TalentTEK Homepage")
    public void iAmAtTalentTEKHomepage() {
        String exp = "Sign In";
        String act = driver.getTitle();
        Assert.assertEquals(exp, act);
        
    }

    @And("I enter a valid email")
    public void iEnterAValidEmail() {
        login.enterEmailAddress(Hook.email);
    }

    @And("I enter a valid password")
    public void iEnterAValidPassword() {
        login.enterPassword(Hook.password);
        
    }

    @When("I click a Login Button")
    public void iClickALoginButton() {
       login.clickLogin();

    }
}

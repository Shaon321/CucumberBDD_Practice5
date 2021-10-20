package stepDef;

import base.Setup;
import io.cucumber.java.en.Then;
import pageObject.profile_page;

public class MyProfile_step extends Setup {
    profile_page profile = new profile_page(driver);

    @Then("I should be able to successfully login")
    public void iShouldBeAbleToSuccessfullyLogin() {
        profile.getActualMsg();

    }
}

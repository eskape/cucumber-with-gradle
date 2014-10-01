package gradle.cucumber.stepdefinitions;

import cucumber.api.java.en.When;
import phonecatalog.Phone;

public class PhoneCatalog {


    @When("^I run a step$")
    public void i_run_a_step() throws Throwable {
        new Phone().doWork();
    }
}

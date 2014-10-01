package gradle.cucumber;

import cucumber.api.java.en.When;
import phonecatalog.Phone;

public class BasicStepdefs {


    @When("^I run a step$")
    public void i_run_a_step() throws Throwable {
        new Phone().doWork();
    }
}

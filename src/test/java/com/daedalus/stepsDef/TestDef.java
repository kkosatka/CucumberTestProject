package com.daedalus.stepsDef;

import com.daedalus.keyword.TestAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDef extends TestAction
{


    public String name = "";


    @Given("The user is having a new project")
    public void the_user_is_having_a_new_project() {
        getNewProject();

    }
    @When("The user writes Hello World test")
    public void the_user_writes_hello_world_test() {
        name=typePrint("Hello World");

    }
    @Then("The user should be able to run it and see printed String")
    public void the_user_should_be_able_to_run_it_and_see_printed_string() {
       typePrint(name);

    }

}

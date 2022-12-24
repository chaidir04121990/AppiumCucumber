package AppiumTesting.StepDef;


import AppiumTesting.Baseinit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDef extends Baseinit {

    @Given("User navigate to {string}")
    public void navigateToWeb(String url){

    }
    @When("User input Username {string}")
    public void inputUsername(String username){

    }
    @And("user input password {string}")
    public void inputPass(String pass){

    }
    @Then("User land on Product page")
    public void landProdPage(){

    }

    @Then("Error notification will be shown")
    public void errorUsernameOrPass(){
        
    }
    
}

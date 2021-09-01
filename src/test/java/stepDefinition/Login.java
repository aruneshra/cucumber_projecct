package stepDefinition;

import Libarary.CreateDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver=new ChromeDriver();
    @Given("Enter URL")
    public void enter_url() {

    }
    @When("entr uname and password")
    public void entr_uname_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        CreateDriver.getInstance().
    }
    @Then("home page should display")
    public void home_page_should_display() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}

package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WebTablesPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebTablesSteps {

    WebTablesPage webTablesPage = new WebTablesPage();

    @When("I navigate to the Web Tables page")
    public void iNavigateToTheWebTablesPage() {
        open("https://demoqa.com/webtables");
    }

    @When("I click the Add button")
    public void iClickTheAddButton() {
        webTablesPage.clickAddButton();
    }

    @When("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        webTablesPage.enterFirstName(firstName);
    }

    @When("I submit the form")
    public void iSubmitTheForm() {
        webTablesPage.clickSubmitButton();
    }

    @Then("I should see the first name {string} in the table")
    public void iShouldSeeTheFirstNameInTheTable(String expectedFirstName) {
        assertEquals(expectedFirstName, webTablesPage.getFirstNameFromTable());
    }
}

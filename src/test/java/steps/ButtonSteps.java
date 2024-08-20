package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ButtonsPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ButtonSteps {

    ButtonsPage buttonsPage = new ButtonsPage();

    @When("I navigate to the Buttons page")
    public void iNavigateToTheButtonsPage() {
        open("https://demoqa.com/elements");
        buttonsPage.clickButtonsOption();
    }

    @When("I click the Click Me button")
    public void iClickTheClickMeButton() {
        buttonsPage.clickClickMeButton();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedMessage) {
        assertEquals(expectedMessage, buttonsPage.getButtonMessage());
    }
}

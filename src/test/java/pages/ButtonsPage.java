package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ButtonsPage {

    private final SelenideElement clickMeButton = $("#vZasq");
    private final SelenideElement buttonsOption = $("#item-4 > span");

    public void clickButtonsOption() {
        buttonsOption.click();
    }

    public void clickClickMeButton() {
        clickMeButton.click();
    }

    public String getButtonMessage() {
        return $("#doubleClickMessage").getText();
    }
}

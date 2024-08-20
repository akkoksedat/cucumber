package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage {

    private final SelenideElement addButton = $("#addNewRecordButton");
    private final SelenideElement firstNameInput = $("#firstName");
    private final SelenideElement submitButton = $("#submit");

    public void clickAddButton() {
        addButton.click();
    }

    public void enterFirstName(String firstName) {
        firstNameInput.setValue(firstName);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String getFirstNameFromTable() {
        return $(".rt-tbody .rt-tr-group:first-child .rt-td:nth-child(1)").getText();
    }

    public void clickSubmit() {
    }
}

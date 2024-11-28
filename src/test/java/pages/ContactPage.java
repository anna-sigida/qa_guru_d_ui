package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ContactPage {
    private final SelenideElement contactButton = $(byText("Связаться с нами"));

    @Step("Проверка отображения кнопки 'Связаться с нами'")
    public SelenideElement checkButton() {
        return contactButton;
    }
}

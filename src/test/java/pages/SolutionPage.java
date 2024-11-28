package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SolutionPage {
    private final SelenideElement demoButton = $(byText("Демонстрация"));

    @Step("Проверка отображения кнопки 'Демонстрация'")
    public SelenideElement checkButton() {
        return demoButton;
    }
}

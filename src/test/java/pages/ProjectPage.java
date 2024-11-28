package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ProjectPage {
    private final SelenideElement projectTitle = $(byText("Реализованные проекты"));

    @Step("Проверить название заголовка")
    public SelenideElement checkProjectTitle() {
        return projectTitle;
    }
}

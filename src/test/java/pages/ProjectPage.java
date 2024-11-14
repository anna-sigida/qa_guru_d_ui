package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ProjectPage {
    public SelenideElement projectTitle = $(byText("Реализованные проекты"));
}

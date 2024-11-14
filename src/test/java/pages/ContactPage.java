package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ContactPage {
    public SelenideElement contactButton = $(byText("Связаться с нами"));
}

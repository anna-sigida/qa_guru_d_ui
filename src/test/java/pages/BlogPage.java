package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BlogPage {
    public ElementsCollection cards = $$("ul.js-feed-container");
    public SelenideElement title = $(byText("Экспертные статьи, интервью и комментарии сотрудников NAUKA на страницах ведущих отраслевых и бизнес-изданий."));
}

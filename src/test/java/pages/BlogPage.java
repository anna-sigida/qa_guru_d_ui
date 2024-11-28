package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BlogPage {
    private final ElementsCollection cards = $$("ul.js-feed-container");
    private final SelenideElement title = $(byText("Экспертные статьи, интервью и комментарии сотрудников NAUKA на страницах ведущих отраслевых и бизнес-изданий."));

    @Step("Проверить название заголовка")
    public SelenideElement checkTitle() {
        return title;
    }

    @Step("Проверить отображение карточек")
    public ElementsCollection checkCards() {
        return cards;
    }

}

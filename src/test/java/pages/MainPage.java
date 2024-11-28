package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement projectsLink = $("a[href='/projects']");
    private final SelenideElement contactLink = $("a[href='/contacts']");
    private final SelenideElement solutionsLink = $("a[href='/solutions']");
    private final SelenideElement blogLink = $("a[href='/blog']");

    private final SelenideElement directionsMenu = $(byText("Направления"));
    private final ElementsCollection directionsItems = $$("ul.t978__menu li");

    private final SelenideElement searchIcon = $("a[href='#opensearch']");
    private final SelenideElement searchInput = $("input[placeholder='Поиск по сайту']");
    private final ElementsCollection searchResults = $$(".t-search-widget__resultwrapper div");
    private final SelenideElement enButton = $("a[href='/eng']");
    private final SelenideElement ruButton = $("a[href='/']");
    private final SelenideElement h1Title = $("h1");



    @Step("Навести на Направления")
    public void hoverOnDirections() {
        directionsMenu.hover();
    }

    @Step("Получить направления из списка")
    public ElementsCollection getDirectionsItems() {
        return directionsItems;
    }

    @Step("Нажать на 'Проекты'")
    public void clickProjects() {
        projectsLink.click();
    }

    @Step("Нажать на 'Контакты'")
    public void clickContact() {
        contactLink.click();
    }

    @Step("Нажать на 'Решения'")
    public void clickSolutions() {
        solutionsLink.click();
    }

    @Step("Нажать на 'Публикации'")
    public void clickBlog() {
        blogLink.click();
    }

    @Step("Открыть поиск")
    public void openSearch() {
        searchIcon.click();
        searchInput.shouldBe(visible);
    }

    @Step("Ввести в поиск запрос {query}")
    public void fillSearch(String query) {
        searchInput.sendKeys(query);
    }

    @Step("Проверить результаты поиска")
    public ElementsCollection getSearchResults() {
        return searchResults;
    }

    @Step("Нажать на первый элемент")
    public void clickOnFirstResult() {
        searchResults.first().shouldBe(visible).click();
    }

    @Step("Нажать на переключение языка на английский")
    public void clickOnEn() {
        enButton.click();
    }

    @Step("Нажать на переключение языка на русский")
    public void clickOnRu() {
        ruButton.click();
    }

    @Step("Проверить что заголовок отображается на русском языке")
    public void checkRuLocalization(){
        h1Title.shouldHave(text("Простые решения сложных задач"));
    }

    @Step("Проверить что заголовок отображается на английском языке")
    public void checkEnLocalization(){
        h1Title.shouldHave(text("We create IT solutions that exceed clients' expectations and open up new growth opportunities"));
    }
}

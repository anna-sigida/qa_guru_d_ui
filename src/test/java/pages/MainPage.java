package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    SelenideElement projectsLink = $("a[href='/projects']");
    SelenideElement contactLink = $("a[href='/contacts']");
    SelenideElement solutionsLink = $("a[href='/solutions']");
    SelenideElement blogLink = $("a[href='/blog']");

    SelenideElement directionsMenu = $(byText("Направления"));
    ElementsCollection directionsItems = $$("ul.t978__menu li");




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



}

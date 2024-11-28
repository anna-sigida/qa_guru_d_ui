package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainPageTests extends BaseTest {
    MainPage mainPage = new MainPage();
    ProjectPage projectPage = new ProjectPage();
    ContactPage contactPage = new ContactPage();
    SolutionPage solutionPage = new SolutionPage();
    BlogPage blogPage = new BlogPage();

    @BeforeEach
    public void openPage() {
        open("/");
    }

    @Test
    @DisplayName("Проверка элементов в списке 'Направления'")
    void directionsMenuItemsTest() {
        String[] expectedItems = {
                "Цифровое производство",
                "Управление финансами",
                "Электронный документооборот",
                "Управление строительством",
                "Управление ТОиР"
        };
        mainPage.hoverOnDirections();

        for (String item : expectedItems) {
            mainPage.getDirectionsItems().findBy(text(item)).shouldBe(visible);
        }
    }

    @Test
    @DisplayName("Проверка отображения заголовка в меню Проектов")
    void checkProjectsTest() {
        mainPage.clickProjects();
        projectPage
                .checkProjectTitle()
                .shouldBe(visible);
    }

    @Test
    @DisplayName("Проверка отображения кнопки в меню Контакты")
    void checkContactTest() {
        mainPage.clickContact();
        contactPage
                .checkButton()
                .shouldBe(visible);
    }

    @Test
    @DisplayName("Проверка отображения кнопки в меню Решения")
    void checkSolutionsTest() {
        mainPage.clickSolutions();
        solutionPage
                .checkButton()
                .shouldBe(visible);
    }

    @Test
    @DisplayName("Проверка списка карточек в меню Публикации")
    void checkBlogTest() {
        mainPage.clickBlog();
        blogPage
                .checkTitle()
                .scrollIntoView(true)
                .shouldBe(visible);
        assertThat(blogPage.checkCards()).isNotNull();
    }

    @Test
    @DisplayName("Проверка перехода на страницу Публикации через поиск")
    void checkBlogSearchTest() {
        String query = "Публикации";

        mainPage.openSearch();
        mainPage.fillSearch(query);
        mainPage.getSearchResults().shouldHave(sizeGreaterThan(10));
        mainPage.clickOnFirstResult();
        switchTo().window(1);

        blogPage
                .checkTitle()
                .scrollIntoView(true)
                .shouldBe(visible);
    }

    @Test
    @DisplayName("Проверка смены языка сайта")
    void checkLocalizationTest() {
        mainPage.clickOnEn();
        mainPage.checkEnLocalization();
        mainPage.clickOnRu();
        mainPage.checkRuLocalization();
    }
}
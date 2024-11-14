package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
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
        projectPage.
                projectTitle
                .shouldBe(visible);
    }

    @Test
    @DisplayName("Проверка отображения кнопки в меню Контакты")
    void checkContactTest() {
        mainPage.clickContact();
        contactPage
                .contactButton
                .shouldBe(visible);
    }

    @Test
    @DisplayName("Проверка отображения кнопки в меню Решения")
    void checkSolutionsTest() {
        mainPage.clickSolutions();
        solutionPage
                .demoButton
                .shouldBe(visible);
    }

    @Test
    @DisplayName("Проверка списка карточек в меню Публикации")
    void checkBlogTest() {
        mainPage.clickBlog();
        blogPage
                .title
                .scrollIntoView(true)
                .shouldBe(visible);
        assertThat(blogPage.cards).isNotNull();
    }
}
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class FirstTest extends BaseTest{

    @Test
    @DisplayName("Проверка URL")
    void firstTest() {
        webdriver().shouldHave(url("https://platform.productstar.ru/login"));
    }

    @Test
    @DisplayName("Feature-42")
    void secondTest() {
        webdriver().shouldHave(url("https://platform.productstar.ru/login"));
    }

    @Test
    @DisplayName("Проверка кнопки Забыли пароль")
    void thirdTest() {
        $(byXpath("//*[text()='Забыли пароль?']")).click();
        webdriver().shouldHave(url("https://platform.productstar.ru/forgot-password"));
    }
}

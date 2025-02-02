import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

@Tags({
        @Tag("SecondFeature"), @Tag("Smoke")
})

public class SecondTest extends BaseTest{

    @Test
    void fourTest() {
        webdriver().shouldHave(url("https://platform.productstar.ru/login"));
    }

    @Test
    void fifthTest() {
        webdriver().shouldHave(url("https://platform.productstar.ru/login"));
    }

    @Tag("Register")
    @Test
    void sixTest() {
        $(byXpath("//*[text()='пройдите регистрацию']")).click();
        webdriver().shouldHave(url("https://platform.productstar.ru/register"));
        $(byXpath("//*[text()='Уже регистрировались?']")).click();
        webdriver().shouldHave(url("https://platform.productstar.ru/login"));
    }
}

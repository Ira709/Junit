import com.codeborne.selenide.Config;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.lang.module.Configuration;


import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeAll
    static void setUpAll() {
        baseUrl = "https://platform.productstar.ru";
        Configuration.browserSize = "1980x1080";
        Configuration.pageLoadStrategy = "normal";
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 3000;
        open(baseUrl);
    }


    @BeforeEach
    public void setUp() {
        Selenide.localStorage().clear();
        Selenide.sessionStorage().clear();
        Selenide.clearBrowserCookies();
    }

    @AfterEach
    public void setEndEach() {
        Selenide.localStorage().clear();
        Selenide.sessionStorage().clear();
        Selenide.clearBrowserCookies();
    }

    @AfterAll
    public void setAll() {
        Selenide.closeWebDriver();
    }
}

package steps;

import elements.mainPageElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class mainPageSteps extends mainPageElements {
    public static void loginFunc(){
        loginButton.shouldBe(visible, Duration.ofSeconds(30)).click();
    }
}

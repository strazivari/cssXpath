package steps;

import elements.authPageElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class authPageSteps extends authPageElements {
    public static void loginFunc(){
        loginInput.setValue("AT16");
        passwordInput.setValue("Qwerty123");
        loginButton.shouldBe(visible, Duration.ofSeconds(3)).click();
    }
}

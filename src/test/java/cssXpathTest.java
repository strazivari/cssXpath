
import Hooks.webHooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static steps.authPageSteps.*;
import static steps.mainPageSteps.*;
import static steps.singleTaskPageSteps.*;
import static steps.tasksPageSteps.*;

import org.openqa.selenium.WebDriver;
import steps.mainPageSteps;

public class cssXpathTest extends webHooks {
    @Test
    public void loginTest() {
        open("https://edujira.ifellow.ru");
        getWebDriver().manage().window().maximize();
        loginFunc();
        goToRequiredProject();
        showAmountOfCompletedTasks();
        search();
//        statusCheck("СДЕЛАТЬ");
//        versionCheck("Version 2.0");
        createTask();
        completeTask();

        Assertions.assertTrue((!loginInput.exists()), "Вход выполнен успешно");
    }


}

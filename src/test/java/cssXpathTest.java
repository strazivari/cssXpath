
import Hooks.webHooks;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static steps.authPageSteps.*;
import static steps.mainPageSteps.*;
import static steps.singleTaskPageSteps.*;
import static steps.tasksPageSteps.*;

import steps.mainPageSteps;

public class cssXpathTest extends webHooks {
    @Test
    public void loginTest() {
        open("https://edujira.ifellow.ru");
        loginFunc();
        goToRequiredProject();
        showAmountOfCompletedTasks();
        search();
        statusCheck();
        versionCheck();
    }

}

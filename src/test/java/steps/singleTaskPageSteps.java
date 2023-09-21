package steps;

import com.codeborne.selenide.SelenideElement;
import elements.singleTaskPageElement;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;
import static org.apache.http.util.TextUtils.isEmpty;

public class singleTaskPageSteps extends singleTaskPageElement {
//    public static void statusCheck(String statusValue) {
//        Assertions.assertEquals(statusValue, status.getText(), "Статус задачи не совпадает");
//    }
//    public static void versionCheck(String versionValue) {
//        Assertions.assertEquals(version.getText(), versionValue, "Статус задачи не совпадает");
//    }
    public static void createTask() {
        create.click();
        if (issueTypeBug.exists()) {
            issueType.click();
            issueTypeBug.click();
        }
        issueValue.setValue("TestSelenium");
        descriptionArea.sendKeys("Шаги:  1.Тест вызванных функций  2.Проверка результатов тестирования");
        versionField.click();
        if (priorityFieldMedium.exists()) {
            priorityField.click();
            priorityFieldMedium.click();
        }
        labelSelect.sendKeys("bugBuzzers");
        labelSelect.sendKeys(Keys.RETURN);
        testEnvironmentArea.sendKeys("local machine");
        usedVersions.click();
        chooseExecutor.click();

        Assertions.assertEquals(issueType.getValue(), "Ошибка");
        Assertions.assertEquals(issueValue.getValue(), "TestSelenium");
        Assertions.assertEquals(descriptionArea.getValue(), "Шаги:  1.Тест вызванных функций  2.Проверка результатов тестирования");
        Assertions.assertEquals(versionField.getText(), "Version 2.0");
        Assertions.assertEquals(priorityField.getValue(), "Medium");
        Assertions.assertEquals(labelSelectTest.getText(), "bugBuzzers");
        Assertions.assertEquals(testEnvironmentArea.getValue(), "local machine");

        createTaskSubmit.click();
        tasksPage.click();
    }
}

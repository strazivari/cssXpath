package steps;

import elements.tasksPageElements;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.sleep;

public class tasksPageSteps extends tasksPageElements {
    public static void showAmountOfCompletedTasks() {
        tasksPage.click();
        System.out.println(completedTasks.getText());
    }

    public static void search() {
        searchInput.setValue("TestSelenium");
        firstSearchResult.click();
    }

    public static void completeTask() {
        searchFilter.click();
        myOpenedTasks.click();
        Assertions.assertEquals(searchFilterTest.getText(), "Мои открытые задачи");
        filterActivation.click();
        filterByDate.click();
        sleep(1000);
        Assertions.assertEquals(searchSortTest.getText(), "Сортировать по Cоздано");
        lastTask.click();
        inProgressTask.click();
        sleep(1000);
        Assertions.assertEquals(taskStatusCheck.getText(), "В РАБОТЕ");
        sleep(1000);
        businessProcessTask.click();
        executedTask.click();
        submitButtonTask.click();
        sleep(1000);
        Assertions.assertEquals(taskStatusCheck.getText(), "РЕШЕННЫЕ");
        sleep(1000);
        businessProcessTask.click();
        reopenedTask.click();
        submitButtonTask.click();
        sleep(1000);
        Assertions.assertEquals(taskStatusCheck.getText(), "ПЕРЕОТКРЫТ");
        sleep(1000);
        businessProcessTask.click();
        inWorkTask.click();
        sleep(1000);
        Assertions.assertEquals(taskStatusCheck.getText(), "В РАБОТЕ");
        sleep(1000);
        businessProcessTask.click();
        executedTask.click();
        submitButtonTask.click();
        sleep(1000);
        Assertions.assertEquals(taskStatusCheck.getText(), "РЕШЕННЫЕ");
        sleep(1000);
        businessProcessTask.click();
        approvedTask.click();
        submitButtonTask.click();
        sleep(1000);
        Assertions.assertEquals(taskStatusCheck.getText(), "ГОТОВО");
        doneTask.click();
        sleep(1000);
        Assertions.assertEquals(taskStatusCheck2.getText(), "Готово");

    }
}

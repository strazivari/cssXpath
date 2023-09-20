package steps;

import elements.mainPageElements;

import javax.xml.xpath.XPath;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class mainPageSteps extends mainPageElements {
    public static void loginFunc(){
        loginInput.setValue("AT16");
        passwordInput.setValue("Qwerty123");
        loginButton.shouldBe(visible, Duration.ofSeconds(3)).click();
    }
    public static void showAmountOfCompletedTasks() {
        System.out.println(completedTasks.getText());
    }
    public static void goToRequiredProject() {
        listOfCurrentProjects.click();
        requiredProject.click();
    }
//    public static void amountOfElementsAtSoloPage() {
//        String elementsAtSoloPage2 = elementsAtSoloPage.();
//        System.out.println(elementsAtSoloPage2);
//    }
    public static void search() {
        searchInput.setValue("TestSelenium");
        firstSearchResult.click();
    }
    public static void statusCheck() {
        System.out.println(status.getText());
    }
    public static void versionCheck() {
        System.out.println(version.getText());
    }
}

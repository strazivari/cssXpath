package steps;

import elements.mainPageElements;

import javax.xml.xpath.XPath;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class mainPageSteps extends mainPageElements {
    public static void goToRequiredProject() {
        listOfCurrentProjects.click();
        requiredProject.click();
    }

}

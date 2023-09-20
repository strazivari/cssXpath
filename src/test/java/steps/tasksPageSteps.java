package steps;

import elements.tasksPageElements;

public class tasksPageSteps extends tasksPageElements {
    public static void showAmountOfCompletedTasks() {
        System.out.println(completedTasks.getText());
    }
    //    public static void amountOfElementsAtSoloPage() {
//        String elementsAtSoloPage2 = elementsAtSoloPage.();
//        System.out.println(elementsAtSoloPage2);
//    }
    public static void search() {
        searchInput.setValue("TestSelenium");
        firstSearchResult.click();
    }
}

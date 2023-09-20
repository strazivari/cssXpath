package steps;

import elements.singleTaskPageElement;

public class singleTaskPageSteps extends singleTaskPageElement {
    public static void statusCheck() {
        System.out.println(status.getText());
    }
    public static void versionCheck() {
        System.out.println(version.getText());
    }
}

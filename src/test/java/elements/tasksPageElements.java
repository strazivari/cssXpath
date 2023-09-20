package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class tasksPageElements {
    public static SelenideElement completedTasks = $x ("//div[@class='showing']");
    //    public static SelenideElement elementsAtSoloPage = $x ("//ol[@class='issue-list']//li[49]");
    public static SelenideElement searchInput = $x ("//input[@id='quickSearchInput']");
    public static SelenideElement firstSearchResult = $x ("//li[@class='quick-search-result-item' and @original-title='TestSelenium'][1]");

}

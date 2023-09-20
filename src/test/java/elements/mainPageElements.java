package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class mainPageElements {
    public static SelenideElement loginInput = $x ("//input[@id='login-form-username']");
    public static SelenideElement passwordInput = $x ("//input[@id='login-form-password']");
    public static SelenideElement loginButton = $x ("//input[@value='Войти' or @value='Вход']");
    public static SelenideElement completedTasks = $x ("//div[@class='showing']");
    public static SelenideElement listOfCurrentProjects = $x ("//a[@id='browse_link']");
    public static SelenideElement requiredProject = $x ("//a[contains(text(),'Test (TEST)')]");
//    public static SelenideElement elementsAtSoloPage = $x ("//ol[@class='issue-list']//li[49]");
    public static SelenideElement searchInput = $x ("//input[@id='quickSearchInput']");
    public static SelenideElement firstSearchResult = $x ("//li[@class='quick-search-result-item' and @original-title='TestSelenium'][1]");
    public static SelenideElement status = $x ("//span [@id='status-val']//span");
    public static SelenideElement version = $x ("//span[@class='shorten']//a");
//    public static SelenideElement aElem = $x ("//a[contains(text(),'Главная')]");
}

package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class mainPageElements {
    public static SelenideElement loginInput = $x ("//input[@id='login-form-username']");
    public static SelenideElement passwordInput = $x ("//input[@id='login-form-password'] ");
    public static SelenideElement loginButton = $x ("//input[@value='Войти']");
//    public static SelenideElement aElem = $x ("//a[contains(text(),'Главная')]");
//    public static SelenideElement aElem = $x ("//a[contains(text(),'Главная')]");
//    public static SelenideElement aElem = $x ("//a[contains(text(),'Главная')]");
//    public static SelenideElement aElem = $x ("//a[contains(text(),'Главная')]");
//    public static SelenideElement aElem = $x ("//a[contains(text(),'Главная')]");
//    public static SelenideElement aElem = $x ("//a[contains(text(),'Главная')]");
//    public static SelenideElement aElem = $x ("//a[contains(text(),'Главная')]");
//    public static SelenideElement aElem = $x ("//a[contains(text(),'Главная')]");
//    public static SelenideElement aElem = $x ("//a[contains(text(),'Главная')]");
}

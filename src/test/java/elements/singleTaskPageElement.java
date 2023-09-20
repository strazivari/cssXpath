package elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class singleTaskPageElement {
    public static SelenideElement status = $x ("//span [@id='status-val']//span");
    public static SelenideElement version = $x ("//span[@class='shorten']//a");
//    public static SelenideElement aElem = $x ("//a[contains(text(),'Главная')]");
}

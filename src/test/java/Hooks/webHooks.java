package Hooks;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.open;

public class webHooks {
    @BeforeAll
    public void mainPage() {
        open("https://edujira.ifellow.ru/projects/TEST/issues/TEST-22095?filter=allopenissues");

    }
}

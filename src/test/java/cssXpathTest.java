import Hooks.webHooks;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class cssXpathTest extends webHooks {
    @Test
    public void loginTest() {
        open("https://edujira.ifellow.ru/projects/TEST/issues/TEST-22095?filter=allopenissues");
    }
}

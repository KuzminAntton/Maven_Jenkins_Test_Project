import org.testng.annotations.Test;

public class MainTest extends BaseTest {


    @Test
    public static void openUrl() {
        driver.navigate().to("https://vk.com/");
    }
}

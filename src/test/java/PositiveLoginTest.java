import Pages.QdPage;
import driversetup.ConfigReader;
import driversetup.Driver;
import org.testng.annotations.Test;

public class PositiveLoginTest {
    @Test (groups = "smoke")
    public void positiveLoginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        QdPage qdPage = new QdPage();
        qdPage.ilkLoginLinki.click();
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qdPage.loginButonu.click();
        Driver.closeDriver();
    }
}

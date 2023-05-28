import Pages.AmazonPage;
import driversetup.ConfigReader;
import driversetup.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ConfigReaderUse {
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);
        System.out.println(amazonPage.aramaSonucElementi.getText());
        Driver.closeDriver();
    }
}

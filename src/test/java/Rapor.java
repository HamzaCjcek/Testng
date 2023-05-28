import Pages.QdPage;
import driversetup.ConfigReader;
import driversetup.Driver;
import driversetup.TestBaseRapor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Rapor extends TestBaseRapor {
    @Test
    public void testRapor() {
        extentTest= extentReports.createTest("Pozitif login testi","gecerli bilgilerle giris yapilabilmeli");
        tearDownTest();
        // qd anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        extentTest.info("Qualitydemy anasayfaya gidildi");

        // login linkine tiklayin
        QdPage qdPage= new QdPage();
        qdPage.ilkLoginLinki.click();
        extentTest.info("Ilk login linkine tiklandi");

        // gecerli kullanici adi ve password ile giris yapin
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        extentTest.info("Gecerli email yazildi");
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        extentTest.info("Gecerli password yazildi");
        qdPage.loginButonu.click();
        extentTest.info("Login butonuna basildi");

        // basarili bir sekilde giris yapildigini test edin
        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());
        extentTest.pass("Basarili sekilde giris yapildigi test edildi");
    }
}

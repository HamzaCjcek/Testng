import Pages.QdPage;
import driversetup.ConfigReader;
import driversetup.Driver;
import org.testng.annotations.Test;

public class DataProvider {
    @org.testng.annotations.DataProvider
    public static Object[][] data()
    {
        String[][] siteListesi={{"amazonUrl"},{"wiseUrl"},{"qdUrl"},{"youtubeUrl"}};

        return siteListesi;
    }
    @org.testng.annotations.DataProvider
    public static Object[][] data1()
        {
            String[][] kullaniciList={{"Zafer","12345"},
                    {"Mehmet","34567"},
                    {"Sevilay","67890"},
                    {"Enver","56789"},
                    {"Ahmet Emre","54321"}};

            return kullaniciList;
        }
    @Test(dataProvider = "data")
    public void test(String site)
        {
            Driver.getDriver().get(ConfigReader.getProperty(site));

        }
        @Test(dataProvider = "data1")
        public void test1(String kullanici, String password)
        {
            QdPage qdPage= new QdPage();
            Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
            qdPage.ilkLoginLinki.click();
            qdPage.emailKutusu.sendKeys(kullanici);
            qdPage.passwordKutusu.sendKeys(password);
        }

}

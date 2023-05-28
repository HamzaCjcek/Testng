import Pages.AmazonPage;
import driversetup.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class C01 {
    AmazonPage amazonPage=new AmazonPage();
    @Test (priority = -10)
    public void test() {
        Driver.getDriver().get("http://www.youtube.com");
        Driver.bekle(2);
    }
    @Test (priority = 10)
    public void test2() {
        Driver.getDriver().get("http://www.amazon.com");
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        System.out.println(amazonPage.ilkUrun.getText());
        Driver.bekle(2);
        Driver.closeDriver();
    }
    @Test (priority = 20)
    public void test3() {
        Driver.getDriver().get("http://www.google.com");
        Driver.bekle(2);
    }
}

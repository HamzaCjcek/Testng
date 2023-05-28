import Pages.FacebookPage;
import com.github.javafaker.Faker;
import driversetup.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class facebooklogin {
    @Test
    public void facebooklogin() {
        FacebookPage fp = new FacebookPage();
        Driver.getDriver().get("https://www.facebook.com/");
        //fp.cookiesKabulButonu.click();
        Faker fk=new Faker();
        fp.emailKutusu.sendKeys(fk.internet().emailAddress());
        fp.passwordKutusu.sendKeys(fk.internet().password());
        fp.girisyapbuttonu.click();
        Assert.assertTrue(fp.girisYapilamadiYaziElementi.isDisplayed());
        Driver.bekle(2);
        Driver.closeDriver();

    }
}

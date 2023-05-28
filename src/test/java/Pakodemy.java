import Pages.PakodemyRegister;
import com.github.javafaker.Faker;
import driversetup.Driver;
import driversetup.TestBaseRapor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Pakodemy {
    @Test
    public void testPakodemy() {
        Driver.getDriver().get("https://web.pakodemy.com/register");
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        PakodemyRegister register = new PakodemyRegister();
        WebElement name = register.name;
        WebElement button = register.button;
        actions.click(name).
                sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .click(button)
                .perform();

    }
}

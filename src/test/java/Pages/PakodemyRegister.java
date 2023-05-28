package Pages;

import driversetup.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PakodemyRegister {

    public PakodemyRegister(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"names\"]")
    public WebElement name;

    @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/form/div[5]/button")
    public WebElement button;

}

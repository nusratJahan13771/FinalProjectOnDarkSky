package framework.webPages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage{


    private By signUpButtonDarkSky = By.xpath("//a[@class='button filled']");

    public void clickOnSignUPButtonDarksky(){
        clickOn(signUpButtonDarkSky);
    }

}

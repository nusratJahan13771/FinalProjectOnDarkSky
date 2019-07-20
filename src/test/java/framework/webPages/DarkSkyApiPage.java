package framework.webPages;

import org.openqa.selenium.By;

public class DarkSkyApiPage extends BasePage {

    private By darkSkyApi=By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");
    public void clickOnDarkSkyApi(){
        clickOn(darkSkyApi);
    }



}





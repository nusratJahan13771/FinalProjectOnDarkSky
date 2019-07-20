package framework.webPages;

import org.openqa.selenium.By;

public class MessengerLoginPage extends BasePage{

    private By messengerLink=By.linkText("Messenger");


    private By errorMessage = By.xpath("//div[contains(text(),'Incorrect email address or phone number')");

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }

        public void clickOnMessengerLinkk(By locator){

        clickOn(messengerLink);

    }
}


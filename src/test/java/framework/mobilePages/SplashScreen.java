package framework.mobilePages;

import framework.AppiumWrapper;
import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.testng.Assert;

import java.util.List;

public class SplashScreen extends MobileBasePage {
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='CONTINUE arrow forward ']")
    private MobileElement continueButton;
    @AndroidFindBy(xpath = "//android.webkit.WebView[@content-desc='Ionic Conference App']")
    private MobileElement welcomeToIca;

    @AndroidFindBy(className = "android.widget.Button")
    private List<MobileElement> listOfMenuButtons;

//    public boolean isContainGetListOfMenuButtons(){
//        String[] text = {"calendar Schedule","contacts Speakers ","map Map ","information circle About ","person Account ","help Support ","log out Logout ","hammer Show Tutorial "};
//        for(int i = 0; i < listOfMenuButtons.size(); i++){
//            if(listOfMenuButtons.get( i ).getAttribute("content-desc").equals(text[i])){
//                return true;
//            }
//        }
//        return false;
//    }




    public void getListOfMenuButtons(){
        for(MobileElement element: listOfMenuButtons){
           // System.out.println("Size of Menu Buttons "+element.getText());
            Assert.assertTrue(element.isDisplayed());
        }

    }

    public void tapOnWelcomeIca() {
        tapOn(welcomeToIca);
    }

    public boolean isContinueButtonDisplayed() {
        return isElementDisplayed(continueButton);
    }

    public void swipeLeftThreeTimes(int times) {
        Dimension size = AppiumWrapper.getAppiumDriver().manage().window().getSize();
        int anchor = size.height / 2;
        int startPoint = (int) (size.width * 0.8);
        int endPoint = (int) (size.width * 0.2);
        System.out.println("Size: " + size);
        System.out.println("Start Point: " + startPoint);
        System.out.println("End Point: " + endPoint);
        TouchAction touchAction = new TouchAction(AppiumWrapper.getAppiumDriver());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <times; i++) {
            touchAction.press(PointOption.point(startPoint, anchor)).moveTo(PointOption.point(endPoint, anchor)).release().perform();
        }

    }
}

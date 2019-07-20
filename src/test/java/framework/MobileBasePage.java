package framework;

import io.appium.java_client.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.touch.WaitOptions;

import java.time.Duration;

import static framework.AppiumWrapper.getAppiumDriver;

public class MobileBasePage {


    /**
     * This is a constructor which initializes initPageElements()
     */
    public MobileBasePage() {
        initPageElements();
    }

    /**
     * This method handles wait functionality for mobile actions, which means if the element is not found
     * during test then the app will re-try and wait up to 15 seconds before failing the test step
     */
    protected void initPageElements() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver(), Duration.ofSeconds(15)), this);
    }

    /**
     * This method is used to tap on element
     *
     * @param mobileElement element to tap on
     */
    protected void tapOn(MobileElement mobileElement) {
        try {
            mobileElement.click();
        } catch (NoSuchElementException e) {
            //Take Screenshot here
            //Send email notification
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }


    /**
     * This method is used to set value in text field
     * @param mobileElement
     * @param setValue
     *
     */
    protected void setValue(MobileElement mobileElement, String setValue) {

        try {
            mobileElement.sendKeys(setValue);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to verify if element is displayed
     *
     * @param mobileElement
     * @return
     */
    protected boolean isElementDisplayed(MobileElement mobileElement) {
        try {
            return mobileElement.isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }
    protected boolean isElementEnabled(MobileElement mobileElement) {
        try {
            return mobileElement.isEnabled();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    protected String getTextFromElement(MobileElement mobileElement) {
        String text;
        try {
            text = mobileElement.getText();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Element is not found with this locator: " + mobileElement.toString());
        }
        return text;
    }

    protected void swipeScreenHorizontally(int times) {

        Dimension size = AppiumWrapper.getAppiumDriver().manage().window().getSize();
        int startY = size.height / 2;
        int startX = (int) (size.width * 0.8);
        int endX = (int) (size.width * 0.2);
        System.out.println("Size: " + size);
        System.out.println("Start Point: " + startX);
        System.out.println("End Point: " + endX);
        TouchAction touchAction = new TouchAction(AppiumWrapper.getAppiumDriver());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < times; i++) {
           touchAction.press(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, startY)).release().perform();
        }
    }
    protected void swipeScreenVertically() {

        Dimension size = AppiumWrapper.getAppiumDriver().manage().window().getSize();
        int xPoint = size.width / 2;
        int yStartPoint = (int) (size.height * 0.5);
        int yEndPoint = (int) (size.height * 0.2);
        System.out.println("Size: " + size);
        System.out.println("Start Point: " + yStartPoint);
        System.out.println("End Point: " + yEndPoint);
        TouchAction touchAction = new TouchAction(AppiumWrapper.getAppiumDriver());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        touchAction.press(PointOption.point(xPoint,yStartPoint))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(xPoint,yEndPoint))
                .release().perform();
    }




//    public void swiptToBottom()
//    {
//        Dimension dim = AppiumWrapper.getAppiumDriver().manage().window().getSize();
//        int height = dim.getHeight();
//        int width = dim.getWidth();
//        int x = width/2;
//        int top_y = (int)(height*0.80);
//        int bottom_y = (int)(height*0.20);
//        System.out.println("coordinates :" + x + "  "+ top_y + " "+ bottom_y);
//        TouchAction ts = new TouchAction(getAppiumDriver());
//        ts.press(x, top_y).moveTo(x, bottom_y).release().perform();
//    }

}








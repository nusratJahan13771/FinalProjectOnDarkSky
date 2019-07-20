package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DarkSkyPage extends BasePage {
//for problem1
    private By darkSkyApi=By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");
    private By signUpButtonDarkSky=By.xpath("//a[@class='button filled']");
    private By register = By.xpath("//button[contains(text(),'Register')]");
   //for problem2
    private By currentTempOfDarksky=By.xpath("//span[@class='summary swap']") ;
    private By allTimeOfDarkSky=By.xpath("//div[@id='timeline']//div[@class='hours']/*/span");
    private By all=By.xpath("/div[1]/div[1]/div[3]/span/span");
    private By allTemperatureOfDarkSky=By.xpath("//div[@id='timeline']//div[@class='timeline']//div[@class='temps']//span//span");
//for problem 4
    private By allAmPmTimeOfTimeline=By.xpath("/div[1]/div[1]/div[3]/span/span");
    private By errorMsg = By.xpath("//input[@placeholder='hacker@example.com']");
    private By darkskyurlxpath = By.xpath("//span[@class='logo company-name']");
    private By displayedLowestTemp = By.xpath("//span[@class='minTemp']");

    private By displayedHighestTemp=By.cssSelector("body.forecast:nth-child(2) div.center:nth-child(7) a.day.revealed:nth-child(2) span.tempRange > span.maxTemp");
   // private By displayedHighestTemp = By.cssSelector("By.cssSelector(body.forecast:nth-child(2) div.center:nth-child(7) a.day.revealed:nth-child(2) span.tempRange > span.maxTemp");
    private By expandedLowestTemp = By.xpath("//span[@class='temp']");
   // private By expandedHighestTemp = By.cssSelector("body.forecast:nth-child(2) div.center:nth-child(7) div.dayDetails.revealed:nth-child(3) div.summary_container div.dayExtras div.highLowTemp.swip span.lowTemp.swap > span.temp");
    private By expandedHighestTemp=By.cssSelector("body.forecast:nth-child(2) div.center:nth-child(7) div.dayDetails.revealed:nth-child(3) div.summary_container div.dayExtras div.highLowTemp.swip span.lowTemp.swap > span.temp");
    private By clickOnExpandButton = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]/span[3]");

    public void clickOnExpandButton() {

        clickOn(clickOnExpandButton);

    }
    public void clickOnRegister() {
        clickOn(register);
    }

    public String geterrorMsg(String value) {
        return getTextFromElement(errorMsg);
    }

    public String getDark() {
        return getTextFromElement(darkskyurlxpath);
    }


    public String getDisplayedHighestTemp(){
        return getTextFromElement(displayedHighestTemp);
    }

    public String getexpandedHighestTemp(){
        return getTextFromElement(expandedHighestTemp);
    }



    public String getDisplayedLowestTemp(){
        return getTextFromElement(displayedLowestTemp);
    }



    public String getExpandedLowestTemp(){
        return getTextFromElement(expandedLowestTemp);
    }



     public void clickOnDarkSkyApi(){
        clickOn(darkSkyApi);
      }
     public void clickOnSignUPButtonDarksky(){
        clickOn(signUpButtonDarkSky);
     }



     public int getCurrentTemp(){
        String current=getTextFromElement(currentTempOfDarksky);
        int temp = Integer.parseInt(current.substring(0, 2));
        System.out.println("Current temp is " + temp);
        return temp;
     }

     public List<Integer> getWebTempList(){
        List<Integer> listOfIntTemp=new ArrayList<>();
        List<WebElement> allTempeatureOfTimeline=webActions(allTemperatureOfDarkSky);
        for (WebElement tempp : allTempeatureOfTimeline) {
            String Temp1 = tempp.getText();
            int allTempParse = Integer.parseInt(Temp1.substring(0, 2));
            listOfIntTemp.add(allTempParse);
        }
        Collections.sort(listOfIntTemp);
     //        System.out.println(listOfIntTemp);
        System.out.println("Lowest temp: " + listOfIntTemp.get(0));
        System.out.println("Highest temp: " + (listOfIntTemp.get(listOfIntTemp.size()-1)));
        return listOfIntTemp;
     }



     public List<WebElement> getAllTemps() {
        return webActions(allTimeOfDarkSky);
    }

    public List<WebElement> getAmPmTime(){
        return webActions(all);
    }


    public String getAllAmPmTime(){
        return getTextFromElement(allAmPmTimeOfTimeline);
    }
    }

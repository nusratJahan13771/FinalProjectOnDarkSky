package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.*;

import static stepdefinition.SharedSD.getDriver;

public class DarkskySD {


    private DarkSkyPage darkSkyPage = new DarkSkyPage();


    private DarkSkyApiPage darkSkyApiPage=new DarkSkyApiPage();
    private RegisterPage registerPage=new RegisterPage();

    @Given("^I am on Darksky Home Page$")
    public void iAmOnDarkskyHomePage() throws InterruptedException {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky - 260 Broadway, New York City, NY", "Invalid Home Page");
        Thread.sleep(2000);
    }


    @When("^I click on Dark Sky API button$")
    public void iClickOnDarkSkyApiButton() throws InterruptedException {
        darkSkyApiPage.clickOnDarkSkyApi();
        Thread.sleep(2000);
    }

    @When("^I click on SiGN UP button$")

    public void iClickOnSignUpButton() throws InterruptedException {
        registerPage.clickOnSignUPButtonDarksky();
        Thread.sleep(2000);
    }




    @And("^I click on Register button$")
    public void clickOnREgister() throws InterruptedException {
        darkSkyPage.clickOnRegister();
        Thread.sleep(2000);
    }


    @Then("^I verify that \"I am still on register page\"$")
    public void verifyErrorMessege() throws InterruptedException {
        //  Assert.assertEquals("Dark Sky API:  Register","Dark Sky API:  Register");
        Assert.assertEquals(darkSkyPage.getDark(), "Dark Sky API","I am not in Register Page");
        Thread.sleep(2000);


    }

    @Then("^I verify current temp is not greater or less then temps from daily timeline$")
    public void verifyCurrentTemp() throws InterruptedException {
        int minTemp = darkSkyPage.getWebTempList().get(0);
        int maxTemp = darkSkyPage.getWebTempList().get(darkSkyPage.getWebTempList().size()-1);
        Assert.assertTrue(minTemp<= darkSkyPage.getCurrentTemp() && darkSkyPage.getCurrentTemp() <= maxTemp );
    }


    @When("^I expand todays timeline$")
    public void expandTodaysTimeline() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
    }

    @Then("^I click on expandbutton on darkskypage$")
    public void clickOnExpandButton() throws InterruptedException{
        darkSkyPage.clickOnExpandButton();
        Thread.sleep(2000);
    }



    @Then("^I verify lowest and heighest temp is displayed correctly$")


    public void iVerifyLowestAndHighestTempIsDisplayedCorrectly() {




        Assert.assertEquals(darkSkyPage.getDisplayedHighestTemp(),darkSkyPage.getexpandedHighestTemp());
        Assert.assertEquals(darkSkyPage.getDisplayedLowestTemp(),darkSkyPage.getExpandedLowestTemp());

    }



    @Then("^I verify timeline is displayed with two hours incremented$")
    public void displayWithtwoHrsIncremination() throws InterruptedException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("ha");
        ArrayList<String> list = new ArrayList();
        list.add("NOW");
        for (int i = 0; i < 11; i ++) {
            cal.add(Calendar.HOUR_OF_DAY, 2);
            list.add(sdf.format(cal.getTime()));
        }

        System.out.println(list);

        ArrayList<String> timeNow = new ArrayList();

        List<WebElement> elements = darkSkyPage.getAllTemps();

        for (WebElement s1 : elements) {
            timeNow.add(s1.getText().toUpperCase());
        }
        System.out.println(timeNow);
        Assert.assertEquals(list,timeNow);

    }
    }






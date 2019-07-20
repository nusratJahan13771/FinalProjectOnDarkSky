package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HotelResultPage;
import framework.webPages.HotelDefaultPage;
import org.testng.Assert;

public class HotelSD {
    HotelDefaultPage hotelDefaultPage = new HotelDefaultPage();
    HotelResultPage hotelResultPage = new HotelResultPage();

    @Given("^I am on default locations search result screen$")

    public void DefaultLocationsSearchResultPage() throws InterruptedException {
        hotelDefaultPage.setWhereToGoField();
        hotelDefaultPage.clickOnAdd();
        hotelDefaultPage.clickOnSearchButton();
        Thread.sleep(2000);
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Hotels.com - hotels in Boston, Massachusetts, United States of America", "invalid page");
    }

    @Then("^I select property class (5 stars|4 stars|3 stars)$")

    public void selectPropertyClassStar(String stars) throws InterruptedException {

        switch (stars) {
            case "5 stars":
                hotelResultPage.clickOnFiveStar();
                break;
            case "4 stars":
                hotelResultPage.clickOnFourStar();
                break;
            case "3 stars":
                hotelResultPage.clickOnThreeStar();
                break;
        }
    }

    @Then("^I verify system displays only (5 stars|4 stars|3 stars) hotels on search result")
    public void verifySystemDisplaysStarHotels(String stars) throws InterruptedException{

        switch (stars) {
            case "5 stars":
                hotelResultPage.selectFivestar();
                break;
            case "4 stars":
                hotelResultPage.selectFourStar();
                break;
            case "3 stars":
                hotelResultPage.selectthreestar();
                break;
        }
    }


    @When("^I hoverover to distance in search result screen$")
    public void hoverOverToDistance() throws InterruptedException {
        hotelResultPage.moveToElementToDistance();

    }


    @Then("^I click on city centre$")
    public void clickOnCityCentre() throws InterruptedException {
        hotelResultPage.clickOnCityCentre();

    }


    @Then("^I verify system displays all hotels within 10 miles radius of airport$")


    public void verifySystemDisplaysAllHotelsWithin10milesRadius() {
        hotelResultPage.verifySystemDisplaysAllHotelsWithin10milesRadius();
    }

    @Then("^I verify Hilton Hotel is displayed$")

    public void verifyHiltonHotelIsDisplayed() throws InterruptedException {

       // hotelResultPage.setHiltonField();
        hotelResultPage.clickOnHiltonButton();
        hotelResultPage.scrolling();
        hotelResultPage.verifyHiltionHotelIsDisplayed();

    }
    }















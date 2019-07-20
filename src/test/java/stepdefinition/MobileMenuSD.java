package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobilePages.HomeScreen;
import framework.mobilePages.MainMenu;
import framework.mobilePages.SplashScreen;
import org.testng.Assert;

public class MobileMenuSD {

    private MainMenu mainMenu = new MainMenu();
    private HomeScreen homeScreen = new HomeScreen();
    private SplashScreen splashScreen=new SplashScreen();




    @When("^I tap on skip button$")
    public void clickOnSkipButton() {
        homeScreen.tapOnSkipButton();
    }

    @When("^I tap on menu button$")
    public void clickOnMenuButton() throws InterruptedException {
        Thread.sleep(30000);
        homeScreen.tapOnMainMenuButton();
    }

    @Then("^I verify sidebar menu is displayed$")
    public void verifySidebarMenu() {
        Assert.assertTrue(mainMenu.isMenuPresent());
    }

    @And("^I click on login button$")
    public void clickOnLoginButton() throws InterruptedException {
        Thread.sleep(30000);
        homeScreen.tapOnLoginn();

    }

    @And("^I set username and password$")
    public void setValue() throws InterruptedException {
        Thread.sleep(30000);
        homeScreen.setUserName();
        Thread.sleep(30000);
        homeScreen.setPassword();

    }

    @And("^I click on login again$")
    public void IClickOnLoginButton() throws InterruptedException {
        Thread.sleep(30000);
        homeScreen.tapOnTHirdLogin();

    }
    @And("^I click on menu button$")
    public void IclickOnMenuButtonAgain() throws InterruptedException{
        Thread.sleep(30000);
        homeScreen.tapOnMainMenuButton();

    }
    @And("^I click on log out$")
    public void clickOnLogOut() throws InterruptedException{
        Thread.sleep(30000);
        homeScreen.tapOnLogout();

    }
    @And("^I click on menu button again$")
    public void clickOnMenuButtonAgain() throws InterruptedException {
        Thread.sleep(30000);
        homeScreen.tapOnMainMenuButton();

    }
    @Then("^I verify login button is present$")
    public void loginButtonPresent(){
        Assert.assertTrue(mainMenu.isLoginPresent());

    }
    @When("^I clickOn Skip Button$")
    public void clickOnSkipButtonn(){
        homeScreen.tapOnSkipButton();

    }
    @And("^I click on hamburger menu$")
    public void clickOnHamburgerMenu() throws InterruptedException {
        Thread.sleep(3000);
        homeScreen.tapOnMainMenuButton();
    }

    @Then("^I verify default main menu bar fields$")
    public void verifyDefaultMainMenuBarFields() throws InterruptedException {
        Thread.sleep(30000);
        splashScreen.getListOfMenuButtons();
    }

    @When("^I click on filter button$")
    public void clickOnFilterButton() throws InterruptedException{
        Thread.sleep(3000);
        homeScreen.tapOnSkipButton();
        Thread.sleep(3000);
        homeScreen.tapOnFilter();
    }
    @And("^I disable \"Angular\" option$")
    public void DisableAngularOption()throws InterruptedException{
        Thread.sleep(4000);
        mainMenu.clickOnAngularButton();
    }

    @And("^I click on All Reset Filer button$")
    public void clickOnAllResetFilterButton() throws  InterruptedException{
        Thread.sleep(3000);
        homeScreen.tapOnAllFilters();
    }
    @Then("^I verify all options are enabled$")

    public void verifyAllOptionsAreEnabled(){
        Assert.assertTrue(mainMenu.isAngularButtonEnabled());
        Assert.assertTrue(mainMenu.isCommunicationsButtonEnabled());
        Assert.assertTrue(mainMenu.isDesignButtonEnabled());
        Assert.assertTrue(mainMenu.isDocumentationButtonEnabled());
        Assert.assertTrue(mainMenu.isfoodButtonEnabled());
        Assert.assertTrue(mainMenu.isIonicButtonEnabled());
        Assert.assertTrue(mainMenu.isNavigationButtonEnabled());
        Assert.assertTrue(mainMenu.isServicesButtonEnabled());
        Assert.assertTrue(mainMenu.isWorkshopButtonEnabled());
        Assert.assertTrue(mainMenu.isToolingButtonEnabled());
        Assert.assertTrue(mainMenu.isFoodButtonEnabled());
    }
    @When("^I swipe right 3 times on tutorials slides$")
    public void swipeRightOnTutorialsSlides() throws InterruptedException{
        Thread.sleep(30000);
        splashScreen.swipeLeftThreeTimes(3);

    }

    @Then("^I verify Continue button is displayed$")

    public void verifyContinueButtonIsDisplayed() throws InterruptedException{
        Assert.assertTrue(splashScreen.isContinueButtonDisplayed());

    }

}

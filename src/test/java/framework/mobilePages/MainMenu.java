package framework.mobilePages;

import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainMenu extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Menu']")
    private MobileElement sidebarHeader;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='log in Login ']")
    private MobileElement secondLOGIN;


    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Navigate ']")
    private MobileElement navigate;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='calendar Schedule ']")
    private MobileElement calendarSchedule;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='contacts Speakers ']")
    private MobileElement speakers;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='map Map ']")
    private MobileElement map;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='information circle About ']")
    private MobileElement about;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Account ']")
    private MobileElement account;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='help Support ']")
    private MobileElement support;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='person add Signup ']")
    private MobileElement signUp;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Tutorial ']")
    private MobileElement tutorial;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='hammer Show Tutorial ']")
    private MobileElement showTutorial;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Angular']")
    private MobileElement angular ;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Communication']")
    private MobileElement communications;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Design']")
    private MobileElement design;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Documentation']")
    private MobileElement documentation;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Food']")
    private MobileElement food;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Ionic']")
    private MobileElement ionic;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Navigation']")
    private MobileElement navigation;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Services']")
    private MobileElement services;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Tooling']")
    private MobileElement tooling;
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc='Workshop']")
    private MobileElement workshop;

    public void clickOnAngularButton(){
        tapOn(angular);
    }

    public boolean isAngularButtonEnabled() {
        return isElementEnabled(angular);
    }
    public boolean isCommunicationsButtonEnabled() {
        return isElementEnabled(communications);
    }
    public boolean isDesignButtonEnabled() {
        return isElementEnabled(design);
    }
    public boolean isDocumentationButtonEnabled() {
        return isElementEnabled(documentation);
    }
    public boolean isfoodButtonEnabled() {
        return isElementEnabled(food);
    }
    public boolean isIonicButtonEnabled() {
        return isElementEnabled(ionic);
    }
    public boolean isNavigationButtonEnabled() {
        return isElementEnabled(navigation);
    }
    public boolean isServicesButtonEnabled() {
        return isElementEnabled(services);
    }
    public boolean isToolingButtonEnabled() {
        return isElementEnabled(tooling);
    }
    public boolean isWorkshopButtonEnabled() {
        return isElementEnabled(workshop);
    }
    public boolean isFoodButtonEnabled() {
        return isElementEnabled(food);
    }

    public boolean isNavigatePresent() {
        return isElementDisplayed(navigate);
    }
    public boolean isLoginPresent() {
        return isElementDisplayed(secondLOGIN);
    }

    public boolean isCalendarSchedulePresent() {
        return isElementDisplayed(calendarSchedule);
    }
    public boolean isSpeakersPresent() {
        return isElementDisplayed(speakers);
    }
    public boolean isMapPresent() {
        return isElementDisplayed(map);
    }
    public boolean isAboutPresent() {
        return isElementDisplayed(about);
    }
    public boolean isAccountPresent() {
        return isElementDisplayed(account);
    }
    public boolean isSupportPresent() {
        return isElementDisplayed(support);
    }
    public boolean isSignUpPresent() {
        return isElementDisplayed(signUp);
    }
    public boolean isTutorialPresent() {
        return isElementDisplayed(tutorial);
    }
    public boolean isMenuPresent() {
        return isElementDisplayed(sidebarHeader);
    }
    public boolean isShowTutorialPresent() {
        return isElementDisplayed(showTutorial);
    }

}







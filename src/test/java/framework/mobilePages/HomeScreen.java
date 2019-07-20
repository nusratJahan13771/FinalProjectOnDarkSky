package framework.mobilePages;
import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomeScreen extends MobileBasePage {
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SKIP ']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement skipButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.widget.Button[1]")

    @iOSFindBy(accessibility = "undefined")
    private MobileElement mainMenu;
    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.widget.Button[7]")
     private MobileElement login;

     @AndroidFindBy(xpath = "//android.widget.EditText[@text='Username']")
     private MobileElement username;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    private MobileElement password;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='log in Login ']")
    private MobileElement secondLOGIN;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='log out Logout ']")
    private MobileElement logout;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='options ']")
    private MobileElement filter;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='LOGIN ']")
    private MobileElement thirdlogin;
    @AndroidFindBy(xpath = "//android.view.View[@index='1']")
    private MobileElement angularButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Reset All Filters ']")
    private MobileElement resetAllFilters;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Navigate ']")
    private MobileElement navigate;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='calendar Schedule ']")
    private MobileElement calendarSchedule;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='contacts Speakers  ']")
    private MobileElement Speakers;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='map Map ']")
    private MobileElement map;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='information circle About  ']")
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

    public void tapOnSkipButton() {
        tapOn(skipButton);
    }

    public void tapOnMainMenuButton() {
        tapOn(mainMenu);
    }
    public void tapOnLogin(){
        tapOn(login);
    }
    public void tapOnLoginn(){
        tapOn(secondLOGIN);
    }


    public void setUserName(){
        setValue(username,"pinky");

    }
    public void setPassword(){
        setValue(password,"pinky1234");
    }

    public void tapOnTHirdLogin() {
        tapOn(thirdlogin);
    }

    public void tapOnLogout(){
        tapOn(logout);
    }
    public void tapOnFilter(){
        tapOn(filter);
    }
    public void tapOnAllFilters(){
        tapOn(resetAllFilters);
    }



    public void tapOnAngularButton(){
        tapOn(angularButton);
    }


    }


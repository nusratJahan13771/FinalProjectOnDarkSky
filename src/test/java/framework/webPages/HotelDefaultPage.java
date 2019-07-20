package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import stepdefinition.SharedSD;

import static stepdefinition.SharedSD.getDriver;

public class HotelDefaultPage extends BasePage {
    private By searchButton=By.xpath("//button[@class='cta cta-strong']");
    private By pageTitle=By.xpath("//img[@class='logo']");
    private By deal=By.xpath("//a[@id='hdr-deals']");
    private By popUpXButton=By.xpath("//button[@class='cta widget-overlay-close']");
    private By destination=By.xpath("//input[@id='qf-0q-destination']");
    private By whereToGoField = By.xpath( "//input[@id='qf-0q-destination']" );
    private By add1=By.xpath("//span[@class='close-icon po-a cursor c-hds-arch-1 x-s']");

    public void clickOnSearchButton(){
        clickOn(searchButton);
    }
    public String getpagetitle(){
     return getTextFromElement(pageTitle);

    }
    public String get(){
        return getTextFromElement(deal);
    }


    public void clickOnSearchField() throws InterruptedException{
        WebElement element= SharedSD.getDriver().findElement(By.xpath("//button[@class='cta cta-strong']"));
        Actions actions =new Actions(getDriver());
        actions.click(element);
        Thread.sleep(2000);
    }

    public void clickOnAdd(){
        clickOn(popUpXButton);
    }

    public String getDestination(){
        return getTextFromElement(destination);
    }
    public void setWhereToGoField()throws InterruptedException{
        setValue( whereToGoField,"Boston, Massachusetts, United States of America" );
        Thread.sleep(2000);
    }

    public void setCityTextField(String city) {
        setValue(whereToGoField,city);
    }
    public void clickOnAdd1(){
        clickOn(add1);
    }

    }

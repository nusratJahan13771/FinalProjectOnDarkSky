package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import stepdefinition.SharedSD;
import java.util.ArrayList;
import java.util.List;
import static stepdefinition.SharedSD.getDriver;

public class HotelResultPage extends BasePage {

    private By distance = By.xpath("//a[contains(text(),'Distance')]");
    private By cityCentre = By.xpath("//a[contains(text(),'City center')]");
    private By hiltonDistanceFromCityCentre = By.xpath("//li[contains(text(),'2.2 miles to City center')]");
    private By all19Hotels = By.xpath("//h3[@class='p-name']");
    private By lasVegas = By.xpath("//h1[contains(text(),'Las Vegas, Nevada, United States of America')]");
    private By hotelsWithinTenMilesRadius = By.xpath("//h3[@class='p-name']");
    private By fiveStarsBox = By.xpath("//span[@class='star-rating']");
    private By hotelDistanceFromAirport = By.xpath("//ul[@class='property-landmarks']/child::li[2]");
    private By hiltonBostonLoganAirport = By.xpath("//li[contains(text(),'0.2 miles to Logan International Airport (BOS)')]  ");
    private By threeStarButton = By.xpath("//input[@id='f-star-rating-3']");
    private By distanceFromCityCentreFiveElements = By.xpath("//ul[@class='property-landmarks']//child::li[1]");
    private By hiltonField = By.xpath("//input[@id='f-name']");
    private By hiltonSearchButton = By.xpath("//button[@id='f-name-cta']");
    private By distanceFirstHotelOfHilton = By.xpath("//li[contains(text(),'1.9 miles to City center')]");
    private By fourStar = By.xpath("//input[@id='f-star-rating-4']");
    private By fiveStar = By.xpath("//input[@id='f-star-rating-5']");
    private By allThreeStar = By.xpath("//*[@class='star-rating-text']");
    private By allFourStar = By.xpath("//*[@class='star-rating-text star-rating-text-strong']");
    private By add=By.xpath("/button[@class='cta widget-overlay-close']  ");


    public void moveToElementToDistance() throws InterruptedException {
        SharedSD.getDriver().manage().window().maximize();
        WebElement element = SharedSD.getDriver().findElement(By.xpath("//a[contains(text(),'Distance')]"));
        Actions actions = new Actions(SharedSD.getDriver());
        actions.moveToElement(element).build().perform();
        Thread.sleep(4000);
    }


    public void clickOnCityCentre() throws InterruptedException {
        clickOn(cityCentre);
        Thread.sleep(4000);
    }

    public String getDistanceFromCityCentreForHilton() {
        return getTextFromElement(hiltonDistanceFromCityCentre);
    }

    public List<WebElement> getAll19Hotels() {
        return webActions(all19Hotels);
    }


    public List<String> getallHotels() {
        List<String> listOfAllHotels = new ArrayList<>();
        List<WebElement> allHotels = webActions(all19Hotels);
        for (WebElement hotel : allHotels) {
            String hotell = hotel.getText();
            listOfAllHotels.add(hotell);

        }
        return listOfAllHotels;

    }


    public String getREsultPageAfterSearch() {
        return getTextFromElement(lasVegas);
    }

    public List<WebElement> getHotelsDistanceFromAirport() {
        return webActions(hotelDistanceFromAirport);
    }

    public String getHiltonBostonLogan() {
        return getTextFromElement(hiltonBostonLoganAirport);
    }


    public void clickOnThreeStar() throws InterruptedException {
        scrollIntoElement();
        clickOn(threeStarButton);
    }

    public List<WebElement> getDistancefor5elementsFromCityCentre() {
        return webActions(distanceFromCityCentreFiveElements);

    }


    public void clickOnHiltonButton() {
        clickOn(hiltonSearchButton);
    }

    public String getdistanceFirstHotelOfHilton() {
        return getTextFromElement(distanceFirstHotelOfHilton);
    }


    public void clickOnFourStar() throws InterruptedException {
        scrollIntoElement();
        clickOn(fourStar);
    }

    public void clickOnFiveStar() throws InterruptedException {
        scrollIntoElement();
        clickOn(fiveStar);
    }

    public List<WebElement> getAllThreeStars() {
        return webActions(allThreeStar);
    }


    public List<WebElement> getAllFourStars() {
        return webActions(allFourStar);
    }


    public void scrollIntoView() throws InterruptedException {
        for (int second = 0; ; second++) {
            if (second >= 15) {
                break;
            }
            ((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(0,500)");
            Thread.sleep(2000);
        }

    }

    public void selectthreestar() throws InterruptedException {
        scrollIntoView();
        List<WebElement> allThreeStars = SharedSD.getDriver().findElements(By.xpath("//span[@class='star-rating-text']"));
        for (int i = 0; i < allThreeStars.size(); i++) {
            int starr = Integer.parseInt(allThreeStars.get(i).getText().substring(0, 1));
            System.out.println(starr);
            Assert.assertTrue(starr == 3);
        }
    }

    public void selectFourStar() throws InterruptedException {
        scrollIntoView();
        List<WebElement> Stars = SharedSD.getDriver().findElements(By.xpath("//span[@class='star-rating-text star-rating-text-strong']"));
        for (int i = 0; i < Stars.size(); i++) {
            int starr = Integer.parseInt(Stars.get(i).getText().substring(0, 1));
            System.out.println(starr);
            Assert.assertTrue(starr == 4);
        }
    }

    public void selectFivestar() throws InterruptedException {
        scrollIntoView();
        List<WebElement> Stars = SharedSD.getDriver().findElements(By.xpath("//span[@class='star-rating-text star-rating-text-strong']"));
        for (int i = 0; i < Stars.size(); i++) {
            int starr = Integer.parseInt(Stars.get(i).getText().substring(0, 1));
            System.out.println(starr);
            Assert.assertTrue(starr == 5);
        }

    }

    public void verifySystemDisplaysAllHotelsWithin10milesRadius() {
        scrolling();

        List<WebElement> allDistanceFromCityCenter = SharedSD.getDriver().findElements(By.xpath("//ul[@class='property-landmarks']//child::li[1]"));
        for (int i = 0; i < allDistanceFromCityCenter.size(); i++) {
            String element =allDistanceFromCityCenter.get(i).getText();
            System.out.println(element);
            Assert.assertTrue(!(element == "10"));
        }

    }


    public void verifyHiltionHotelIsDisplayed() {
        List<WebElement> allelements = SharedSD.getDriver().findElements(By.xpath("//h3[@class='p-name']"));

        boolean isHiltonDisplayed = false;
        for (int i = 0; i < allelements.size(); i++) {
            String hiltonVerify = allelements.get(i).getText();
            System.out.println(hiltonVerify);
            if (hiltonVerify.contains("Hilton")) {
                isHiltonDisplayed = true;

            }
            Assert.assertTrue(isHiltonDisplayed, "Hilton is not present in the list");
        }
    }




    public void scrollIntoElement() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,150)");
        Thread.sleep(2000);
    }




    public  void clickOnAdd(){
        clickOn(add);
    }

    public void scrolling(){
        JavascriptExecutor JS= (JavascriptExecutor)getDriver();
        JS.executeScript("window.scrollBy(0,1200)");
    }


    }










































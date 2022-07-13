package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class RealtHomePage extends BasePage{

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRoomsX = By.id("rooms");
    private final By set2RoomsX = By.xpath("//select[@id=\"rooms\"]/option[@value='2']");
    private final By  findBtnX = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");


    public RealtHomePage enterCountRooms(){
        driver.findElement(countRoomsX);
        driver.findElement(set2RoomsX);
        return this;
    }
    public RealtHomePage clickToFind(){
        WebElement findBtn = driver.findElement(findBtnX);
        waitElementVisible(findBtn).click();
        return this;
    }
}

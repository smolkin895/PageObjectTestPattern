package realt.by;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RealtHomePage extends BasePage{

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRooms = By.id("rooms");
    private final By count2rooms = By.xpath("//select[@id=\"rooms\"]/option[@value='2']");
    private final By  findFlat = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");
}

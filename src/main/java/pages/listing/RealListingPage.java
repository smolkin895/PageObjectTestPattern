package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class RealListingPage extends BasePage {
    public RealListingPage(WebDriver driver) {
        super(driver);
    }

    private final By listItem =  By.xpath("//div[@class='listing-item']");

    public RealListingPage checkCountTransition(){
        int  countCard = driver.findElements(listItem).size();
        Assert.assertEquals(countCard, 4);
        return this;
    }
}

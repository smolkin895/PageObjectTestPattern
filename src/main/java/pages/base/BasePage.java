package pages.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constants.TimeOutVariable.EXPLICITLY_WAIT;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }

    public void open(String url){
        driver.get(url);
    }

    public WebElement waitElementVisible(WebElement element){
        return new WebDriverWait(driver, Duration.ofSeconds(EXPLICITLY_WAIT)).until(ExpectedConditions.visibilityOf(element));
    }

}

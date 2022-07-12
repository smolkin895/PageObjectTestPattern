package common;


import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import constants.Constants.TimeOutVariable;


import java.util.concurrent.TimeUnit;

import static common.Config.PLATFORM;

public class CommonActions {
    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch(PLATFORM){
            case "win_chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                Assert.fail("Platform is incorrect: " + PLATFORM);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TimeOutVariable.IMPLICITLY_WAIT, TimeUnit.SECONDS );
        return  driver;
    }
}

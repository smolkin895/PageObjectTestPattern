package searchflat;

import base.BaseTest;

import static constants.Constants.Urls.REALT_HOME_PAGE;

public class SearchFlatTest extends BaseTest {
    public void checkIdRedirectingToListing(){
        basePage.open(REALT_HOME_PAGE);
        realtHomePage
                .enterCountRooms()
                .clickToFind();
    }
}

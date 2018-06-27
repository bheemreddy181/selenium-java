package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import tests.categories.Regression;
import tests.categories.Smoke;

public class HerokuMainPageTests extends BaseTest{

    @Test
    @Category(Smoke.class)
    public void testEditLinks() {
        homePage.clickChallengingDomLink();
        driver.navigate().back();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("heroku"));
    }
}

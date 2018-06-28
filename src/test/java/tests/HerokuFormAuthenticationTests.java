package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import tests.categories.Regression;
import tests.categories.Smoke;
import pages.FormAuthentication;
import pages.HomePage;

public class HerokuFormAuthenticationTests extends BaseTest {

    @Test
    @Category({Smoke.class, Regression.class})
    public void testLogin() {
        homePage.clickFormAuthenticationLink();
        FormAuthentication loginPage = new FormAuthentication(driver);
        loginPage.login(propertyReader.readProperty("username"), propertyReader.readProperty("password"));

        // Verify we're logged-in
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("secure"));

        // Verify we're logged-out
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a/i")).click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("login"));
    }

    @Test
    @Category({Smoke.class, Regression.class})
    public void testLoginBadUsername() {
        homePage.clickFormAuthenticationLink();
        FormAuthentication loginPage = new FormAuthentication(driver);
        loginPage.login("user", propertyReader.readProperty("password"));

        // Verify we're not logged-in
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("login"));
        String msg = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        Assert.assertTrue(msg.contains("Your username is invalid"));

    }

    @Test
    @Category({Smoke.class, Regression.class})
    public void testLoginBadPassword() {
        homePage.clickFormAuthenticationLink();
        FormAuthentication loginPage = new FormAuthentication(driver);
        loginPage.login(propertyReader.readProperty("username"), "password");

        // Verify we're not logged-in
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("login"));
        String msg = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        Assert.assertTrue(msg.contains("Your password is invalid"));

    }
}

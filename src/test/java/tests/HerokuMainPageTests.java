package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import tests.categories.Regression;
import tests.categories.Smoke;

public class HerokuMainPageTests extends BaseTest {

    @Test
    @Category({Smoke.class, Regression.class})
    public void testAbTestingLink() {
        homePage.clickAbTestingLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("abtest"));
    }

    @Test
    @Category(Smoke.class)
    public void testBrokenImagesLink() {
        homePage.clickBrokenImagesLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("broken_images"));
    }

    @Test
    @Category(Smoke.class)
    public void testChallengingDomLink() {
        homePage.clickChallengingDomLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("challenging_dom"));
    }

    @Test
    @Category(Smoke.class)
    public void testCheckboxesLink() {
        homePage.clickCheckboxesLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("checkboxes"));
    }

    @Test
    @Category(Smoke.class)
    public void testContextMenuLink() {
        homePage.clickContextMenuLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("context_menu"));
    }

    @Test
    @Category(Smoke.class)
    public void testDisappearingElementsLink() {
        homePage.clickDisappearingElementsLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("disappearing_elements"));
    }

    @Test
    @Category(Smoke.class)
    public void testDragAndDropLink() {
        homePage.clickDragAndDropLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("drag_and_drop"));
    }

    @Test
    @Category(Smoke.class)
    public void testDropdownLink() {
        homePage.clickDropdownLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dropdown"));
    }

    @Test
    @Category(Smoke.class)
    public void testDynamicContentLink() {
        homePage.clickDynamicContentLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dynamic_content"));
    }

    @Test
    @Category(Smoke.class)
    public void testDynamicControlsLink() {
        homePage.clickDynamicControlsLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dynamic_controls"));
    }

    @Test
    @Category(Smoke.class)
    public void testDynamicLoadingLink() {
        homePage.clickDynamicLoadingLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("dynamic_loading"));
    }

    @Test
    @Category(Smoke.class)
    public void testclickExitIntentLink() {
        homePage.clickExitIntentLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("exit_intent"));
    }

    @Test
    @Category(Smoke.class)
    public void testFileDownloadLink() {
        homePage.clickFileDownloadLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("download"));
    }

    @Test
    @Category(Smoke.class)
    public void testFileUploadLink() {
        homePage.clickFileUploadLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("upload"));

    }

    @Test
    @Category(Smoke.class)
    public void testFloatingMenuLink() {
        homePage.clickFloatingMenuLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("floating_menu"));

    }

    @Test
    @Category(Smoke.class)
    public void testForgotPasswordLink() {
        homePage.clickForgotPasswordLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("forgot_password"));

    }

    @Test
    @Category(Smoke.class)
    public void testAuthenticationFormLink() {
        homePage.clickFormAuthenticationLink();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("login"));

    }


}

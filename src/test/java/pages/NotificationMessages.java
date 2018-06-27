package pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotificationMessages {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='/notification_message']")
    @CacheLookup
    private WebElement clickHere;

    @FindBy(css = "a[href='http://elementalselenium.com/']")
    @CacheLookup
    private WebElement elementalSelenium;

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet']")
    @CacheLookup
    private WebElement forkMeOnGithub;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    private final String pageLoadedText = "It is often used to convey information about an action previously taken by the user";

    private final String pageUrl = "/notification_message_rendered";

    public NotificationMessages() {
    }

    public NotificationMessages(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public NotificationMessages(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public NotificationMessages(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Click Here Link.
     *
     * @return the NotificationMessages class instance.
     */
    public NotificationMessages clickClickHereLink() {
        clickHere.click();
        return this;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the NotificationMessages class instance.
     */
    public NotificationMessages clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the NotificationMessages class instance.
     */
    public NotificationMessages clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the NotificationMessages class instance.
     */
    public NotificationMessages clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the NotificationMessages class instance.
     */
    public NotificationMessages submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the NotificationMessages class instance.
     */
    public NotificationMessages verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the NotificationMessages class instance.
     */
    public NotificationMessages verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

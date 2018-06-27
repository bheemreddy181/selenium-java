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

public class Geolocation {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='http://elementalselenium.com/']")
    @CacheLookup
    private WebElement elementalSelenium;

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet']")
    @CacheLookup
    private WebElement forkMeOnGithub;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    private final String pageLoadedText = "Click the button to get your current latitude and longitude";

    private final String pageUrl = "/geolocation";

    @FindBy(css = "#content div.example button")
    @CacheLookup
    private WebElement whereAmI;

    public Geolocation() {
    }

    public Geolocation(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public Geolocation(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public Geolocation(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the Geolocation class instance.
     */
    public Geolocation clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the Geolocation class instance.
     */
    public Geolocation clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the Geolocation class instance.
     */
    public Geolocation clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Click on Where Am I Button.
     *
     * @return the Geolocation class instance.
     */
    public Geolocation clickWhereAmIButton() {
        whereAmI.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the Geolocation class instance.
     */
    public Geolocation submit() {
        clickWhereAmIButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the Geolocation class instance.
     */
    public Geolocation verifyPageLoaded() {
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
     * @return the Geolocation class instance.
     */
    public Geolocation verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

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

public class StatusCodes {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='status_codes/200']")
    @CacheLookup
    private WebElement _200;

    @FindBy(css = "a[href='status_codes/301']")
    @CacheLookup
    private WebElement _301;

    @FindBy(css = "a[href='status_codes/404']")
    @CacheLookup
    private WebElement _404;

    @FindBy(css = "a[href='status_codes/500']")
    @CacheLookup
    private WebElement _500;

    @FindBy(css = "a[href='http://elementalselenium.com/']")
    @CacheLookup
    private WebElement elementalSelenium;

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet']")
    @CacheLookup
    private WebElement forkMeOnGithub;

    @FindBy(css = "a[href='http://www.iana.org/assignments/http-status-codes/http-status-codes.xhtml']")
    @CacheLookup
    private WebElement here;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    private final String pageLoadedText = "HTTP status codes are a standard set of numbers used to communicate from a web server to your browser to indicate the outcome of the request being made (e";

    private final String pageUrl = "/status_codes";

    public StatusCodes() {
    }

    public StatusCodes(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public StatusCodes(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public StatusCodes(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the StatusCodes class instance.
     */
    public StatusCodes clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the StatusCodes class instance.
     */
    public StatusCodes clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on Here Link.
     *
     * @return the StatusCodes class instance.
     */
    public StatusCodes clickHereLink() {
        here.click();
        return this;
    }

    /**
     * Click on 200 Link.
     *
     * @return the StatusCodes class instance.
     */
    public StatusCodes clickLink200() {
        _200.click();
        return this;
    }

    /**
     * Click on 301 Link.
     *
     * @return the StatusCodes class instance.
     */
    public StatusCodes clickLink301() {
        _301.click();
        return this;
    }

    /**
     * Click on 404 Link.
     *
     * @return the StatusCodes class instance.
     */
    public StatusCodes clickLink404() {
        _404.click();
        return this;
    }

    /**
     * Click on 500 Link.
     *
     * @return the StatusCodes class instance.
     */
    public StatusCodes clickLink500() {
        _500.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the StatusCodes class instance.
     */
    public StatusCodes clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the StatusCodes class instance.
     */
    public StatusCodes submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the StatusCodes class instance.
     */
    public StatusCodes verifyPageLoaded() {
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
     * @return the StatusCodes class instance.
     */
    public StatusCodes verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

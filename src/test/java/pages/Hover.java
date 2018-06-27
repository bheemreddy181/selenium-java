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

public class Hover {
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

    private final String pageLoadedText = "Hover over the image for additional information";

    private final String pageUrl = "/hovers";

    @FindBy(css = "a[href='/users/1']")
    @CacheLookup
    private WebElement viewProfile1;

    @FindBy(css = "a[href='/users/2']")
    @CacheLookup
    private WebElement viewProfile2;

    @FindBy(css = "a[href='/users/3']")
    @CacheLookup
    private WebElement viewProfile3;

    public Hover() {
    }

    public Hover(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public Hover(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public Hover(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the Hover class instance.
     */
    public Hover clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the Hover class instance.
     */
    public Hover clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the Hover class instance.
     */
    public Hover clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Click on View Profile Link.
     *
     * @return the Hover class instance.
     */
    public Hover clickViewProfile1Link() {
        viewProfile1.click();
        return this;
    }

    /**
     * Click on View Profile Link.
     *
     * @return the Hover class instance.
     */
    public Hover clickViewProfile2Link() {
        viewProfile2.click();
        return this;
    }

    /**
     * Click on View Profile Link.
     *
     * @return the Hover class instance.
     */
    public Hover clickViewProfile3Link() {
        viewProfile3.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the Hover class instance.
     */
    public Hover submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the Hover class instance.
     */
    public Hover verifyPageLoaded() {
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
     * @return the Hover class instance.
     */
    public Hover verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

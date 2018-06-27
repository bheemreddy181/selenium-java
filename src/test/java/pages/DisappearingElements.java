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

public class DisappearingElements {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='/about/']")
    @CacheLookup
    private WebElement about;

    @FindBy(css = "a[href='/contact-us/']")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "a[href='http://elementalselenium.com/']")
    @CacheLookup
    private WebElement elementalSelenium;

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet']")
    @CacheLookup
    private WebElement forkMeOnGithub;

    @FindBy(css = "a[href='/gallery/']")
    @CacheLookup
    private WebElement gallery;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    private final String pageLoadedText = "This example demonstrates when elements on a page change by disappearing/reappearing on each page load";

    private final String pageUrl = "/disappearing_elements";

    @FindBy(css = "a[href='/portfolio/']")
    @CacheLookup
    private WebElement portfolio;

    public DisappearingElements() {
    }

    public DisappearingElements(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public DisappearingElements(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public DisappearingElements(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the DisappearingElements class instance.
     */
    public DisappearingElements clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the DisappearingElements class instance.
     */
    public DisappearingElements clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the DisappearingElements class instance.
     */
    public DisappearingElements clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the DisappearingElements class instance.
     */
    public DisappearingElements clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on Gallery Link.
     *
     * @return the DisappearingElements class instance.
     */
    public DisappearingElements clickGalleryLink() {
        gallery.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the DisappearingElements class instance.
     */
    public DisappearingElements clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the DisappearingElements class instance.
     */
    public DisappearingElements clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Click on Portfolio Link.
     *
     * @return the DisappearingElements class instance.
     */
    public DisappearingElements clickPortfolioLink() {
        portfolio.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the DisappearingElements class instance.
     */
    public DisappearingElements submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the DisappearingElements class instance.
     */
    public DisappearingElements verifyPageLoaded() {
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
     * @return the DisappearingElements class instance.
     */
    public DisappearingElements verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

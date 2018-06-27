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

public class JavaScriptAlerts {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#content div.example ul li:nth-of-type(1) button")
    @CacheLookup
    private WebElement clickForJsAlert;

    @FindBy(css = "#content div.example ul li:nth-of-type(2) button")
    @CacheLookup
    private WebElement clickForJsConfirm;

    @FindBy(css = "#content div.example ul li:nth-of-type(3) button")
    @CacheLookup
    private WebElement clickForJsPrompt;

    @FindBy(css = "a[href='http://elementalselenium.com/']")
    @CacheLookup
    private WebElement elementalSelenium;

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet']")
    @CacheLookup
    private WebElement forkMeOnGithub;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    private final String pageLoadedText = "Here are some examples of different JavaScript alerts which can be troublesome for automation";

    private final String pageUrl = "/javascript_alerts";

    public JavaScriptAlerts() {
    }

    public JavaScriptAlerts(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public JavaScriptAlerts(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public JavaScriptAlerts(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Click For Js Alert Button.
     *
     * @return the JavaScriptAlerts class instance.
     */
    public JavaScriptAlerts clickClickForJsAlertButton() {
        clickForJsAlert.click();
        return this;
    }

    /**
     * Click on Click For Js Confirm Button.
     *
     * @return the JavaScriptAlerts class instance.
     */
    public JavaScriptAlerts clickClickForJsConfirmButton() {
        clickForJsConfirm.click();
        return this;
    }

    /**
     * Click on Click For Js Prompt Button.
     *
     * @return the JavaScriptAlerts class instance.
     */
    public JavaScriptAlerts clickClickForJsPromptButton() {
        clickForJsPrompt.click();
        return this;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the JavaScriptAlerts class instance.
     */
    public JavaScriptAlerts clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the JavaScriptAlerts class instance.
     */
    public JavaScriptAlerts clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the JavaScriptAlerts class instance.
     */
    public JavaScriptAlerts clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the JavaScriptAlerts class instance.
     */
    public JavaScriptAlerts submit() {
        clickClickForJsAlertButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the JavaScriptAlerts class instance.
     */
    public JavaScriptAlerts verifyPageLoaded() {
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
     * @return the JavaScriptAlerts class instance.
     */
    public JavaScriptAlerts verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

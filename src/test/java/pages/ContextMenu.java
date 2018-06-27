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

public class ContextMenu {
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

    private final String pageLoadedText = "Context menu items are custom additions that appear in the right-click menu";

    private final String pageUrl = "/context_menu";

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet/issues/12']")
    @CacheLookup
    private WebElement thisOpenIssue;

    public ContextMenu() {
    }

    public ContextMenu(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public ContextMenu(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public ContextMenu(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the ContextMenu class instance.
     */
    public ContextMenu clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the ContextMenu class instance.
     */
    public ContextMenu clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the ContextMenu class instance.
     */
    public ContextMenu clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Click on This Open Issue Link.
     *
     * @return the ContextMenu class instance.
     */
    public ContextMenu clickThisOpenIssueLink() {
        thisOpenIssue.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the ContextMenu class instance.
     */
    public ContextMenu submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the ContextMenu class instance.
     */
    public ContextMenu verifyPageLoaded() {
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
     * @return the ContextMenu class instance.
     */
    public ContextMenu verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

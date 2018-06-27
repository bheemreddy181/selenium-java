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

public class DynamicContent {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='/dynamic_content?with_content=static']")
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

    private final String pageLoadedText = "Accusamus facilis omnis adipisci eum autem consequatur ab et corporis sit expedita amet facere autem officia odio voluptatibus deleniti occaecati dolores consequatur quaerat sed repellendus exercitationem dolor perferendis est itaque deserunt rerum";

    private final String pageUrl = "/dynamic_content";

    public DynamicContent() {
    }

    public DynamicContent(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public DynamicContent(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public DynamicContent(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Click Here Link.
     *
     * @return the DynamicContent class instance.
     */
    public DynamicContent clickClickHereLink() {
        clickHere.click();
        return this;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the DynamicContent class instance.
     */
    public DynamicContent clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the DynamicContent class instance.
     */
    public DynamicContent clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the DynamicContent class instance.
     */
    public DynamicContent clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the DynamicContent class instance.
     */
    public DynamicContent submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the DynamicContent class instance.
     */
    public DynamicContent verifyPageLoaded() {
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
     * @return the DynamicContent class instance.
     */
    public DynamicContent verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

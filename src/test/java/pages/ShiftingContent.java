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

public class ShiftingContent {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='http://elementalselenium.com/']")
    @CacheLookup
    private WebElement elementalSelenium;

    @FindBy(css = "a[href='/shifting_content/menu']")
    @CacheLookup
    private WebElement example1MenuElement;

    @FindBy(css = "a[href='/shifting_content/image']")
    @CacheLookup
    private WebElement example2AnImage;

    @FindBy(css = "a[href='/shifting_content/list']")
    @CacheLookup
    private WebElement example3List;

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet']")
    @CacheLookup
    private WebElement forkMeOnGithub;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    private final String pageLoadedText = "These examples demonstrate elements on a page shifting a few pixels in either direction on each page load";

    private final String pageUrl = "/shifting_content";

    public ShiftingContent() {
    }

    public ShiftingContent(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public ShiftingContent(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public ShiftingContent(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the ShiftingContent class instance.
     */
    public ShiftingContent clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Example 1 Menu Element Link.
     *
     * @return the ShiftingContent class instance.
     */
    public ShiftingContent clickExample1MenuElementLink() {
        example1MenuElement.click();
        return this;
    }

    /**
     * Click on Example 2 An Image Link.
     *
     * @return the ShiftingContent class instance.
     */
    public ShiftingContent clickExample2AnImageLink() {
        example2AnImage.click();
        return this;
    }

    /**
     * Click on Example 3 List Link.
     *
     * @return the ShiftingContent class instance.
     */
    public ShiftingContent clickExample3ListLink() {
        example3List.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the ShiftingContent class instance.
     */
    public ShiftingContent clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the ShiftingContent class instance.
     */
    public ShiftingContent clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the ShiftingContent class instance.
     */
    public ShiftingContent submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the ShiftingContent class instance.
     */
    public ShiftingContent verifyPageLoaded() {
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
     * @return the ShiftingContent class instance.
     */
    public ShiftingContent verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

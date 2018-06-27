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

public class DynamicControls {
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

    private final String pageLoadedText = "This example demonstrates when controls (e";

    private final String pageUrl = "/dynamic_controls";

    @FindBy(id = "btn")
    @CacheLookup
    private WebElement remove;

    @FindBy(id = "checkbox")
    @CacheLookup
    private WebElement thisExampleDemonstratesWhenControlsE;

    public DynamicControls() {
    }

    public DynamicControls(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public DynamicControls(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public DynamicControls(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the DynamicControls class instance.
     */
    public DynamicControls clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the DynamicControls class instance.
     */
    public DynamicControls clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the DynamicControls class instance.
     */
    public DynamicControls clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Click on Remove Button.
     *
     * @return the DynamicControls class instance.
     */
    public DynamicControls clickRemoveButton() {
        remove.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the DynamicControls class instance.
     */
    public DynamicControls fill() {
        setThisExampleDemonstratesWhenControlsECheckboxField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the DynamicControls class instance.
     */
    public DynamicControls fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set This Example Demonstrates When Controls E Checkbox field.
     *
     * @return the DynamicControls class instance.
     */
    public DynamicControls setThisExampleDemonstratesWhenControlsECheckboxField() {
        if (!thisExampleDemonstratesWhenControlsE.isSelected()) {
            thisExampleDemonstratesWhenControlsE.click();
        }
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the DynamicControls class instance.
     */
    public DynamicControls submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Unset This Example Demonstrates When Controls E Checkbox field.
     *
     * @return the DynamicControls class instance.
     */
    public DynamicControls unsetThisExampleDemonstratesWhenControlsECheckboxField() {
        if (thisExampleDemonstratesWhenControlsE.isSelected()) {
            thisExampleDemonstratesWhenControlsE.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the DynamicControls class instance.
     */
    public DynamicControls verifyPageLoaded() {
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
     * @return the DynamicControls class instance.
     */
    public DynamicControls verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

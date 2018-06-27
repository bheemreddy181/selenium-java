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

public class JavaScriptError {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    private final String pageLoadedText = "This page has a JavaScript error in the onload event";

    private final String pageUrl = "/javascript_error";

    @FindBy(css = "input.qt-dropdown-search")
    @CacheLookup
    private WebElement thisPageHasAJavascriptError;

    public JavaScriptError() {
    }

    public JavaScriptError(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public JavaScriptError(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public JavaScriptError(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on New Template Button.
     *
     * @return the JavaScriptError class instance.
     */
    public JavaScriptError clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the JavaScriptError class instance.
     */
    public JavaScriptError fill() {
        setThisPageHasAJavascriptErrorSearchField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the JavaScriptError class instance.
     */
    public JavaScriptError fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to This Page Has A Javascript Error In The Onload Event Search field.
     *
     * @return the JavaScriptError class instance.
     */
    public JavaScriptError setThisPageHasAJavascriptErrorSearchField() {
        return setThisPageHasAJavascriptErrorSearchField(data.get("THIS_PAGE_HAS_A_JAVASCRIPT_ERROR"));
    }

    /**
     * Set value to This Page Has A Javascript Error In The Onload Event Search field.
     *
     * @return the JavaScriptError class instance.
     */
    public JavaScriptError setThisPageHasAJavascriptErrorSearchField(String thisPageHasAJavascriptErrorValue) {
        thisPageHasAJavascriptError.sendKeys(thisPageHasAJavascriptErrorValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the JavaScriptError class instance.
     */
    public JavaScriptError submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the JavaScriptError class instance.
     */
    public JavaScriptError verifyPageLoaded() {
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
     * @return the JavaScriptError class instance.
     */
    public JavaScriptError verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

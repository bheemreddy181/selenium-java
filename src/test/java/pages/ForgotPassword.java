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

public class ForgotPassword {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='http://elementalselenium.com/']")
    @CacheLookup
    private WebElement elementalSelenium;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement email1;

    @FindBy(css = "input.qt-dropdown-search")
    @CacheLookup
    private WebElement email2;

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet']")
    @CacheLookup
    private WebElement forkMeOnGithub;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    private final String pageLoadedText = "";

    private final String pageUrl = "/forgot_password";

    @FindBy(id = "form_submit")
    @CacheLookup
    private WebElement retrievePassword;

    public ForgotPassword() {
    }

    public ForgotPassword(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public ForgotPassword(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public ForgotPassword(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the ForgotPassword class instance.
     */
    public ForgotPassword clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the ForgotPassword class instance.
     */
    public ForgotPassword clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the ForgotPassword class instance.
     */
    public ForgotPassword clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Click on Retrieve Password Button.
     *
     * @return the ForgotPassword class instance.
     */
    public ForgotPassword clickRetrievePasswordButton() {
        retrievePassword.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the ForgotPassword class instance.
     */
    public ForgotPassword fill() {
        setEmail1SearchField();
        setEmail2SearchField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the ForgotPassword class instance.
     */
    public ForgotPassword fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Email Search field.
     *
     * @return the ForgotPassword class instance.
     */
    public ForgotPassword setEmail1SearchField() {
        return setEmail1SearchField(data.get("EMAIL_1"));
    }

    /**
     * Set value to Email Search field.
     *
     * @return the ForgotPassword class instance.
     */
    public ForgotPassword setEmail1SearchField(String email1Value) {
        email1.sendKeys(email1Value);
        return this;
    }

    /**
     * Set default value to Email Search field.
     *
     * @return the ForgotPassword class instance.
     */
    public ForgotPassword setEmail2SearchField() {
        return setEmail2SearchField(data.get("EMAIL_2"));
    }

    /**
     * Set value to Email Search field.
     *
     * @return the ForgotPassword class instance.
     */
    public ForgotPassword setEmail2SearchField(String email2Value) {
        email2.sendKeys(email2Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the ForgotPassword class instance.
     */
    public ForgotPassword submit() {
        clickRetrievePasswordButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the ForgotPassword class instance.
     */
    public ForgotPassword verifyPageLoaded() {
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
     * @return the ForgotPassword class instance.
     */
    public ForgotPassword verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

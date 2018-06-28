package pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthentication {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "button.radius")
    @CacheLookup
    private WebElement login;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    private final String pageLoadedText = "If the information is wrong you should see error messages";

    private final String pageUrl = "/login";

    @FindBy(id = "password")
    @CacheLookup
    private WebElement password1;

    @FindBy(css = "input.qt-dropdown-search")
    @CacheLookup
    private WebElement password2;

    @FindBy(id = "username")
    @CacheLookup
    private WebElement username;

    public FormAuthentication() {
    }

    public FormAuthentication(WebDriver driver) {
        this();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public FormAuthentication(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public FormAuthentication(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Login Button.
     *
     * @return the FormAuthentication class instance.
     */
    public FormAuthentication clickLoginButton() {
        login.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the FormAuthentication class instance.
     */
    public FormAuthentication clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the FormAuthentication class instance.
     */
    public FormAuthentication fill() {
        setUsernameTextField();
        setPassword1SearchField();
        setPassword2SearchField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the FormAuthentication class instance.
     */
    public FormAuthentication fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Password Search field.
     *
     * @return the FormAuthentication class instance.
     */
    public FormAuthentication setPassword1SearchField() {
        return setPassword1SearchField(data.get("PASSWORD_1"));
    }

    /**
     * Set value to Password Search field.
     *
     * @return the FormAuthentication class instance.
     */
    public FormAuthentication setPassword1SearchField(String password1Value) {
        password1.sendKeys(password1Value);
        return this;
    }

    /**
     * Set default value to Password Search field.
     *
     * @return the FormAuthentication class instance.
     */
    public FormAuthentication setPassword2SearchField() {
        return setPassword2SearchField(data.get("PASSWORD_2"));
    }

    /**
     * Set value to Password Search field.
     *
     * @return the FormAuthentication class instance.
     */
    public FormAuthentication setPassword2SearchField(String password2Value) {
        password2.sendKeys(password2Value);
        return this;
    }

    /**
     * Set default value to Username Text field.
     *
     * @return the FormAuthentication class instance.
     */
    public FormAuthentication setUsernameTextField() {
        return setUsernameTextField(data.get("USERNAME"));
    }

    /**
     * Set value to Username Text field.
     *
     * @return the FormAuthentication class instance.
     */
    public FormAuthentication setUsernameTextField(String usernameValue) {
        username.sendKeys(usernameValue);
        return this;
    }

    public FormAuthentication login (String userName, String password) {
        setUsernameTextField(userName);
        setPassword1SearchField(password);
        clickLoginButton();
        return this;

    }

    /**
     * Submit the form to target page.
     *
     * @return the FormAuthentication class instance.
     */
    public FormAuthentication submit() {
        clickLoginButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the FormAuthentication class instance.
     */
    public FormAuthentication verifyPageLoaded() {
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
     * @return the FormAuthentication class instance.
     */
    public FormAuthentication verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

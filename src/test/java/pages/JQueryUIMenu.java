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

public class JQueryUIMenu {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "ui-id-5")
    @CacheLookup
    private WebElement backToJqueryUi;

    @FindBy(id = "ui-id-7")
    @CacheLookup
    private WebElement csv;

    @FindBy(id = "ui-id-1")
    @CacheLookup
    private WebElement disabled;

    @FindBy(id = "ui-id-4")
    @CacheLookup
    private WebElement downloads;

    @FindBy(css = "a[href='http://elementalselenium.com/']")
    @CacheLookup
    private WebElement elementalSelenium;

    @FindBy(id = "ui-id-2")
    @CacheLookup
    private WebElement enabled;

    @FindBy(id = "ui-id-8")
    @CacheLookup
    private WebElement excel;

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet']")
    @CacheLookup
    private WebElement forkMeOnGithub;

    @FindBy(css = "a[href='http://api.jqueryui.com/menu/']")
    @CacheLookup
    private WebElement jqueryUiMenus;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    private final String pageLoadedText = "html itself, but done magically by JQuery so you cannot trust exactly what the";

    private final String pageUrl = "/jqueryui/menu";

    @FindBy(id = "ui-id-6")
    @CacheLookup
    private WebElement pdf;

    @FindBy(id = "ui-id-3")
    @CacheLookup
    private WebElement shouldNotSeeThis;

    public JQueryUIMenu() {
    }

    public JQueryUIMenu(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public JQueryUIMenu(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public JQueryUIMenu(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Back To Jquery Ui Link.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu clickBackToJqueryUiLink() {
        backToJqueryUi.click();
        return this;
    }

    /**
     * Click on Csv Link.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu clickCsvLink() {
        csv.click();
        return this;
    }

    /**
     * Click on Disabled Link.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu clickDisabledLink() {
        disabled.click();
        return this;
    }

    /**
     * Click on Downloads Link.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu clickDownloadsLink() {
        downloads.click();
        return this;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Enabled Link.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu clickEnabledLink() {
        enabled.click();
        return this;
    }

    /**
     * Click on Excel Link.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu clickExcelLink() {
        excel.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on Jquery Ui Menus Link.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu clickJqueryUiMenusLink() {
        jqueryUiMenus.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Click on Pdf Link.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu clickPdfLink() {
        pdf.click();
        return this;
    }

    /**
     * Click on Should Not See This Link.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu clickShouldNotSeeThisLink() {
        shouldNotSeeThis.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu verifyPageLoaded() {
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
     * @return the JQueryUIMenu class instance.
     */
    public JQueryUIMenu verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

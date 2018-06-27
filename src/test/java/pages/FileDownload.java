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

public class FileDownload {
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

    private final String pageLoadedText = "";

    private final String pageUrl = "/download";

    @FindBy(css = "a[href='download/some-file.txt']")
    @CacheLookup
    private WebElement somefileTxt;

    public FileDownload() {
    }

    public FileDownload(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public FileDownload(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public FileDownload(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the FileDownload class instance.
     */
    public FileDownload clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the FileDownload class instance.
     */
    public FileDownload clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the FileDownload class instance.
     */
    public FileDownload clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Click on Somefile.txt Link.
     *
     * @return the FileDownload class instance.
     */
    public FileDownload clickSomefileTxtLink() {
        somefileTxt.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the FileDownload class instance.
     */
    public FileDownload submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the FileDownload class instance.
     */
    public FileDownload verifyPageLoaded() {
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
     * @return the FileDownload class instance.
     */
    public FileDownload verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

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

public class iFrame {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "mce_0")
    @CacheLookup
    private WebElement anIframeContainingTheTinymceWysiwyg;

    @FindBy(id = "mceu_16-open")
    @CacheLookup
    private WebElement edit;

    @FindBy(css = "a[href='http://elementalselenium.com/']")
    @CacheLookup
    private WebElement elementalSelenium;

    @FindBy(id = "mceu_15-open")
    @CacheLookup
    private WebElement file;

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet']")
    @CacheLookup
    private WebElement forkMeOnGithub;

    @FindBy(id = "mceu_18-open")
    @CacheLookup
    private WebElement format;

    @FindBy(id = "mceu_2-open")
    @CacheLookup
    private WebElement formats;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    private final String pageLoadedText = "An iFrame containing the TinyMCE WYSIWYG Editor";

    private final String pageUrl = "/iframe";

    @FindBy(id = "mceu_17-open")
    @CacheLookup
    private WebElement view;

    public iFrame() {
    }

    public iFrame(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public iFrame(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public iFrame(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Edit Button.
     *
     * @return the iFrame class instance.
     */
    public iFrame clickEditButton() {
        edit.click();
        return this;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the iFrame class instance.
     */
    public iFrame clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on File Button.
     *
     * @return the iFrame class instance.
     */
    public iFrame clickFileButton() {
        file.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the iFrame class instance.
     */
    public iFrame clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on Format Button.
     *
     * @return the iFrame class instance.
     */
    public iFrame clickFormatButton() {
        format.click();
        return this;
    }

    /**
     * Click on Formats Button.
     *
     * @return the iFrame class instance.
     */
    public iFrame clickFormatsButton() {
        formats.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the iFrame class instance.
     */
    public iFrame clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Click on View Button.
     *
     * @return the iFrame class instance.
     */
    public iFrame clickViewButton() {
        view.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the iFrame class instance.
     */
    public iFrame fill() {
        setAnIframeContainingTheTinymceWysiwygTextareaField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the iFrame class instance.
     */
    public iFrame fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to An Iframe Containing The Tinymce Wysiwyg Editor Textarea field.
     *
     * @return the iFrame class instance.
     */
    public iFrame setAnIframeContainingTheTinymceWysiwygTextareaField() {
        return setAnIframeContainingTheTinymceWysiwygTextareaField(data.get("AN_IFRAME_CONTAINING_THE_TINYMCE_WYSIWYG"));
    }

    /**
     * Set value to An Iframe Containing The Tinymce Wysiwyg Editor Textarea field.
     *
     * @return the iFrame class instance.
     */
    public iFrame setAnIframeContainingTheTinymceWysiwygTextareaField(String anIframeContainingTheTinymceWysiwygValue) {
        anIframeContainingTheTinymceWysiwyg.sendKeys(anIframeContainingTheTinymceWysiwygValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the iFrame class instance.
     */
    public iFrame submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the iFrame class instance.
     */
    public iFrame verifyPageLoaded() {
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
     * @return the iFrame class instance.
     */
    public iFrame verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

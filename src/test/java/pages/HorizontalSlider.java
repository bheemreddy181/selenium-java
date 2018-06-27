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

public class HorizontalSlider {
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

    private final String pageLoadedText = "Set the focus on the slider (by clicking on it) and use the arrow keys to move it right and left";

    private final String pageUrl = "/horizontal_slider";

    @FindBy(css = "#content div.example div.sliderContainer input[type='range']")
    @CacheLookup
    private WebElement setTheFocusOnTheSlider;

    public HorizontalSlider() {
    }

    public HorizontalSlider(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public HorizontalSlider(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public HorizontalSlider(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the HorizontalSlider class instance.
     */
    public HorizontalSlider clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the HorizontalSlider class instance.
     */
    public HorizontalSlider clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the HorizontalSlider class instance.
     */
    public HorizontalSlider clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the HorizontalSlider class instance.
     */
    public HorizontalSlider fill() {
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the HorizontalSlider class instance.
     */
    public HorizontalSlider fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set Set The Focus On The Slider By Clicking On It And Use The Arrow Keys To Move It Right And Left Range field.
     *
     * @return the HorizontalSlider class instance.
     */
    public HorizontalSlider setSetTheFocusOnTheSliderRangeField() {
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the HorizontalSlider class instance.
     */
    public HorizontalSlider submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the HorizontalSlider class instance.
     */
    public HorizontalSlider verifyPageLoaded() {
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
     * @return the HorizontalSlider class instance.
     */
    public HorizontalSlider verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

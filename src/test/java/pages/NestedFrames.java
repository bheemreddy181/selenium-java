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

public class NestedFrames {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    private final String pageLoadedText = "";

    private final String pageUrl = "/nested_frames";

    public NestedFrames() {
    }

    public NestedFrames(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public NestedFrames(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public NestedFrames(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the NestedFrames class instance.
     */
    public NestedFrames verifyPageLoaded() {
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
     * @return the NestedFrames class instance.
     */
    public NestedFrames verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

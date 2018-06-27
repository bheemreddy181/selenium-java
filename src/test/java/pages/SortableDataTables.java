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

public class SortableDataTables {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#table1 tbody tr:nth-of-type(1) td:nth-of-type(6) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete1;

    @FindBy(css = "#table1 tbody tr:nth-of-type(2) td:nth-of-type(6) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete2;

    @FindBy(css = "#table1 tbody tr:nth-of-type(3) td:nth-of-type(6) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete3;

    @FindBy(css = "#table1 tbody tr:nth-of-type(4) td:nth-of-type(6) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete4;

    @FindBy(css = "#table2 tbody tr:nth-of-type(1) td:nth-of-type(6) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete5;

    @FindBy(css = "#table2 tbody tr:nth-of-type(2) td:nth-of-type(6) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete6;

    @FindBy(css = "#table2 tbody tr:nth-of-type(3) td:nth-of-type(6) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete7;

    @FindBy(css = "#table2 tbody tr:nth-of-type(4) td:nth-of-type(6) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete8;

    @FindBy(css = "#table1 tbody tr:nth-of-type(1) td:nth-of-type(6) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit1;

    @FindBy(css = "#table1 tbody tr:nth-of-type(2) td:nth-of-type(6) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit2;

    @FindBy(css = "#table1 tbody tr:nth-of-type(3) td:nth-of-type(6) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit3;

    @FindBy(css = "#table1 tbody tr:nth-of-type(4) td:nth-of-type(6) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit4;

    @FindBy(css = "#table2 tbody tr:nth-of-type(1) td:nth-of-type(6) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit5;

    @FindBy(css = "#table2 tbody tr:nth-of-type(2) td:nth-of-type(6) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit6;

    @FindBy(css = "#table2 tbody tr:nth-of-type(3) td:nth-of-type(6) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit7;

    @FindBy(css = "#table2 tbody tr:nth-of-type(4) td:nth-of-type(6) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit8;

    @FindBy(css = "a[href='http://elementalselenium.com/']")
    @CacheLookup
    private WebElement elementalSelenium;

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet']")
    @CacheLookup
    private WebElement forkMeOnGithub;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    private final String pageLoadedText = "And it can be challenging to automate interaction with sets of data in a table depending on how it is constructed";

    private final String pageUrl = "/tables";

    public SortableDataTables() {
    }

    public SortableDataTables(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public SortableDataTables(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public SortableDataTables(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Delete Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickDelete1Link() {
        delete1.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickDelete2Link() {
        delete2.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickDelete3Link() {
        delete3.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickDelete4Link() {
        delete4.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickDelete5Link() {
        delete5.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickDelete6Link() {
        delete6.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickDelete7Link() {
        delete7.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickDelete8Link() {
        delete8.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickEdit1Link() {
        edit1.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickEdit2Link() {
        edit2.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickEdit3Link() {
        edit3.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickEdit4Link() {
        edit4.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickEdit5Link() {
        edit5.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickEdit6Link() {
        edit6.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickEdit7Link() {
        edit7.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickEdit8Link() {
        edit8.click();
        return this;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables verifyPageLoaded() {
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
     * @return the SortableDataTables class instance.
     */
    public SortableDataTables verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

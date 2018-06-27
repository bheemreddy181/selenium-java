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

public class ChallengingDom {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "058f8e30-597f-0136-bbc0-3e8d8e30a376")
    @CacheLookup
    private WebElement bar;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(1) td:nth-of-type(7) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete1;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(10) td:nth-of-type(7) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete10;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(2) td:nth-of-type(7) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete2;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(3) td:nth-of-type(7) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete3;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(4) td:nth-of-type(7) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete4;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(5) td:nth-of-type(7) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete5;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(6) td:nth-of-type(7) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete6;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(7) td:nth-of-type(7) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete7;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(8) td:nth-of-type(7) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete8;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(9) td:nth-of-type(7) a:nth-of-type(2)")
    @CacheLookup
    private WebElement delete9;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(1) td:nth-of-type(7) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit1;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(10) td:nth-of-type(7) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit10;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(2) td:nth-of-type(7) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit2;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(3) td:nth-of-type(7) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit3;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(4) td:nth-of-type(7) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit4;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(5) td:nth-of-type(7) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit5;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(6) td:nth-of-type(7) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit6;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(7) td:nth-of-type(7) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit7;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(8) td:nth-of-type(7) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit8;

    @FindBy(css = "#content div.example div.row div.large-12.columns.large-centered div:nth-of-type(2) table tbody tr:nth-of-type(9) td:nth-of-type(7) a:nth-of-type(1)")
    @CacheLookup
    private WebElement edit9;

    @FindBy(css = "a[href='http://elementalselenium.com/']")
    @CacheLookup
    private WebElement elementalSelenium;

    @FindBy(id = "058f6f50-597f-0136-bbbf-3e8d8e30a376")
    @CacheLookup
    private WebElement foo1;

    @FindBy(id = "058fa950-597f-0136-bbc1-3e8d8e30a376")
    @CacheLookup
    private WebElement foo2;

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet']")
    @CacheLookup
    private WebElement forkMeOnGithub;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    private final String pageLoadedText = "It's more often than not that the application you're testing was not built with this concept in mind";

    private final String pageUrl = "/challenging_dom";

    public ChallengingDom() {
    }

    public ChallengingDom(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public ChallengingDom(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public ChallengingDom(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Bar Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickBarLink() {
        bar.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickDelete10Link() {
        delete10.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickDelete1Link() {
        delete1.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickDelete2Link() {
        delete2.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickDelete3Link() {
        delete3.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickDelete4Link() {
        delete4.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickDelete5Link() {
        delete5.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickDelete6Link() {
        delete6.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickDelete7Link() {
        delete7.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickDelete8Link() {
        delete8.click();
        return this;
    }

    /**
     * Click on Delete Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickDelete9Link() {
        delete9.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickEdit10Link() {
        edit10.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickEdit1Link() {
        edit1.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickEdit2Link() {
        edit2.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickEdit3Link() {
        edit3.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickEdit4Link() {
        edit4.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickEdit5Link() {
        edit5.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickEdit6Link() {
        edit6.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickEdit7Link() {
        edit7.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickEdit8Link() {
        edit8.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickEdit9Link() {
        edit9.click();
        return this;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Foo Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickFoo1Link() {
        foo1.click();
        return this;
    }

    /**
     * Click on Foo Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickFoo2Link() {
        foo2.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom verifyPageLoaded() {
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
     * @return the ChallengingDom class instance.
     */
    public ChallengingDom verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

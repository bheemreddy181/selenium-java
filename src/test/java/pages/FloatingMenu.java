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

public class FloatingMenu {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='#about']")
    @CacheLookup
    private WebElement about;

    @FindBy(css = "a[href='#contact']")
    @CacheLookup
    private WebElement contact;

    @FindBy(css = "a[href='http://elementalselenium.com/']")
    @CacheLookup
    private WebElement elementalSelenium;

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet']")
    @CacheLookup
    private WebElement forkMeOnGithub;

    @FindBy(css = "a[href='#home']")
    @CacheLookup
    private WebElement home;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    @FindBy(css = "a[href='#news']")
    @CacheLookup
    private WebElement news;

    private final String pageLoadedText = "Rem ut iure natus ut sit et eveniet est sit possimus iusto quia voluptatem sunt numquam in ea voluptatem amet tempora reiciendis debitis voluptatem quis sed ut illum recusandae tenetur harum autem eum incidunt fuga nulla optio quia praesentium sed repudiandae dolore impedit nam ab delectus error laborum architecto enim quis commodi esse ipsum et blanditiis quia numquam molestiae ad nemo saepe voluptates minus eum maxime suscipit explicabo eos atque dolorem unde eos non ad adipisci rerum repellendus voluptas ex deleniti nam non qui eum officia cum exercitationem repudiandae sequi nemo excepturi aut ullam in natus voluptatem dolorum dolores eaque iure quasi perferendis fugiat velit officiis nobis est vitae libero aut quibusdam inventore iusto aliquid libero magni commodi et voluptates repellat facilis ea aut consequatur modi eligendi sed corrupti necessitatibus pariatur voluptatibus voluptatem quas corporis non ratione hic sed minus quos ut optio autem laudantium quo quas placeat distinctio qui ab molestias doloremque aspernatur rerum totam veritatis iste dolor odit officia minima quis et porro dolores ipsa at exercitationem cumque dolores nihil ex expedita doloremque ipsa quisquam ut est et consectetur sapiente mollitia eum nihil tenetur deserunt molestiae provident beatae sit perspiciatis et soluta rerum veritatis sequi dicta perferendis nulla placeat tempore rerum assumenda id sint nostrum est esse non provident id earum veniam beatae sint aut illum velit accusantium maiores fugit porro corporis qui et doloribus neque harum molestiae id laboriosam dolor aut asperiores consequatur quos quod consequuntur error illo et ipsam vitae rerum itaque temporibus ratione omnis omnis delectus sapiente distinctio odio deleniti impedit ducimus eos quidem quae vel suscipit incidunt enim sit cum est modi earum quia possimus et consectetur nisi maxime et reiciendis quod amet quaerat velit autem non animi magnam sint doloribus minima nobis dolorum voluptatem quia voluptatem aperiam asperiores cumque voluptas omnis dignissimos dolores enim odio aut illo";

    private final String pageUrl = "/floating_menu";

    public FloatingMenu() {
    }

    public FloatingMenu(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public FloatingMenu(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public FloatingMenu(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the FloatingMenu class instance.
     */
    public FloatingMenu clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the FloatingMenu class instance.
     */
    public FloatingMenu clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the FloatingMenu class instance.
     */
    public FloatingMenu clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the FloatingMenu class instance.
     */
    public FloatingMenu clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the FloatingMenu class instance.
     */
    public FloatingMenu clickHomeLink() {
        home.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the FloatingMenu class instance.
     */
    public FloatingMenu clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Click on News Link.
     *
     * @return the FloatingMenu class instance.
     */
    public FloatingMenu clickNewsLink() {
        news.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the FloatingMenu class instance.
     */
    public FloatingMenu submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the FloatingMenu class instance.
     */
    public FloatingMenu verifyPageLoaded() {
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
     * @return the FloatingMenu class instance.
     */
    public FloatingMenu verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

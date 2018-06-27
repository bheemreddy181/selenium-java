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

public class InfiniteScroll {
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

    @FindBy(css = "a[href='/infinite_scroll/10']")
    @CacheLookup
    private WebElement nextPage;

    private final String pageLoadedText = "Aliquam neque voluptas sit qui ea et culpa quo quis at soluta quia dolores quo dicta necessitatibus quo dolorem pariatur eos ea temporibus laboriosam nemo cupiditate sequi laborum vel fugit voluptas doloremque molestias ut aut sint sint hic non cum atque est dolorum ut excepturi distinctio harum aut placeat exercitationem vel est omnis vero voluptas est ipsum veniam est dolorem natus quibusdam repellendus tempora ea error doloremque asperiores voluptatum veniam blanditiis laudantium dignissimos esse reprehenderit mollitia rerum vero aliquam qui et quidem beatae unde commodi laboriosam itaque quidem nostrum magnam ab tempore sunt et ut quis delectus eaque nostrum ipsam voluptas id occaecati consequatur facere voluptatem sit minus quaerat doloribus ut a modi rerum id ullam praesentium possimus ut temporibus maiores voluptates beatae nemo autem accusantium earum perferendis non dolorum illo aut ea rerum vitae ipsa quod eos rerum quia quasi rem voluptas dolores est hic itaque corporis totam eveniet recusandae autem molestiae veritatis magni consequuntur eaque ipsa qui ipsam et optio quia consectetur alias esse aut enim quia est ullam blanditiis expedita ex velit reiciendis qui tenetur eius et aperiam iusto dolorem ut est ut animi et sunt inventore occaecati odio modi dolor voluptatem omnis voluptatem non consequatur amet enim quae consequatur rem facilis exercitationem adipisci odit consectetur quae ratione voluptates sed similique saepe aut dolore provident assumenda impedit quo eius nesciunt ut inventore qui sit aut debitis et quis voluptatibus quia sunt architecto voluptatem omnis alias iste repudiandae incidunt non explicabo provident aspernatur nulla ad nam ut unde asperiores omnis dolores sunt ipsum est maxime nihil voluptas in libero sed perferendis mollitia illum quis tempora et fuga sapiente doloribus eligendi quos possimus rerum iure aliquid numquam qui minima eum corrupti ducimus consequatur corrupti repellat distinctio nihil eligendi facilis soluta accusantium laudantium adipisci libero perspiciatis odio eos iure saepe et deserunt";

    private final String pageUrl = "/infinite_scroll";

    public InfiniteScroll() {
    }

    public InfiniteScroll(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public InfiniteScroll(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public InfiniteScroll(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the InfiniteScroll class instance.
     */
    public InfiniteScroll clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the InfiniteScroll class instance.
     */
    public InfiniteScroll clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the InfiniteScroll class instance.
     */
    public InfiniteScroll clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Click on Next Page Link.
     *
     * @return the InfiniteScroll class instance.
     */
    public InfiniteScroll clickNextPageLink() {
        nextPage.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the InfiniteScroll class instance.
     */
    public InfiniteScroll submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the InfiniteScroll class instance.
     */
    public InfiniteScroll verifyPageLoaded() {
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
     * @return the InfiniteScroll class instance.
     */
    public InfiniteScroll verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

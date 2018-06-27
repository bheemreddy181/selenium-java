package pages;

import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class HerokuAppMainPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='/abtest']")
    @CacheLookup
    private WebElement abTesting;

    @FindBy(css = "a[href='/basic_auth']")
    @CacheLookup
    private WebElement basicAuth;

    @FindBy(css = "a[href='/broken_images']")
    @CacheLookup
    private WebElement brokenImages;

    @FindBy(css = "a[href='/challenging_dom']")
    @CacheLookup
    private WebElement challengingDom;

    @FindBy(css = "a[href='/checkboxes']")
    @CacheLookup
    private WebElement checkboxes;

    @FindBy(css = "a[href='/context_menu']")
    @CacheLookup
    private WebElement contextMenu;

    @FindBy(css = "a[href='/disappearing_elements']")
    @CacheLookup
    private WebElement disappearingElements;

    @FindBy(css = "a[href='/drag_and_drop']")
    @CacheLookup
    private WebElement dragAndDrop;

    @FindBy(css = "a[href='/dropdown']")
    @CacheLookup
    private WebElement dropdown;

    @FindBy(css = "a[href='/dynamic_content']")
    @CacheLookup
    private WebElement dynamicContent;

    @FindBy(css = "a[href='/dynamic_controls']")
    @CacheLookup
    private WebElement dynamicControls;

    @FindBy(css = "a[href='/dynamic_loading']")
    @CacheLookup
    private WebElement dynamicLoading;

    @FindBy(css = "a[href='http://elementalselenium.com/']")
    @CacheLookup
    private WebElement elementalSelenium;

    @FindBy(css = "a[href='/exit_intent']")
    @CacheLookup
    private WebElement exitIntent;

    @FindBy(css = "a[href='/download']")
    @CacheLookup
    private WebElement fileDownload;

    @FindBy(css = "a[href='/upload']")
    @CacheLookup
    private WebElement fileUpload;

    @FindBy(css = "a[href='/floating_menu']")
    @CacheLookup
    private WebElement floatingMenu;

    @FindBy(css = "a[href='/forgot_password']")
    @CacheLookup
    private WebElement forgotPassword;

    @FindBy(css = "a[href='https://github.com/tourdedave/the-internet']")
    @CacheLookup
    private WebElement forkMeOnGithub;

    @FindBy(css = "a[href='/login']")
    @CacheLookup
    private WebElement formAuthentication;

    @FindBy(css = "a[href='/frames']")
    @CacheLookup
    private WebElement frames;

    @FindBy(css = "a[href='/geolocation']")
    @CacheLookup
    private WebElement geolocation;

    @FindBy(css = "a[href='/horizontal_slider']")
    @CacheLookup
    private WebElement horizontalSlider;

    @FindBy(css = "a[href='/hovers']")
    @CacheLookup
    private WebElement hovers;

    @FindBy(css = "a[href='/infinite_scroll']")
    @CacheLookup
    private WebElement infiniteScroll;

    @FindBy(css = "a[href='/javascript_alerts']")
    @CacheLookup
    private WebElement javascriptAlerts;

    @FindBy(css = "a[href='/javascript_error']")
    @CacheLookup
    private WebElement javascriptOnloadEventError;

    @FindBy(css = "a[href='/jqueryui/menu']")
    @CacheLookup
    private WebElement jqueryUiMenus;

    @FindBy(css = "a[href='/key_presses']")
    @CacheLookup
    private WebElement keyPresses;

    @FindBy(css = "a[href='/large']")
    @CacheLookup
    private WebElement largeDeepDom;

    @FindBy(css = "a[href='/windows']")
    @CacheLookup
    private WebElement multipleWindows;

    @FindBy(css = "a[href='/nested_frames']")
    @CacheLookup
    private WebElement nestedFrames;

    @FindBy(css = "button.g-new-template")
    @CacheLookup
    private WebElement newTemplate;

    @FindBy(css = "a[href='/notification_message']")
    @CacheLookup
    private WebElement notificationMessages;

    private final String pageLoadedText = "";

    private final String pageUrl = "/";

    @FindBy(css = "a[href='/redirector']")
    @CacheLookup
    private WebElement redirectLink;

    @FindBy(css = "a[href='/download_secure']")
    @CacheLookup
    private WebElement secureFileDownload;

    @FindBy(css = "a[href='/shifting_content']")
    @CacheLookup
    private WebElement shiftingContent;

    @FindBy(css = "a[href='/slow']")
    @CacheLookup
    private WebElement slowResources;

    @FindBy(css = "a[href='/tables']")
    @CacheLookup
    private WebElement sortableDataTables;

    @FindBy(css = "a[href='/status_codes']")
    @CacheLookup
    private WebElement statusCodes;

    @FindBy(css = "a[href='/typos']")
    @CacheLookup
    private WebElement typos;

    @FindBy(css = "a[href='/tinymce']")
    @CacheLookup
    private WebElement wysiwygEditor;

    public HerokuAppMainPage() {
    }

    public HerokuAppMainPage(WebDriver driver) {
        this();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HerokuAppMainPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public HerokuAppMainPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Ab Testing Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickAbTestingLink() {
        abTesting.click();
        return this;
    }

    /**
     * Click on Basic Auth Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickBasicAuthLink() {
        basicAuth.click();
        return this;
    }

    /**
     * Click on Broken Images Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickBrokenImagesLink() {
        brokenImages.click();
        return this;
    }

    /**
     * Click on Challenging Dom Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickChallengingDomLink() {
        challengingDom.click();
        return this;
    }

    /**
     * Click on Checkboxes Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickCheckboxesLink() {
        checkboxes.click();
        return this;
    }

    /**
     * Click on Context Menu Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickContextMenuLink() {
        contextMenu.click();
        return this;
    }

    /**
     * Click on Disappearing Elements Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickDisappearingElementsLink() {
        disappearingElements.click();
        return this;
    }

    /**
     * Click on Drag And Drop Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickDragAndDropLink() {
        dragAndDrop.click();
        return this;
    }

    /**
     * Click on Dropdown Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickDropdownLink() {
        dropdown.click();
        return this;
    }

    /**
     * Click on Dynamic Content Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickDynamicContentLink() {
        dynamicContent.click();
        return this;
    }

    /**
     * Click on Dynamic Controls Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickDynamicControlsLink() {
        dynamicControls.click();
        return this;
    }

    /**
     * Click on Dynamic Loading Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickDynamicLoadingLink() {
        dynamicLoading.click();
        return this;
    }

    /**
     * Click on Elemental Selenium Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickElementalSeleniumLink() {
        elementalSelenium.click();
        return this;
    }

    /**
     * Click on Exit Intent Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickExitIntentLink() {
        exitIntent.click();
        return this;
    }

    /**
     * Click on File Download Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickFileDownloadLink() {
        fileDownload.click();
        return this;
    }

    /**
     * Click on File Upload Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickFileUploadLink() {
        fileUpload.click();
        return this;
    }

    /**
     * Click on Floating Menu Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickFloatingMenuLink() {
        floatingMenu.click();
        return this;
    }

    /**
     * Click on Forgot Password Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickForgotPasswordLink() {
        forgotPassword.click();
        return this;
    }

    /**
     * Click on Fork Me On Github Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickForkMeOnGithubLink() {
        forkMeOnGithub.click();
        return this;
    }

    /**
     * Click on Form Authentication Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickFormAuthenticationLink() {
        formAuthentication.click();
        return this;
    }

    /**
     * Click on Frames Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickFramesLink() {
        frames.click();
        return this;
    }

    /**
     * Click on Geolocation Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickGeolocationLink() {
        geolocation.click();
        return this;
    }

    /**
     * Click on Horizontal Slider Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickHorizontalSliderLink() {
        horizontalSlider.click();
        return this;
    }

    /**
     * Click on Hovers Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickHoversLink() {
        hovers.click();
        return this;
    }

    /**
     * Click on Infinite Scroll Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickInfiniteScrollLink() {
        infiniteScroll.click();
        return this;
    }

    /**
     * Click on Javascript Alerts Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickJavascriptAlertsLink() {
        javascriptAlerts.click();
        return this;
    }

    /**
     * Click on Javascript Onload Event Error Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickJavascriptOnloadEventErrorLink() {
        javascriptOnloadEventError.click();
        return this;
    }

    /**
     * Click on Jquery Ui Menus Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickJqueryUiMenusLink() {
        jqueryUiMenus.click();
        return this;
    }

    /**
     * Click on Key Presses Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickKeyPressesLink() {
        keyPresses.click();
        return this;
    }

    /**
     * Click on Large Deep Dom Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickLargeDeepDomLink() {
        largeDeepDom.click();
        return this;
    }

    /**
     * Click on Multiple Windows Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickMultipleWindowsLink() {
        multipleWindows.click();
        return this;
    }

    /**
     * Click on Nested Frames Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickNestedFramesLink() {
        nestedFrames.click();
        return this;
    }

    /**
     * Click on New Template Button.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickNewTemplateButton() {
        newTemplate.click();
        return this;
    }

    /**
     * Click on Notification Messages Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickNotificationMessagesLink() {
        notificationMessages.click();
        return this;
    }

    /**
     * Click on Redirect Link Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickRedirectLinkLink() {
        redirectLink.click();
        return this;
    }

    /**
     * Click on Secure File Download Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickSecureFileDownloadLink() {
        secureFileDownload.click();
        return this;
    }

    /**
     * Click on Shifting Content Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickShiftingContentLink() {
        shiftingContent.click();
        return this;
    }

    /**
     * Click on Slow Resources Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickSlowResourcesLink() {
        slowResources.click();
        return this;
    }

    /**
     * Click on Sortable Data Tables Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickSortableDataTablesLink() {
        sortableDataTables.click();
        return this;
    }

    /**
     * Click on Status Codes Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickStatusCodesLink() {
        statusCodes.click();
        return this;
    }

    /**
     * Click on Typos Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickTyposLink() {
        typos.click();
        return this;
    }

    /**
     * Click on Wysiwyg Editor Link.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage clickWysiwygEditorLink() {
        wysiwygEditor.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage submit() {
        clickNewTemplateButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage verifyPageLoaded() {
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
     * @return the HerokuAppMainPage class instance.
     */
    public HerokuAppMainPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

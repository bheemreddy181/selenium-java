package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pages.*;
import util.JunitListener;
import util.PropertyReader;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static PropertyReader propertyReader;
    private static Logger LOGGER = null;
    @Rule
    public JunitListener junitListener;
    public WebDriver driver;
    public HerokuAppMainPage homePage;

    public BaseTest() {
        junitListener = new JunitListener();
        propertyReader = new PropertyReader();
        LOGGER = LogManager.getLogger(BaseTest.class);
        LOGGER.info("BaseTest completed");
    }

    @Before
    public void setUp() {
        LOGGER.info("SetUp");
        setDriver();
        junitListener.setDriver(driver);
        homePage = new HerokuAppMainPage(driver);
        loadUrl();
    }

    @After
    public void tearDown() {
        LOGGER.info("TearDown");
    }

    public void setDriver() {
        String browser = propertyReader.readProperty("browser");
        long implicitWait = Integer.parseInt(propertyReader.readProperty("implicitWaitInSeconds"));
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", propertyReader.readProperty("winChromeDriver"));
                driver = new ChromeDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new WebDriverException();
        }
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void loadUrl() {
        URL baseUrl;
        HttpURLConnection connection = null;
        try {
            baseUrl = new URL(propertyReader.readProperty("url"));
            connection = (HttpURLConnection) baseUrl.openConnection();
            connection.connect();
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                LOGGER.error("Unable to connect to the url connection");
                LOGGER.error("Response Code " + connection.getResponseCode());
                LOGGER.error("Response Message " + connection.getResponseMessage());
            }
            driver.get(propertyReader.readProperty("url"));
        } catch (IOException e) {
            LOGGER.error("URL connection error");
            e.printStackTrace();
        }
    }
}

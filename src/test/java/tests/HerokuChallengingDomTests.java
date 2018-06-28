package tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import tests.categories.Regression;
import tests.categories.Smoke;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import pages.*;

public class HerokuChallengingDomTests extends BaseTest{

    @Test
    @Category(Regression.class)
    public void testTableHandling()  {

        homePage.clickChallengingDomLink();
        ChallengingDom ChallengingDomPage = new ChallengingDom(driver);

        //To locate table.
        WebElement mytable = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table"));

        //To locate rows of table.
        List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));

        //To calculate no of rows In table.
        int rows_count = rows_table.size();


        //Loop will execute for all the rows of the table
        for (int row = 0; row < rows_count; row++) {

            //To locate columns(cells) of that specific row.
            List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));

            //To calculate no of columns(cells) In that specific row.
            int columns_count = Columns_row.size();
            System.out.println("Number of cells In Row " + row + " are " + columns_count);

            //Loop will execute till the last cell of that specific row.
            for (int column = 0; column < columns_count; column++) {
                //To retrieve text from the cells.
                String celltext = Columns_row.get(column).getText();
                System.out.println("Cell Value Of row number " + row + " and column number " + column + " Is " + celltext);
            }
        }
    }
}

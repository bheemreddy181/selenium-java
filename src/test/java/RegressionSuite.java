import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.HerokuMainPageTests;
import tests.categories.Regression;

@RunWith(Categories.class)
@Categories.IncludeCategory(Regression.class)
@Suite.SuiteClasses(HerokuMainPageTests.class)
public class RegressionSuite {

}
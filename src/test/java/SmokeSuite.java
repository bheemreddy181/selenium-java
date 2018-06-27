import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.HerokuMainPageTests;
import tests.categories.Smoke;

@RunWith(Categories.class)
@Categories.IncludeCategory(Smoke.class)
@Suite.SuiteClasses(HerokuMainPageTests.class)
public class SmokeSuite {

}

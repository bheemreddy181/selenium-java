import org.junit.runner.JUnitCore;

public class TestRunner {
    public static JUnitCore runner;

    public static void main(String[] args) {
        runner = new JUnitCore();
        runner.run(SmokeSuite.class);
        runner.run(RegressionSuite.class);
    }

}

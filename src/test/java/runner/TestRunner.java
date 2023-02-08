package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="features", glue = {"steps"},tags= "@cnx_sample",monochrome =true,plugin={"pretty","html:target/cucumber-reports/rapport.html"})
public class TestRunner {
 
}

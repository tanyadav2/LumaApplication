package testRunner;


//import io.cucumber.testng.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/accountCreation.feature"},
        glue = {"stepdefs"},
        tags = ("@Luma"),
//        plugin =  {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        publish = true
)
//@Listener({})
public class TestRunner extends AbstractTestNGCucumberTests {
}

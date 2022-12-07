package runner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/login1/guru.feature"},glue= {"defination4"},tags="@PositiveTesting")
public class gururun extends AbstractTestNGCucumberTests {
	
	
	
}

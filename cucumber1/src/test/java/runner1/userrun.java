package runner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/login1/user.feature"},glue= {"defination2"})
public class userrun extends AbstractTestNGCucumberTests {
	
	
	
	
	
}
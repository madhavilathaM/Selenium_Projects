package runner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/login1/login1.feature"},glue= {"defination1"},tags="@NegativeTesting")
public class testrun1 extends AbstractTestNGCucumberTests {
	
	
	
}



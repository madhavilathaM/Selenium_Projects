package runnerpra;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/prafeature/practice.feature"},glue= {"definationpra"},tags="@PositiveTesting",plugin= {"html:testoutput/cucumber.html"})
public class runnerpra {

}

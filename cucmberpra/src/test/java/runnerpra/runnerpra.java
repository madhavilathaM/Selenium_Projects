package runnerpra;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/prafeature/runpra.feature"},glue= {"defination"},tags="@PositiveTesting",plugin= {"html:testoutput/cucumber.html"})
public class runnerpra {

}

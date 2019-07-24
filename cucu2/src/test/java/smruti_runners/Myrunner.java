package smruti_runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber .class)
@CucumberOptions(features="MYDEMODDC2_FEATURES",glue="ddc2_mystepdefination",tags= {"@Sanity,@Regression"},
plugin={"html:target/cucumber-htmlreport.html"})




public class Myrunner {

}

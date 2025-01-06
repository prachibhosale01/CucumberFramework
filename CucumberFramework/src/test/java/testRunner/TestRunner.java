package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Accounts.feature",
                glue={"stepDefinitions"}, 
                dryRun=false,
               
                plugin= {"pretty","html:target/cucumber-reports/cucumber.html",
                		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}


               
                

            
                
          

      
)

public class TestRunner 
{

}



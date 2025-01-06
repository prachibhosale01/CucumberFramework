package stepDefinitions;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks  extends BaseClass
{

	@After
	public void takeScreenshotOnFailure(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
		}
	
	}
}
	


package Com.pularlsightnew;

import org.junit.runner.Description;
import org.junit.runner.RunWith;
//import org.junit.runner.Runner;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

import io.cucumber.core.options.CucumberOptionsAnnotationParser.CucumberOptions;

@RunWith(CalculatorTest.class)

public class CalculatorTest extends Runner {

	@Override
	public Description getDescription() {
		
		return null;
	}

	@Override
	public void run(RunNotifier arg0) {
		
		
	}

}

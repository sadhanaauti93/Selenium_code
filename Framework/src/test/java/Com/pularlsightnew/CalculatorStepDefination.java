package Com.pularlsightnew;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefination {
	Calculator Calculator;
	Integer Result;
	
	@Given ("I have calculator")
		public void i_have_calculator() throws Exception {
		Calculator = new Calculator();
		//throw new Exception(); 	
		}
		
	
    @When ("I add 1 and 2") 
    	public void i_add_and(Integer a, Integer b) throws Exception {
    	Result = Calculator.add(a,b);
    		//throw new Exception(); 	
    	}
    
    @Then ("I should get 3")
    	public void I_should_get(Integer ExpectedResult) throws Exception {
    	assertThat(Result).equals(ExpectedResult);
    		//throw new Exception(); 	
	
    	}


	private Object assertThat(Integer result2) {
		// TODO Auto-generated method stub
		return null;
	}
    	
    }
    



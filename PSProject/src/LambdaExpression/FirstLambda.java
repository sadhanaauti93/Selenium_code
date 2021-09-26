package LambdaExpression;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class FirstLambda {
	public static void main(String[] args) {
		//Supplier
		Supplier<String> supplier = () ->"hello";   
		String string = supplier.get();
		System.out.println("String=" + string);
		
		//Consumer
		Consumer<String> consumer = 
				(String s)-> { 
					System.out.println(s);
					System.out.println("I am inside the consumer");
				};
		consumer.accept("Hello");
	}
}

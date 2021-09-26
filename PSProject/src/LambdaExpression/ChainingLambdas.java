package LambdaExpression;

import java.util.function.Consumer;

public class ChainingLambdas {
	public static void main(String[] args) {
		Consumer<String> c1 =  s -> System.out.println("c1 consumes " +s);
		Consumer<String> c2 =  s -> System.out.println("c2 consumes " +s);
		Consumer<String> c3 = c1.andThen(c2);
		c3.accept("Hello Pune");
		//c1.accept("Hello");
		//c2.accept("Hello world");
//		Consumer<String> c3 = s -> {
//			c1.accept(s);
//			c2.accept(s);
//		};
		
	}
}

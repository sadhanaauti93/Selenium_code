package LambdaExpression;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class FirstString {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one", "two", "three", "four", "Five");
		Predicate<String> p1 = s-> s.length()>3;
		Predicate<String> p2 = Predicate.isEqual("two");
		stream
		.filter(p1.or(p2))
		.forEach(s ->  System.out.println(s));
	}
}

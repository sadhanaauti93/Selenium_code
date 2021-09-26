package LambdaExpression;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class FirstString1 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one", "two", "three", "four", "Five");
		//Predicate<String> p1 = s-> s.length()>3;
		Predicate<String> p1 = Predicate.isEqual("two");
		Predicate<String> p2 = Predicate.isEqual("three");
		List<String> list  = new ArrayList<>();
		stream
		.peek(System.out::println)
		.filter(p1.or(p2))
		.forEach(list::add);   // use peek work alter to foreach
		System.out.println("Done!");
		System.out.println("size = "+list.size());
	}
}

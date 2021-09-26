package LambdaExpression;
import java.util.Arrays;
import java.util.List;
public class ReducationExample {
	public static void main(String[] args) {
		List<Integer> list  = Arrays.asList(10,20,30);
		Integer red=
		list.stream()
		//.reduce(100,Integer::sum);
		.reduce(0,Integer::max);
		System.out.println("red = "+red);
	}
}

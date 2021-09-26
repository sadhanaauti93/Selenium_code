import java.util.InputMismatchException;
import java.util.Scanner;
import com.cg.project.Exception.InvalidNumberRangeException;
import com.cg.project.services.MathService;
import com.cg.project.services.MathServiceImpl;

public class MainClass {

	public static void main(String[] args) throws InvalidNumberRangeException {
		MathService service = new MathServiceImpl();
		System.out.println(service.add(100, 200));
		System.out.println(service.sub(100, 200));
		System.out.println(service.mul(100, 200));
		System.out.println(service.div(100, 200));
	}
}

package Stream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class CollectorsexampleMain {
	public static void main(String[] args) {
		List<Person> person  = new ArrayList<>();
		try(
			BufferedReader reader = 
			new BufferedReader(
					new InputStreamReader(
							CollectorsexampleMain.class.getResourceAsStream("people.txt")));
				Stream<String> stream = reader.lines()
		){
		stream.map(line ->{
			String[] s = line.split(" ");
			Person p = new Person(s[0].trim(), Integer.parseInt(s[1]));
			person.add(p);
			return p;
		})
		.forEach(System.out::println);
	 }catch(IOException ioe) {
		 System.out.println(ioe);
	}
		Stream<Person> stream = person.stream();
		Optional<Person>opt=
				
		stream.filter(p -> p.getAge() >=20)
			.min(Comparator.comparing(Person::getAge));
		System.out.println(opt);
		
		Optional<Person>opt2=
		stream.max(Comparator.comparing(Person::getAge));
		System.out.println(opt2);
		Map<Integer,List<Person>>map=
				person.stream()
					.collect(
							Collectors.groupingBy(
									Person::getAge
							)
					);
		System.out.println(map);
	}
}






















package org.PaumardDAndT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Stream.CollectorsexampleMain;
import Stream.Person;

public class DateAndTimeMain {

	public static void main(String[] args) {
		List<Person> person  = new ArrayList<>();
		try(
			BufferedReader reader = 
			new BufferedReader(
					new InputStreamReader(
							DateAndTimeMain.class.getResourceAsStream("people.txt")));
				Stream<String> stream = reader.lines()
		){
		Stream.map(line ->{
			
					String[] s = line.split(" ");
					
					String name = s[0].trim();
					int year = Integer.parseInt(s[1]);
					Month month = Month.of(Integer.parseInt(s[2]));
					int day = Integer.parseInt(s[3]);
			        Person p = new Person(name,LocalDate.of(year, year, day)));
					Person.add(p);
					return p;
		})
		.forEach(System.out::println);
	 }catch(IOException ioe) {
		 System.out.println(ioe);
	}
//		Stream<Person> stream = person.stream();
//		Optional<Person>opt=
//				
//		stream.filter(p -> p.getAge() >=20)
//			.min(Comparator.comparing(Person::getAge));
//		System.out.println(opt);
//		
//		Optional<Person>opt2=
//		stream.max(Comparator.comparing(Person::getAge));
//		System.out.println(opt2);
//		Map<Integer,List<Person>>map=
//				person.stream()
//					.collect(
//							Collectors.groupingBy(
//									Person::getAge
//							)
//					);
//		System.out.println(map);
	}
	}



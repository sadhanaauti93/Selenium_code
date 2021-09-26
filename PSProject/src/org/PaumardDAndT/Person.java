package org.PaumardDAndT;

import java.time.LocalDate;

public class Person {
private String Name;
private LocalDate dateOfBirth;
public Person() {}
public Person(String Name, LocalDate dateOfBirth) {
	this.Name = Name;
	this.dateOfBirth = dateOfBirth;
}
public String getName() {
	return Name;
}

public LocalDate getDateOfBirth() {
	return dateOfBirth;
}
@Override
public String toString() {
	return "Person{"+ "Name="+Name+",  dateOfBirth="+dateOfBirth+'}';
}


}

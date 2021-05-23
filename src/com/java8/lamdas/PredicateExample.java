package com.java8.lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateExample {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			System.out.println("Inside Supplier !!! ");
			return "Hellos !!";
		};
		Consumer<String> consumer = (s) -> {
			System.out.println("Inside Consumer !!! " + s);
		};
		Predicate<Person> eligibleToVote = (p) -> p.getAge() > 18;
		System.out.println("Supplier:: " + supplier.get());
		System.out.println("Predicate:: Is Person above 18 : " + eligibleToVote.test(new Person(21, "ABC", "PQR")));
		consumer.accept("Manish");
		Function<Person, String> returnPersonFullName = person -> person.getFirstName() + person.getLastName();
		System.out.println("Function:: " + returnPersonFullName.apply(new Person(21, "ABC", "PQR")));
		List<String> list = new ArrayList<>(List.of("one", "two", "three", "four", "five", "six"));
		Predicate<String> filter = s -> s.startsWith("f");
		list.removeIf(filter);
		Consumer<String> consumer2 = s -> System.out.println(s);
		list.forEach(consumer2);
	}

}

class Person {
	int age;
	String firstName;
	String lastName;

	public Person(int age, String firstName, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
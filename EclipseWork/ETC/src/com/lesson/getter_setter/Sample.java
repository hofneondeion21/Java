package com.lesson.getter_setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {
	private static List<User> users = new ArrayList<>();

	public static void main(String[] args) {
		User u1 = new User("JD01", "Jay Dyon", 99);
		User u2 = new User("LS01", "Lucas Sz", 99);
		users.add(u1);
		users.add(u2);
		users.stream().forEach(System.out::println);
		// Spelled your last name wrong
		updatePrompt();

		System.out.println("-----UPDATED-----");
		users.stream().forEach(System.out::println);
	}

	private static void updatePrompt() {
		System.out.println("Type 0 to Exit or 1 to make Change");
		try (Scanner z = new Scanner(System.in)) {
			String input = z.next();
			if (input.equalsIgnoreCase("0")) {
				return;
			}
			System.out.println("Enter ID to Update: ");
			input = z.next();
			User temp = null;
			for (User u : users) {
				if (input.equalsIgnoreCase(u.getId())) {
					temp = u;
				}
			}
			if (temp != null) {
				System.out.println("Udpate [0] Name, [1] Age: ");
				input = z.next();
				z.nextLine();
				if (input.equalsIgnoreCase("0")) {
					System.out.println("Enter Updated Name: ");
					String newName = z.nextLine();
					temp.setName(newName);
				} else if (input.equalsIgnoreCase("1")) {
					System.out.println("Enter Updated Age: ");
					String newName = z.nextLine();
					temp.setName(newName);
				}
				System.out.println("SUCCESSFULLY UPDATED!\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class User {
	private int age;
	private String name;
	private String id;

	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getId() {
		return id;
	}

	public String toString() {
		return String.format("%s, %s, %d", id, name, age);
	}

}
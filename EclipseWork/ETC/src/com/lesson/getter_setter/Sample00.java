package com.lesson.getter_setter;

public class Sample00 {
	static int global_variable = 99;

	public void exampleMethod() {
		int local_variable = 99;
	}

	public static void main(String... args) {
		System.out.println(local_variable);
		System.out.println(global_variable);

	}
}

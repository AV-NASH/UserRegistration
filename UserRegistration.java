package com.cg.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the user registration program\n");
		userInterface();
	}

	private static void userInterface() {
		String firstname = checkFirstName();
		String lastname=checkLastName();
		String email=checkEmailAddress();
	}

	private static String checkFirstName() {
		String firstname;
		boolean check;
		do {
			System.out.println("enter first name");
			firstname = scanner.nextLine();
			check = Pattern.matches("(^[A-Z])([a-zA-Z]){2,}", firstname);
			if (!check)
				System.out.println("Invalid name please enter valid name");
		} while (!check);
		return firstname;

	}

	private static String checkLastName() {
		String lastname;
		boolean check;
		do {
			System.out.println("enter last name");
			lastname = scanner.nextLine();
			check = Pattern.matches("(^[A-Z])([a-zA-Z]){2,}", lastname);
			if (!check)
				System.out.println("Invalid name please enter valid name");
		} while (!check);
		return lastname;

	}

	private static String checkEmailAddress() {
		String email;
		boolean check;
		do {
			System.out.println("enter email address");
			email = scanner.nextLine();

			check = Pattern.matches(
					"^[_a-zA-z0-9]+([\\+-\\.]{1}+[_a-zA-z0-9]+)*[@]{1}+[_a-zA-z0-9]+[\\.]{1}+[_a-zA-z0-9]{2,}+([\\.]{1}+[a-zA-z]{2}+)*$",
					email);
			if (!check)
				System.out.println("Invalid name please enter valid email");
		} while (!check);
		return email;

	}
}

package com.bootcamp.employeesystemapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class EmployeeSystemApiApplication {

	public static void main(String[] args) {
		// SpringApplication.run(EmployeeSystemApiApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number: ");
		double num1 = scanner.nextDouble();

		System.out.println("Enter second number: ");
		double num2 = scanner.nextDouble();

		System.out.println("Choose (+, -, *, /}: ");
		char operator = scanner.next().charAt(0);

		scanner.close();
		double result = 0;

		switch (operator)
		{
			case '+':
				result = num1 + num2;
				break;

			case '-':
				result = num1 - num2;
				break;

			case '*':
				result = num1 * num2;
				break;

			case '/':
				if (num2 != 0)
					result = num1 / num2;
				else {
					System.out.println("Error! Dividing by zero is not allowed.");
					return;
				}
				break;

			default:
				System.out.println("Error! Invalid operator. Please enter correct operator.");
		}
		System.out.println(result);
	}

}

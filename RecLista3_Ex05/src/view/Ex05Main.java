package view;

import java.util.Scanner;

import controller.Ex05Controller;

public class Ex05Main {

	public static void main(String[] args) {
		
		Ex05Controller controller = new Ex05Controller();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digitos para o fibonacci: ");
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
            System.out.println((i+1) + " = " + controller.fibonacci(i));
        }
		
	}
	
}

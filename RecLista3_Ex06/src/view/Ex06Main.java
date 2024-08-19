package view;

import java.util.Scanner;

import controller.Ex06Controller;

public class Ex06Main {

	public static void main(String[] args) {
		
		Ex06Controller controller = new Ex06Controller();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Limite da sequencia: ");
		int n = scanner.nextInt();
		
		double resultado = controller.somaDiv(n);
		System.out.println(resultado);
		
	}
	
}

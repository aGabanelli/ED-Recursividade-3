package view;

import java.util.Scanner;

import controller.Ex01Controller;

public class Ex01View {

	public static void main(String[] args) {
		
		Ex01Controller controller = new Ex01Controller();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = scanner.nextInt();
		int resultado = controller.contarNumeros(n);
		System.out.println("Seu número possui " + resultado + " dígitos");
		
	}
	
}

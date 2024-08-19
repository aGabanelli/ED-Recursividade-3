package view;

import java.util.Scanner;

import controller.Ex04Controller;

public class Ex04View {

	public static void main(String[] args) {
		
		Ex04Controller controller = new Ex04Controller();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero para convertermos para binário: ");
		int n = scanner.nextInt();
		
		if(n > 2000) {
			System.out.println("Número muito grande");
		}
		else {
			String resultado = controller.converterBinario(n, "");
			
			System.out.println(resultado);			
		}
		
		
	}
}

package view;

import java.util.Scanner;

import controller.Ex03Controller;

public class Ex03View {

	public static void main(String[] args) {
		
		Ex03Controller controller = new Ex03Controller();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra para inverter: ");
		String palavra = scanner.next();
		
		int tamanho = palavra.length();
		
		String resultado = controller.trocaSring(palavra, "", tamanho-1);
		
		System.out.println(resultado);
	}
	
}

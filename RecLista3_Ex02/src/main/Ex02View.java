package main;

import java.util.Scanner;

import controller.Ex02Controller;

public class Ex02View {

	public static void main(String[] args) {
		
		Ex02Controller controller = new Ex02Controller();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma cadeia de números: ");
		int nGrande = scanner.nextInt();
		
		if(nGrande <= 999999) {
			System.out.print("Digite um número para encontrar: ");
			int n = scanner.nextInt();
			
			if(n < 10) {
				int resultado = controller.contagem(nGrande, n);
				
				System.out.println("O número " + n + " se repete " + resultado + " vezes");							
			}
			else {
				System.out.println("Não é possivel procurar números com dezenas");
			}
			
		}
		else {
			System.out.println("Número muito grande!");
		}
		
	}
	
}

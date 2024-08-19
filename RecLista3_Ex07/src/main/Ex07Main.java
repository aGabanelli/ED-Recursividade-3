package main;

import java.util.Scanner;

import controller.Ex07Controller;

public class Ex07Main {

	public static void main(String[] args) {
		Ex07Controller controller = new Ex07Controller();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número para a soma: ");
		String n = scanner.next();
		
		String[] numerosString = n.split("");
		int tamanho = numerosString.length;
		int[] numeros = new int[tamanho];
		
		for(int i = 0 ; i < tamanho; i++) {
			numeros[i] = Integer.parseInt(numerosString[i]);
		}
		
		int resultado = controller.soma(numeros, tamanho);
		System.out.println(resultado);
		
	}
	
}

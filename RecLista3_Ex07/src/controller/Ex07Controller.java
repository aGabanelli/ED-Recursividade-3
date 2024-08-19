package controller;

public class Ex07Controller {

	public Ex07Controller() {
		super();
	}
	
	public int soma(int[] numeros, int tamanho) {
		//tamanho é um contador, então se for igual a 0, retorna 0 para a soma
		if(tamanho == 0) {
			return 0;
		}
		
		//senão, retorna a soma da posição do número com a posição-1
		return numeros[tamanho-1] + soma(numeros, tamanho-1);
	}
	
}

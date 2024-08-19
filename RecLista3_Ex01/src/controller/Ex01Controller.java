package controller;

public class Ex01Controller {

	public Ex01Controller() {
		super();
	}
	
	public int contarNumeros(int n) {
		int divisao = n / 10;
		//a parada é feita quando o número for menor que 10, ja que
		//o maior digito inteiro é 9, o que significa que só restou
		//um dígito, onde adicionamos ele no return
		if(n < 10) {
			return 1;
		} else {
			//divide por 10 para diminuir um dígito do número,
			//e somamos ele no retorno
			return 1 + contarNumeros(divisao);
		}
		
	}
	
}

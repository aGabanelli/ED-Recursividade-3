package controller;

public class Ex06Controller {

	public Ex06Controller() {
		super();
	}
	
	//utilizei duas recursivas, não sei se tinha um jeito mas simples
	public double somaDiv(int n) {
		double div = 1/(fatorial(n));
		
		//n é utilizado como um contador, então se for =1 ele retorna o resultado
		if(n == 1) {
			return div;
		}
		
		//enquanto isso, é feita a soma da divisao com o resultado da divisão com n-1
		else {
			return div + somaDiv(n-1);
		}
	}
	
	
	//fatorial comum, feito anteriormente
	public double fatorial(int n) {
		if(n == 1) {
			return 1;
		}
		else{
			return n * fatorial(n-1);
		}
	}
	
}

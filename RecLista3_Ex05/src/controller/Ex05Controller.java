package controller;

public class Ex05Controller {

	public Ex05Controller() {
		super();
	}
	
	public int fibonacci(int n) {
		//n = 1 ou = 0 tem seus valores iguais
        if (n < 2) {
            return n;
        //aqui a função é somada com ela mesma, mudando apenas o valor de seus índices
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
	}
}

package controller;

public class Ex04Controller {

	public Ex04Controller() {
		super();
	}
	
	public String converterBinario(int n, String binario) {
		int divisao = n/2;
		int resto = n%2;
		
		// o resto ser 0 pode retornar a recursiva sem ter terminado, então
		//ela só finaliza quando n<1 também
		if (resto == 0 && n <=1) {
			return binario;
		}
		
		//como ja foi feita a divisão, aqui apenas adicionamos o resto para
		//a string e retornamos ela aos poucos
		else {
			String digito = String.valueOf(resto);
			binario = digito + binario;
			return converterBinario(divisao, binario);
		}
	}
}

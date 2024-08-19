package controller;

public class Ex03Controller {

	public Ex03Controller() {
		super();
	}
	
	public String trocaSring(String atual, String nova, int f) {
		String fim = atual.substring(f,f+1);
		String invertida = nova + fim;
		
		//a função segue sendo chamada enquanto f (que é o tamanho da string)
		//for maior ou igual a 0
		if(f == 0) {
			return invertida;
		}

		//enquanto isso, retorna a string sendo invertida aos poucos
		else {
			return trocaSring(atual, invertida, f-1);
		}
	}
	
}
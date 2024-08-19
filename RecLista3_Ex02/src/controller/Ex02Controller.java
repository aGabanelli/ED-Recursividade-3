package controller;

public class Ex02Controller {

	 public Ex02Controller() {
		super();
	 }
	 
	 public int contagem(int nGrande, int n){
		 int resto = nGrande%10;
		 int divisao = nGrande/10;
		 
		 // a parada é feita quando a cadeia de números for menor ou igual a 0
		 if(nGrande <= 0) {
			 return 0;
		 }
		 
		 //a contagem é feita a partir do resto, onde se o resto for igual o número
		 //que está sendo procurando, é adicionado 1 ao contador.
		 if(resto == n) {
			 return 1 + contagem(divisao, n);
		 }else {
			 return contagem(divisao, n);
		 }
		 
	 }
	
}

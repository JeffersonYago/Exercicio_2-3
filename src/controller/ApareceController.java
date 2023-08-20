package controller;

public class ApareceController {

	public ApareceController() {
		super();
	}
	public int QtdAparece(int a, int b, int aparece) {
		int resto = 0;
		if (a <= 0) {
//quando "a" for igual ou menor que zero, será interrompida a chamada da recursiva para evitar o erro de divisão por 0
			return aparece;
		}
		else {
			resto = a % 10;
			if(resto == b) {
				aparece++;
//"resto" recebe o restante da divisão de "a" por dez e é feita a comparação entre resto e "b" para conferir se eles coincidem 
			}
			return QtdAparece(a / 10, b, aparece);
		}
	}
}

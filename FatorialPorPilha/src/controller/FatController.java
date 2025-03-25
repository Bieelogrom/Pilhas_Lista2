package controller;

public class FatController {
	Pilha p = new Pilha();
	
	public FatController() {
		// TODO Auto-generated constructor stub
	}
	
	public long fatorial(int n) {
		int fatorial = 1, resultado = 0;
		for(int i = n; i >= 1; i--) {
			fatorial *= i;
			p.push(fatorial);
		}
		
		try {
			resultado = p.pop();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return resultado;
	}
}

package view;

import java.util.Scanner;

import controller.FatController;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FatController fc = new FatController();
		int valor = 0;
		
		do {
			System.out.println("Digite o valor para calcular fatorial: ");
			valor = sc.nextInt();
		}while(valor < 1 || valor > 10);
	
		long resultado = fc.fatorial(valor);
		
		System.out.println("Resultado: "+ resultado);
	}
}

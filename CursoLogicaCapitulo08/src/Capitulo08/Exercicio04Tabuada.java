package Capitulo08;

import java.util.Scanner;

public class Exercicio04Tabuada {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o n�mero: ");
		Integer numero = scanner.nextInt();
		
		System.out.println("----------------------------------");
		
		imprimirTabuada(numero, 0);
		
		scanner.close();
	}
	
	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));
		
		if (++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
	}

}

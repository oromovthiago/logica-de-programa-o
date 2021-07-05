package Capitulo05;

import java.util.Scanner;

public class IfEncadeado {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		Double peso = scanner.nextDouble();
		
		
		// ** Primeira forma ** 
		
//		Boolean pesoLeve = peso <= 60;
//		Boolean pesoMedio = (peso > 60) && (peso <= 90);
//		Boolean pesoPesado = peso > 90;
//		
//		if (pesoLeve) {
//			System.out.println("O lutador(a) � peso leve.");
//		} else {
//			Boolean pesoMedio = (peso > 60) && (peso <= 90);
//			
//			if (pesoMedio) {
//				System.out.println("O lutador(a) � peso m�dio.");
//			} else {
//				Boolean pesoPesado = peso > 90;
//				
//				if (pesoPesado) {
//					System.out.println("O lutador(a) � peso pesado.");
//				}				
//			}
//		}
		
		// ** Segunda  forma ** 
		
		Boolean pesoLeve = (peso <= 60) && (peso > 0);
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado = peso > 90;
		
		if (pesoLeve) {
			System.out.println("O lutador(a) � peso leve.");
		} else if (pesoMedio) {
			System.out.println("O lutador(a) � peso m�dio.");
		} else if (pesoPesado) {
			System.out.println("O lutador(a) � peso pesado.");
		} else {
			System.out.println("O lutador(a) n�o se encaixa em categoria alguma.");
		}
		
		scanner.close();
		
		
	}

}

package Capitulo05;

import java.util.Scanner;

public class Exercicio01NotaFinal {
	
	final static Double NOTA_FINAL_PARA_APROVACAO = 150.0;
	
	final static Double NOTA_MINIMA = 60.0;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Analisando notas para aprova��o do Concurso");
		
		System.out.println("Qual foi a nota de Portugues? ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.println("Qual foi a nota de Matematica? ");
		Double notaMatematica = scanner.nextDouble();
		
		Boolean acimaDaNotaMiminaPortugues = notaPortugues >= NOTA_MINIMA;
		
		Boolean acimaDaNotaMiminaMatematica = notaMatematica >= NOTA_MINIMA;
		
		Double totalNotas = notaPortugues + notaMatematica;
		
		Boolean notaParaAprovacao = totalNotas >= NOTA_FINAL_PARA_APROVACAO;
		
		Boolean passou = notaParaAprovacao && acimaDaNotaMiminaMatematica 
				&& acimaDaNotaMiminaPortugues;
		
		if(passou) {
			System.out.println("Parab�ns! Voce foi aprovado");
		}else {
			System.out.println("Infelizmente, voc� n�o foi aprovado.");
		}
		
		scanner.close();
	}

}

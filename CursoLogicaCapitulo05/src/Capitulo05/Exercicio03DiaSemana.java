package Capitulo05;

import java.util.Scanner;

public class Exercicio03DiaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insira o dia da semana: ");
		Integer diaDaSemana = scanner.nextInt();

		String dia;

		switch (diaDaSemana) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Ter�a-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "S�bado";
			break;
		default: dia = "INV�LIDO";			
		}
		
		System.out.println("O dia escolhido foi: "+ dia);

		scanner.close();
	}

}

package Capitulo04;

import java.util.Scanner;

public class Exercicio01Calculadora {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("*** CALCULADORA **** ]");

		System.out.print("Digite o primeiro numero: ");
		Double primeiroNumero = scanner.nextDouble();

		System.out.print("Digite qual ser� a opera��o [1. soma / 2. subtra��o / 3. multiplica��o / 4. divis�o: ]");
		Integer operacao = scanner.nextInt();

		System.out.print("Digite o segundo numero: ");
		Double segundoNumero = scanner.nextDouble();

		Double resultado = null;

		if (operacao.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		}
		if (operacao.equals(2)) {
			resultado = primeiroNumero - segundoNumero;
		}
		if (operacao.equals(3)) {
			resultado = primeiroNumero * segundoNumero;
		}
		if (operacao.equals(4)) {
			resultado = primeiroNumero / segundoNumero;
		}

		System.out.println("O resultado da opera��o �: " + resultado);

		scanner.close();

	}

}

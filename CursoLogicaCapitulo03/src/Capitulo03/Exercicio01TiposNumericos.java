package Capitulo03;
import java.util.Scanner;

public class Exercicio01TiposNumericos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Calculando o quadrado de um n�mero ");
		
		System.out.print("Digite o n�mero: ");
		Double numeroComum = scanner.nextDouble();

		Double quadrado = numeroComum * numeroComum;

		System.out.println("O quadrado de: " + numeroComum + " �: " + quadrado);

		scanner.close();
	}
}

package Capitulo04;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		
		Boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 > 2? " + tresMaiorQueDois);
		
		Boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 < 2? " + tresMenorQueDois);
		
		Boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 > 3? " + tresMaiorQueTres);
		
		Boolean tresMaiorOuIgualAQueTres = 3 >= 3;
		System.out.println("3 >= 3? " + tresMaiorOuIgualAQueTres);
		
		Boolean tresMenorOuIgualAQueTres = 3 <= 3;
		System.out.println("3 >= 3? " + tresMenorOuIgualAQueTres);
		
		Boolean doisIgualADois = 2 == 2;
		System.out.println("2 � igual a 2? " + doisIgualADois);
		
		Boolean doisDiferenteDeDois = 2 != 2;
		System.out.println("2 � diferente de 2? " + doisDiferenteDeDois);
		
		Integer quatro = 4;
		Boolean quatroMaiorQueQuatro = quatro > quatro;
		System.out.println("Quatro � maior que quatro? " + quatroMaiorQueQuatro);
		
		Boolean quatroMaiorOuIgualAQuatro = quatro >= quatro;
		System.out.println("Quatro � maior ou igual a quatro? " + quatroMaiorOuIgualAQuatro);
	
		Integer cinco = 5;
		Boolean cincoIgualACinco = cinco.equals(cinco);
		System.out.println("Cinco � igual a cinco? " + cincoIgualACinco);
		
		Integer seis = 6;
		Boolean cincoIgualASeis = cinco.equals(seis);
		System.out.println("Cinco � igual a seis? " + cincoIgualASeis);
		
		Integer centoEVinteEOito = 128;
		Integer centoEVinteEOito02 = 128;
		Boolean centoEVinteOitoIgualCentoEVinteEOito = centoEVinteEOito.equals(centoEVinteEOito02);
		System.out.println("centoEVinteEOito.equals(centoEVinteEOito02)? " + centoEVinteOitoIgualCentoEVinteEOito );
		
		Boolean centoEVinteOitoIgualCentoEVinteEOito02 = centoEVinteEOito == centoEVinteEOito02;				// este operador relacional s� faz o comparativo at� o numero 127
		System.out.println("centoEVinteEOito == centoEVinteEOito02? " + centoEVinteOitoIgualCentoEVinteEOito02 );
	}

}

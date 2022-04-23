package curso_programacao;

import java.util.Locale;

public class Atividade1 {

	public static void main(String[] args) {

		String produto1 = "Computador";
		String produto2 = "Mesa de computador";

		byte idade = 30;
		int codigo = 5290;
		char genero = 'F';

		double preco1 = 2100.0;
		double preco2 = 650.50;
		double measure = 53.234567;

		System.out.printf(
				"Produtos:%n Computador, cujo preço é R$ %.2f reais%n Mesa de Computador, cujo preço é R$ %.2f reais%n %d anos de idade, código %d e gênero: %s%n Mensure com 8 casas decimais: %.8f %n Arredondando (3 casas decimais): %.3f %n",
				preco1, preco2, idade, codigo, genero, measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f %n", measure);
		
		System.out.printf("---------------- Alternativa----------------%n");
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", produto1, preco1);
		System.out.printf("%s, which price is $ %.2f%n", produto2, preco2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", idade, codigo, genero);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);

	}

}

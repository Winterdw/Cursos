package curso_programacao;

import java.util.Locale;

public class teste {

	public static void main(String[] args) {
		/*
		%d = inteiro
		%s = string
		%f = ponto flutuante
		%n = quebra de linha
		 */
		String nome = "Winter";
		int idade = 25;
		double renda = 1500;
		System.out.printf("%s tem %d anos e recebe R$ %.2f reais%n", nome, idade, renda);
		Locale.setDefault(Locale.US);
	}

}

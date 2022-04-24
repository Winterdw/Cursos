package curso_programacao;

import java.util.Scanner;

public class Exercicio_1URI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x,y,soma;
		System.out.println("Digite o primeiro número: ");
		x= sc.nextDouble();		
		System.out.println("Digite o segundo número: ");
		y= sc.nextDouble();	
		sc.close();
		soma = x+y;
		System.out.printf("A soma de %.2f + %.2f é igual a: %.2f", x,y,soma);		

	}

}

package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5URI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
				
		int cod1,num1,cod2,num2;
		double valor1, valor2,total;
		
		System.out.println("Digite o valor de código, número de peças e valor unitário do produto 1: ");
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		System.out.println("Digite o valor de código, número de peças e valor unitário do produto 2: ");
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();
		sc.close();	
		
		total =(num1 * valor1) + (num2 * valor2);			
		
		System.out.printf("Valor a pagar é de R$%.2f reais", total);		
			

	}

}

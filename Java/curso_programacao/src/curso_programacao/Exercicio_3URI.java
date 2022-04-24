package curso_programacao;
import java.util.Scanner;

public class Exercicio_3URI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a,b,c,d,dif;
		System.out.println("Digite o valor do primeiro número: ");
		a= sc.nextInt();
		System.out.println("Digite o valor do segundo número: ");
		b= sc.nextInt();
		System.out.println("Digite o valor do terceiro número: ");
		c= sc.nextInt();
		System.out.println("Digite o valor do quarto número: ");
		d= sc.nextInt();
		sc.close();
		dif=((a*b)-(c*d));
		System.out.printf("A diferença do produto de A e B pelo produto de C e D é de %d .", dif);		

	}

}

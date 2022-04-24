package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2URI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		double x,pi,area;
		System.out.println("Digite o valor do raio: ");
		x= sc.nextDouble();
		sc.close();
		pi= 3.14159;
		area = pi*(x*x);
		System.out.printf("O valor da área do círculo com quatro casas decimais é de de %.4f%n", area);		

	}

}

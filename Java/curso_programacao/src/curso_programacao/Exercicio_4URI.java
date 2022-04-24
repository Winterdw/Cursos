package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4URI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		int num,horas;
		double valh,sal;
		System.out.println("Digite o número do funcionário: ");
		num= sc.nextInt();
		System.out.println("Digite o número de horas trabalhadas: ");
		horas= sc.nextInt();
		System.out.println("Digite o valor que o funcionário recebe por hora: ");
		valh= sc.nextDouble();
		sal = valh*horas;
		sc.close();
		System.out.printf("Funcionário de número %d receberá um salário de U$ %.2f ddólares.", num,sal);		

	}

}

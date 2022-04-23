package curso_programacao;

import java.util.Scanner;

public class QuebrasDeLinha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Digite a string que deseja armazenar:");
		String x = sc.next();
		sc.close();
		// atalho pra system out: digita sysout = ctrl+espaço
		System.out.println("voce digitou " + x);*/
		
		int x;
		String s1,s2,s3;
		x = sc.nextInt();
		sc.nextLine(); //gambiarra para ler um enter
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}

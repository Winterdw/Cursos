package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6URI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		double pi = 3.14159;

		System.out.println("Digite os 3 valores a serem calculados: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		sc.close();

		triangulo = (a * c) / 2;
		circulo = (c * c) * pi;
		trapezio = ((a + b) * c) / 2;
		quadrado = b * b;
		retangulo = a * b;
						
		System.out.printf("As áreas das seguintes figuras são de:%n Triângulo: %.3f %n Circulo: %.3f %n Trapezio: %.3f %n Quadrado: %.3f %n Retângulo: %.3f.",triangulo, circulo, trapezio, quadrado, retangulo);

	}

}

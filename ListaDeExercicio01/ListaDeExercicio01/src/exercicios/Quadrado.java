package exercicios;

import java.util.Scanner;


public class Quadrado {
		
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int numero = sc.nextInt();
		int resultado = numero * numero;
		System.out.println("O resultado do quadrado é: " + resultado);
		sc.close();
		
	}
	
}
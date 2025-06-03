package exercicios;

import java.util.Scanner;

public class Resto {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		int numero2 = sc.nextInt();
		int resto = numero1 % numero2;
		System.out.println("O resto da divisão é: " + resto);
		sc.close();
	}

}
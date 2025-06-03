package exercicios;

import java.util.Scanner;



public class Retangulo {
	
	public static void main(String[]args) {
	      Scanner sc = new Scanner(System.in);
	      
	      
	      System.out.println("Digite a largura do retângulo: ");
	      float largura = sc.nextFloat();
	      System.out.println("Digite a altura do retângulo: ");
	      float altura = sc.nextFloat();
	      float area = altura*largura;
	      System.out.println("A área do retângulo é: " + area +" cm²");
	      sc.close();
	      
	      
	}

}
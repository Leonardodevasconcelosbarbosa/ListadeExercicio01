package exercicios;

import java.util.Scanner;


public class Circulo {
	
	public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite o raio do círculo: ");
        float raio = sc.nextFloat();
        float perimetro = 2*3.14f*raio;
        System.out.println("O valor do perímetro é:  "+ perimetro);
        System.out.printf("O valor do perimetro é: %.2f", perimetro);
        sc.close();
        
        
        
	}
	

}
package exercicios;

import java.util.Scanner;


public class ConversaoTemperatura {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura em graus Celcius que deseja converter");
		float temperaturaCelcius = sc.nextFloat();
		float temperaturaFahrenheit = (temperaturaCelcius*9/5)+32;
		System.out.println("A temperatura em graus Celcius convertida para Fahrenheit é: "+ temperaturaFahrenheit);
		sc.close();
	}

}

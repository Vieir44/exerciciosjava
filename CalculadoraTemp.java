package exercicios0603;

import java.util.Scanner;

public class CalculadoraTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Entrada de dados
		double fahrenheit, celsius;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em Fahrenheit: ");
	    fahrenheit = ler.nextDouble();
	    
	    celsius = ((fahrenheit-32)*5)/9;
	    System.out.println("Essa temperatura em Celsius é: " + celsius);
	    ler.close();
	    

	}

}

package exercicios0603;

import java.util.Scanner;

public class Quatrooperacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Entrada de dados
		double a, b, sub, mult, soma, div;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor 1: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o valor 2: ");
		b = ler.nextDouble();
		
		sub = (a - b);
		mult = (a * b);
	    soma = (a + b);
	    div = (a / b);
	    
	    System.out.println("O valor da soma dos dois valores será de: " + soma);
	    System.out.println("O valor da multiplicação dos dois valores será de: " + mult);
	    System.out.println("O valor da divisão dos dois valores será de: " + div);
	    System.out.println("O valor da substração dos dois valores será de: " + sub);
	    ler.close();
	    
	    
	    
	    
	    
	    
	    
	    
	    		
	    
	    
		
				
		
		
		
		
		

	}

}

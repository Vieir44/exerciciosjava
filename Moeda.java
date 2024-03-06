package exercicios0603;

import java.util.Scanner;

public class Moeda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b = 4.94, reais;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma quantidade de dinheiro em dólar ");
		a = ler.nextDouble();
		
		reais= a*b;
		
		System.out.println("O Valor desse dinheiro em reais é: " + reais);
		ler.close();
		
		
		
		
		

	}

}

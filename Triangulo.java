package exercicios0603;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Entrada de dados
		
		double base, altura, área;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor da base de um triângulo ");
		base = ler.nextDouble();
		
		System.out.println("Digite o valor da altura do mesmo ");
		altura = ler.nextDouble();
		
		área=(base*altura)/2;
		
		System.out.println("A área do triângulo será: " + área);
		ler.close();
		
		
		
		
		
		

	}

}

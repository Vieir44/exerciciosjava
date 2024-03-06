package exercicios0603;

import java.util.Scanner;

public class Combustível {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Entrada de dados
		double km, valorgas, consumototal, consumomed, valortotal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o valor do litro da gasolina? ");
		valorgas = ler.nextDouble();
		
		System.out.println("Qual a distância total percorrida pelo veículo? ");
		km = ler.nextDouble();
		
		System.out.println("Qual o consumo médio do seu veículo? ");
		consumomed = ler.nextDouble();
		
		consumototal = km/consumomed;
		valortotal = valorgas*consumototal;
		
		System.out.println("O consumo total foi de: " + consumototal);
		System.out.println("O valor total foi de: " + valortotal);
		ler.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

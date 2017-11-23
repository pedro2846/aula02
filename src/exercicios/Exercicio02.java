package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		float distancia;
		float combustivel;
		double consmedio;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Distancia percorrida:  ");
		distancia = Float.parseFloat(scan.nextLine());
		
		System.out.print("Combustivel consumido:  ");
		combustivel = Float.parseFloat(scan.nextLine());
		
		scan.close();
		
		consmedio = distancia/combustivel;
		
		System.out.println("O consumo médio é de: " + consmedio);
	}
}

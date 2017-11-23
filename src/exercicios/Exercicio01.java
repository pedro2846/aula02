package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Double num;
		Double desconto;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = Double.parseDouble(scan.nextLine());
		
		
		scan.close();
		desconto = num *0.09;
		System.out.println("O valor reajustado com o desconto será: " + (num - desconto));
	}
}

package exemplos;

import java.util.Scanner;

public class LeituradoTeclado {
	public static void main(String[] args) {
		
		long matricula;
		String nome;
		int idade;
		double peso;
		float altura;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a matricula da pessoa: ");
		String txtMatricula = scan.nextLine();
		matricula = Long.parseLong(txtMatricula);
		
		System.out.print("Informe o nome da pessoa: ");
		nome = scan.nextLine();
		
		System.out.print("Informe a idade da pessoa: ");
		String txtIdade = scan.nextLine();
		idade = Integer.parseInt(txtIdade);
		
		System.out.print("Informe o peso da pessoa: ");
		String txtPeso = scan.nextLine();
		peso = Double.parseDouble(txtPeso);
		
		System.out.print("Informe a altura da pessoa: ");
		String txtAltura = scan.nextLine();
		altura = Float.parseFloat(txtAltura);
		
		scan.close();
		
		System.out.println("\nDados da pessoa: " + "\nMatricula: " + matricula + "\nNome: " + nome + "\nIdade: "+ idade + " anos" + "\nPeso: " + peso +" kg" + "\nAltura: " + altura+"cm");
	}
	
}

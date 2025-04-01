package Exercicios;

import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float salario;
		float abono;
		
		System.out.println("Digite o seu salário: ");
		salario = scanner.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = scanner.nextFloat();
		
		float novosalario = salario + abono;
		
		System.out.println("O seu salário é " + novosalario);
		


	}

	
}

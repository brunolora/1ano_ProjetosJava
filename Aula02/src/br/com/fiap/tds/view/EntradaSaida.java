package br.com.fiap.tds.view;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		//ler os dados inseridos pelo usu�rio[
		//Instanciar um objeto do tipo snanner
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		//Ler um n�mero inteiro
		int x = leitor.nextInt();
		
		System.out.print("Digite outro n�mero: ");
		//Ler outro n�mero inteiro
		int y = leitor.nextInt();

		int soma = x+y;
		//Exibir a soma dos n�meros
		System.out.println("A soma �: " + soma);
		
		//Fechar o leitor
		leitor.close();
		
	}
	
}
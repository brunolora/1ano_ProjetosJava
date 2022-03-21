package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class Exercicio02 {

	/**
	 * Crie um programa em Java onde o usu�rio informa N n�meros e ao final � 
	 * impresso o maior entre eles. Nota: o n�mero N � um valor solicitado ao
	 * usu�rio durante a execu��o do programa; utilize vetores na solu��o.
	 */
	public static void main(String[] args) {
		//Ler a quantidade de n�meros
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de n�meros:"));
		
		//Criar o vetor para armazenar os n�meros
		int[] vetor = new int[qtd];
		
		//La�o de repeti��o para ler os n�meros
		for (int i=0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero:"));
		}
		
		//Vari�vel com o maior n�mero
		int maior = vetor[0];
		
		//Determinar qual o maior n�mero
		for (int i=1; i < vetor.length; i++) {
			if (vetor[i] > maior)
				maior = vetor[i];
		}
		
		//Exibir os n�meros e o maior n�mero
		System.out.println("O maior n�mero � " + maior);
		for (int item : vetor) {
			System.out.println(item + " ");

		}
		
	}


}

package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class TesteCondicionais {
	
	public static void main(String[] args ) {

		//ler a idade do usu�rio
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
	
		//verificar se pode dirigir ou n�o
		if (idade >= 18) {
		System.out.println("Pode tirar a CNH");
		} else {
		System.out.println("Tem que esperar...");
		}
	
		//Declarar uma vari�vel do tipo boolean
		//if ou else com uma �nica instru��o, n�o precisa das {}
		boolean ok = false;
	
		//diferente no java � != , =! � a nega��o + a atribui��o
		if (ok != true)
		System.out.println("Ok � verdadeiro");
		else
		System.out.println("Ok � falso");
	
		// Digite o dia da semana( 1 - segunda, 2 - ter�a...)
		int semana = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana"));
	
		//Exibir o dia da semana (Segunda, ter�a, quarta...)
		switch(semana) {
			case 1:
				System.out.println("Segunda");
				break;
			case 2:
				System.out.println("Ter�a");
				break;
			case 3:
				System.out.println("Quarta");
				break;
			case 4:
				System.out.println("Quinta");
			break;
			case 5:
				System.out.println("Sexta");
				break;
			case 6:
				System.out.println("S�bado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Dia inv�lido");
		}

		// Digite a sigla do estado
		String sigla = JOptionPane.showInputDialog("Digite o estado");
	
		//Exibe a capital do estado
		switch (sigla) {
			case "SP":
				System.out.println("S�o Paulo");
			break;
			case "MG":
				System.out.println("Belo Horizonte");
				break;
			case "BA":
				System.out.println("Salvador");
				break;
				default:
					System.out.println("Estado inv�lido");
		}
	
	}//main
	
}//classe

package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class TesteEleitores {

	/*
	 Leia a idade de 3 pessoas e informe a sua classe eleitoral:
	 * n�o eleitor (abaixo de 16 anos)
	 * Eleitor obrigat�rio (entre 18 e 65)
	 * eleitor facultativo (16, 17 anos e maior de 65 anos)
	 Ao final da execu��o exibir o total de eleitores obrigat�rios.
	 */
	public static void main(String[] args) {
		
		//armazena a qtd de pessoas obrigadas a votar
		int qtd = 0; 
		
		//for (variavel controle, condi��o parada, incremento/decremento) {}
		for (int i = 0; i <3; i++) {
			//Ler a idade
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			
			//Validar o tipo de eleitor
			if (idade < 16) {
				JOptionPane.showMessageDialog(null, "N�o eleitor");
			} else if (idade >= 18 && idade <= 65) {
				JOptionPane.showMessageDialog(null, "Eleitor obrigat�rio");
				qtd++;
			} else {
				JOptionPane.showMessageDialog(null, "Eleitor Facultativo");
			}
			
		}//for
		
		//Exibir a quantidade de eleitores obrigat�rios
		JOptionPane.showMessageDialog(null, "Eleitores obrigat�rios: " + qtd);
		
	}//main
	
}//classe
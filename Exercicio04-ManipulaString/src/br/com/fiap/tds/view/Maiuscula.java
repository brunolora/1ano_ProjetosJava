package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class Maiuscula {

	//Ler uma informa��o e exibir tudo em maiuscula
	public static void main(String[] args) {
		
		//L� uma palavra
		String palavra = JOptionPane.showInputDialog("Digite uma palavra");
		
		//Transformar em mai�scula
		palavra = palavra.toUpperCase();
		
		//Exivir o resultado
		System.out.println(palavra);
		
	}
	
}

package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Bicicleta;
import br.com.fiap.tds.bean.Carro;
import br.com.fiap.tds.bean.Fabricante;
import br.com.fiap.tds.bean.Veiculo;

public class Programa {

	public static void main(String[] args) {

		//Instanciar um Veiculo
		Veiculo veiculo = new Veiculo();
		
		//Instanciar um carro
		Carro carro = new Carro();
		
		//Ler os dados da bicicleta
		String modelo = JOptionPane.showInputDialog("Digite o modelo da bicicleta");
		int rodas = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de rodas"));
		int aro = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero do aro da bicicleta"));
		String guidao = JOptionPane.showInputDialog("Digite o tipo de guid�o");
		
		//Ler os dados do fabricante
		String nome = JOptionPane.showInputDialog("Digite o nome do fabricante");
		String pais = JOptionPane.showInputDialog("Digite o pais do fabricante");		
		
		Fabricante fabricante = new Fabricante(nome, pais);
		
		//Instanciar uma Bicicleta
		Bicicleta bicicleta = new Bicicleta(rodas, modelo, fabricante, aro, guidao);
		
		//Exibir os dados
		System.out.println("Modelo: " + bicicleta.getModelo() + "\nRodas: " + bicicleta.getNumeroRodas() + 
				"\nAro: " + bicicleta.getNumeroAro() + "\nGuid�o: " + bicicleta.getGuidao());
		
		System.out.println("\nFabricante: " + bicicleta.getFabricante().getNome());
		System.out.println("Pa�s: " + bicicleta.getFabricante().getPais());
		
	}
	
}
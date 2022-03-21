package br.com.fiap.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.fiap.tds.bean.Funcionario;
import br.com.fiap.fiap.tds.bean.Nivel;
import br.com.fiap.fiap.tds.bean.Programador;

public class View {
	
	public static void main(String[] args) {
		//Ler os dados do funcion�rio
		//id, nome, n�vel, sal�rio, linguagem
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID"));
		String nome = JOptionPane.showInputDialog("Digite o nome");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio"));
		
		//L� uma String e tranforma em uma das op��es de N�vel (Constante)
		Nivel nivel = Nivel.valueOf(JOptionPane.showInputDialog("Digite o n�vel"));
		
		//Instanciar um funcion�rio com os dados
		Funcionario funcionario = new Funcionario(id, nome, nivel, salario);
		
		//Calcular e exibir o aumento de sal�rio
		System.out.println(funcionario);
		double novoSalario = funcionario.aumentarSalario();
		
		System.out.println("Novo sal�rio: " + novoSalario);
		System.out.println(funcionario);
		
		//Calcular e exibir o b�nus anual
		System.out.println("B�nus: " + funcionario.calcularBonusAnual());
		
		//Instanciar um Programador com os mesmos dados do funcion�rio e ler a linguagem
		String linguagem = JOptionPane.showInputDialog("Digite a linguagem");
		Programador programador = new Programador(id, nome, nivel, salario,linguagem);
		
		//Exibir os dados do Programador
		System.out.println(programador);
		
		//Chamar o m�todo para aumentar o sal�rio
		System.out.println("Novo sal�rio do programador: " + programador.aumentarSalario());
		
		//Exibir os dados do Programador
		System.out.println(programador);
		
		//Calcular e exibir o n�nus anual do Programador
		System.out.println("B�nus anual do programador: " + programador.calcularBonusAnual());
		
		//Funcionario e Programador
		Funcionario f2 = programador; //Programador � um funcionario?
		f2.aumentarSalario(); //Chama o m�todo de qual classe? Programador
		
		if (f2 instanceof Programador) {
		//Cast -> For�a a variavel f2 ser do tipo Programador (Se n�o for, d� erro)
		Programador p2 = (Programador) f2; //Funcionario � um programador? N�o, necessariamente
		System.out.println("P2: " + p2);
		} else {
			System.out.println("O f2 n�o � um programador");
		}
	}
}

















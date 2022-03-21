package br.com.fiap.fiap.tds.bean;

public class Programador extends Funcionario {
	
	private String linguagem;
	
	//M�todos
	
	@Override
	public String toString() {
		return super.toString() + ", linguagem: " + linguagem;
	}
	
	//Sobrescrever um m�todo (Override)
	//Mesmo m�todo da classe pai na classe filha

	//Sobrescrever o m�todo calcularBonusAnual para retornar o valor de acordo com o n�vel
	//E adicionar um valor de acordo com a linguagem -> Java recebe 1000 reais de b�nus, Python -> 500
	@Override
	public double calcularBonusAnual() {
		double bonus = super.calcularBonusAnual();
		if(linguagem.equals("Java")) {
			bonus += 1000;
		} else if (linguagem.equals("Python")) {
			bonus += 999;
		}
		return bonus;
	}
	
	@Override //Anota��o (informa��o adicional do m�todo, garente a sobrescrita)
	public double aumentarSalario() {
		salario = salario + salario * 0.2;
		return salario;
	}


	//Construtores -> CTRL + 3 gcuf
	public Programador() {}
	
	public Programador(String linguagem) {
		this.linguagem = linguagem;
	}

	public Programador(int id, String nome, Nivel nivel, double salario, String linguagem) {
		super(id, nome, nivel, salario);
		this.linguagem = linguagem;
	}

	
	//Getters e Setters
	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	
}

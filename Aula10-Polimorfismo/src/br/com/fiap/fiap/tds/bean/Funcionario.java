package br.com.fiap.fiap.tds.bean;

public class Funcionario {
	
	//Atributos
	private int id;
	
	private String nome;
	
	private Nivel nivel;
	
	protected double salario;
	
	//M�todos
	
	//Sobrescrever o m�todo toString(); utilizado quando imprimimos um Objeto
	@Override
	public String toString() {
		return "Id: " + id + ", nome: " + nome + ", n�vel: " + nivel + ", sal�rio: " + salario;
	}
	
	//Sobrecarga de m�todos (Overload)
	//Mesmo m�todo com par�metros diferentes (tipos de dados)
	
	//Calcular o b�nus anual de acorodo com o n�vel
	//JUNIOR -> 1 sal�rio, PL -> 2 sal�rios, SR -> 3 sal�rios, ESPC -> 10 sal�rios
	public double calcularBonusAnual() {
		int fator = 0;
		if (nivel == Nivel.JUNIOR)
			fator = 1;
		else if (nivel == Nivel.PLENO)
			fator = 2;
		else if (nivel == Nivel.SENIOR)
			fator = 3;
		else if (nivel == Nivel.ESPECIALISTA_SUPREMO)
			fator = 10;
			return salario * fator;
	}
	
	//Calcular o b�nus anual de acordo com as horas trabalhadas
	// horas trabalhadas x sal�rio / 180
	public double calcularBonusAnual(float horasTrabalhadas) {
		return salario * horasTrabalhadas / 180;
	}
	
	
	//Aumentar sal�rio em 10%
	public double aumentarSalario() {
		salario = salario + salario * 0.1;
		return salario;
	}
	
	//Aumentar o sal�rio de acordo com a % informada
	public double aumentarSalario(float porcentagem) {
		salario = salario + salario*porcentagem;
		return salario;
	}
	
	//Aumentar o sal�rio de acordo com as metas de entrega de projeto
	public void aumentarSalario(int projetosEntregues, int meta) {
		salario = salario + salario * projetosEntregues/meta;
	}


	
	//Construtores
	public Funcionario() {}
	
	public Funcionario(int id, String nome, Nivel nivel, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
	}

	//Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
	
	

}

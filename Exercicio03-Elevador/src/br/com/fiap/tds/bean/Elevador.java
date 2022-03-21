package br.com.fiap.tds.bean;

public class Elevador {

	//Atributos
	private int andarAtual, totalAndares, capacidade, pessoasPresentes;
	
	//Construtor!!
	public Elevador(int capacidade, int total) {
		this.capacidade = capacidade;
		totalAndares = total;
	}
	
	//M�todo que retorna os valores do elevador
	public String gerenciarElevador() {
		String dados = "Capacidade: " + capacidade + " Pessoas presentes: " +
				pessoasPresentes + " Total Andares: " + totalAndares + 
				" Andar atual: " + andarAtual;
		return dados; //CTRL + espa�o
	}
	
	//o m�todo entra() deve adicionar o valor passado como par�metro ao atributo
	//quantidadeAtualPessoas, desde que a capacidade do elevador n�o seja excedida
	//Ap�s executar o procedimento citado, o m�todo deve retornar o valor do atributo
	//quantidadeAtualPessoas;
	public int entrar(int qtd) {
		//validar se � poss�vel adicionar as pessoas, se poss�vel adiciona-las no elevador
		if (validarEntrada(qtd)) {
			pessoasPresentes = pessoasPresentes + qtd; //pessoasPresentes = pessoasPresentes + qtd;
		}
		//retorns o valor das pessoasPresentes
		return pessoasPresentes;
	}
	
	//Subir, descer, entrar e sair
		public void entrar() {
			if (validarEntrada(1))
			pessoasPresentes++;
		}
		
		private boolean validarEntrada(int qtd) {
			return pessoasPresentes + qtd <= capacidade;
		}
	
	/*
	 * O m�todo sai() deve subtrair do atributo quantidadeAtualPessoas o valor passado
	 * como par�metro, desde que o resultado desta opera��o seja um n�mero maior ou igual a 0.
	 * Ap�s executar o procedimento citado, o m�todo deve retornar a quantidade de pessoas
	 * restantes no elevador;
	 * */
	public int sair(int qtd) {
		//validar se � poss�vel retirar pessoa do elevador, se sim, retirar
		if (validarSaida(qtd)) {
			pessoasPresentes-= qtd; //pessoasPresentes = pessoasPresentes - qtd
		}
		//retornar o valor atual das pessoas presentes no elevador
		return pessoasPresentes;
	}
	
	public void sair() {
		if (validarSaida(1))
			pessoasPresentes--;
	}
	
	private boolean validarSaida(int qtd) {
		return pessoasPresentes - qtd >= 0;
	}
	
	
	/*
	 * Adicionar 1 ao atributo andarAtual, desde que o resultado desta opera��o
	 * n�o seja maior que o valor do atributo quantidadeAndar. Ap�s executar o procedimento citado,
	 * o m�todo deve retornar o valor true quando o valor for adicionado e false no caso contr�rio;
	 */
	public boolean subir() {
		if (andarAtual == totalAndares) {
			return false;
		} 
			andarAtual++;
			return true;
		
	}
	
	/*
	 * Deve subtrair 1 ao atributo andarAtual, desde que o resultado desta opera��o
	 * n�o seja menor que 0 (zero). Ap�s executar o procedimento citado,
	 * o m�todo deve retornar o valor true quando o valor for subtraido e false no caso contr�rio;
	 */
	
	public boolean descer() {
		if (andarAtual > 0) {
			andarAtual--;
			return true;
		}
			return false;			
		
	}
	
	//Getters e Setters -> CTRL + 3 -> ggas

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getPessoasPresentes() {
		return pessoasPresentes;
	}

	
}
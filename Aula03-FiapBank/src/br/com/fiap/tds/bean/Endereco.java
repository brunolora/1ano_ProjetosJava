package br.com.fiap.tds.bean;

public class Endereco {

	//Atributos
	public String rua;

	public short numero;
	
	public String complemento;
	
	public String bairro;
	
	public String cep;
	
	//M�todos
	//retorna o numeor do endere�o
	public short getNumero() {
		return numero;
	}
	
	//Altera o n�mero do endere�o
	public void setNumero(short novoNumero) {
		numero = novoNumero;
	}
	
}

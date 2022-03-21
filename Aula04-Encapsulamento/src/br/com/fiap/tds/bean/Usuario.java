package br.com.fiap.tds.bean;

//Modificaroes de acesso: (4)
//private -> somente a pr�pria classe
//sem modificador -> default/package -> a pr�pria classe e as classes no mesmo pacote
//protected -> a pr�pria classe, as classes no mesmo pacote e as classes filhas
//public -> todos
public class Usuario {

	//Atributo
	private int codigo;
	
	private String nome;
	
	private boolean ativo;
	
	//M�todos de leitura e escrita (Gets/Sets)
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	//get para boolean ->getAtivo() ou isAtivo()
	public boolean getAtivo() {
		return ativo;
	}
	
	//M�todo
	public void logar() {
		validarUsuario();
	}
	
	public void verificarPermissao() {
		validarUsuario();
	}
	
	private void validarUsuario() {
		
	}
}

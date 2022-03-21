package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Cliente;
import br.com.fiap.tds.bean.ContaCorrente;
import br.com.fiap.tds.bean.Endereco;

public class Teste {

	public static void main(String [] args) {
		//Ler os dados do endere�o, cliente e conta
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a rua: ");
		String rua = leitor.next() + leitor.nextLine();
		
		System.out.print("Digite o n�mero: ");
		short numero = leitor.nextShort();
		
		System.out.print("Digite o CEP: ");
		String cep = leitor.next() + leitor.nextLine();
		
		System.out.print("Digite o complemento: ");
		String compl = leitor.next() + leitor.nextLine();
		
		
		System.out.print("Digite o bairro: ");
		String bairro = leitor.next() + leitor.nextLine();
		
		System.out.print("Digite o nome: ");
		String nome = leitor.next() + leitor.nextLine();
		
		System.out.print("Digite o CPF: ");
		String cpf = leitor.next() + leitor.nextLine();
		
		System.out.print("Digite o saldo: ");
		double saldo = leitor.nextDouble();
		
		//Instanciar um endere�o, cliente e conta
		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente();
		ContaCorrente cc = new ContaCorrente();
		//Atribuir os dados nos objetos
		//sysout = ctrl + espa�o 
		endereco.rua = rua;
		endereco.bairro = bairro;
		endereco.cep = cep;
		endereco.complemento = compl;
		endereco.numero = numero;
		
		cliente.nome = nome;
		cliente.cpf = cpf;
		cliente.endereco = endereco;
		
		cc.saldo = saldo;
		cc.titular = cliente;
		
		//Exibir os dados
		System.out.println("N�mero: " + endereco.getNumero());
		System.out.println("Saldo: " + cc.saldo + " Nome: " + cc.titular.nome + " Rua: " + 
				cc.titular.endereco.rua);
		
		leitor.close();
	}
	
}

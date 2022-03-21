package br.com.fiap.tds.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tds.bean.Produto;


public class ProdutoDao {

	public void cadastrar(Produto produto) throws IOException{
		//Criar o stream de saída de dados, escrever no final do arquivo
		FileWriter outputSteam = new FileWriter("produtos.txt", true);
		//Criar o objeto que escrever no arquivo
		PrintWriter arquivo = new PrintWriter(outputSteam);
		
		//Escrever os valores do produto no arquivo, separando os atributos por ","
		arquivo.println(produto.getNome() + "," + produto.getCodigo() + "," + produto.getPreco() + "," + produto.getQtd() );
		
		//Fechar
		outputSteam.close();
		arquivo.close();
	}
	
	public List<Produto> listar() throws IOException{
		//Criar o stream de entrada de dados
		FileReader inputStream = new FileReader("filmes.txt");	
			
		//Criar o objeto para ler do arquivo
		BufferedReader arquivo = new BufferedReader(inputStream);
				
		//Criar a lista de filmes
		List<Produto> filmes = new ArrayList<>();
				
		String linha;
				
		//Ler as linhas do arquivo
		while ((linha = arquivo.readLine()) != null) {
			//Separar os dados (atributos) .split(",") -> Retorna um vetor de string, separado pelo caracter informado
			String[] dados = linha.split(",");
			//Instanciar o filme e adicionar na lista
			Produto produto = new Produto(dados[0], dados[1], Integer.parseInt(dados[2]), dados[3]);
			filmes.add(produto);
			}
		return filmes;
	}
}

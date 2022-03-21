package br.com.fiap.tds.view;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import br.com.fiap.tds.bean.Produto;

/**
 * Desenvolva um programa em java que permita ao usu�rio cadastrar e consultar
 * os n�meros de DDD pertencentes a um estado(UF).
 * a) Ao ser executado o sistema dever� exibir um menu ao usu�rio onde � apresentado 3 op��es:
 * 		i) Incluir o estado e seus DDDs
 * 		ii) Consultar os DDDs de um estado
 * 		iii) Sair
 * b) Caso o usu�rio selecione a op��o 1, o sistema dever� solicitar a sigla do estado e
 *    depois permitir que o usu�rio atrinua quantos n�meros de DDD desejar.
 * c) Caso o usu�rio selecione a op��o 2, o sistema dever� solicitar a sigla do estado e
 * 	  depois exibir os n�meros de DDD que foram atribu�dos a ele.
 * */
public class Menu{
	
	public static void main(String[] args) {
		//Objeto para ler os dados inseridos pelo usu�rio
		Scanner leitor = new Scanner(System.in);
		//Vari�vel que armazena a escolha do usu�rio
		int opcao;
		
		//Vari�vel para armazenar as siglas e os DDDs (Mapa -> chave - sigla, valor - DDDs)
		Map<Integer, Set<Produto>> mapa = new HashMap<Integer, Set<Produto>>();
		
		//La�o de repeti��o
		do {
			//Exibir o menu e ler a op��o escolhida
			System.out.println("Escolha: \n1-Adicionar \n2-Consultar por c�digo \n3-Consultar por nome"
					+ " \n4-Listar \n5-Remover \n6-Editar \n7-Sair");
			
			//Criar um Set para armazenar produtos
			Set<Produto> produtos = new HashSet<Produto>();
			
			opcao =  leitor.nextInt();
			switch (opcao) {
			case 1:
				//Adicionar contains pra n�o repetir codigos
            	 //Ler o codigo
            	System.out.println("Digite um c�digo do produto:");
                int codigo = leitor.nextInt();
                if (mapa.containsKey(codigo)) {
                	do {
                		System.out.println("Digite um c�digo v�lido do produto:");
                		codigo = leitor.nextInt();
                		} while(mapa.containsKey(codigo));
                }
                
                //Ler o Produto
                System.out.println("Digite o nome:");
                String nome = leitor.next();
                System.out.println("Digite a qtd do produto:");
                int qtd = leitor.nextInt();
                System.out.println("Digite o preco:");
                Double preco = leitor.nextDouble();
                
                Produto produto = new Produto(nome, qtd, preco);
                produtos.add(produto);
                
                //Adicionar o mapeamento no mapa
                mapa.put(codigo, produtos);
                break; 
                
			case 2:
				//Ler o c�digo
				System.out.println("Digite c�digo: ");
				codigo = leitor.nextInt();

				//Verifica se o produto possui a c�digo
				if (mapa.containsKey(codigo)) {
					//Pesquisar os DDDs pela sigla
					produtos = mapa.get(codigo);
					
					//Exibir o nome, 
					for (Produto item : produtos) {
						System.out.println(item);
					}
				} else {
					System.out.println("O c�digo: " + codigo + " n�o possui produto cadastrado!");
				}
				break;
				
			case 3:
				/*System.out.println("Digite o nome do produto:");
				nome = leitor.next();
				 for (int codigos : mapa.keySet()) {
	                    
						produtos = mapa.get(codigos);
	                    Set<Produto> value = new HashSet<>();
	                    value = mapa.containsValues();
	                    System.out.println(codigo + " " + value);
	                }

				 
				 for (int i = 0; i < mapa.size(); i++) {
	                    if (mapa.get(i)) {
	                    }
	                }
	                
	               /* //Exibir a chave (codigo) e os valores (produto)
	                for (String produto : codigo) {
	                    System.out.println(produto + " " + mapa.get(produto));
	                }*/
				break;
				
			case 4:
				
				//Exibir todos os produtos
				Set<Integer> codigos = mapa.keySet();
				for (Integer item : codigos) {
					System.out.println(item + " " + mapa.get(item));
				}
				break;
		
			case 5:
				
				System.out.println("Digite o codigo do produto:");
                codigo = leitor.nextInt();
                if (mapa.containsKey(codigo)) {
                    mapa.remove(codigo);
                    System.out.println("Item apagado com sucesso!");
                } else {
                    System.out.println("O produto nao foi cadastrado!");
                }
				break;
				
			case 6:
				
				System.out.println("Digite um c�digo do produto:");
                codigo = leitor.nextInt();
                do {
	                if (mapa.containsKey(codigo)) {
	               		//Ler o Produto
		                System.out.println("Digite o nome:");
		                nome = leitor.next();
		                System.out.println("Digite a qtd do produto:");
		                qtd = leitor.nextInt();
		                System.out.println("Digite o preco:");
		                preco = leitor.nextDouble();                
		                produto = new Produto(nome, qtd, preco);
		                produtos.add(produto);
		                //Adicionar o mapeamento no mapa
		                mapa.put(codigo, produtos);	
		                break;
	                } else {                
	                	do {
	                	System.out.println("Digite um c�digo v�lido do produto:");
	            		codigo = leitor.nextInt();
	            		} while(mapa.containsKey(codigo) != true);
	                }
                } while(true);
                break;
			case 7:
				System.out.println("Finalizando o sistema");
				break;
			default:
				System.out.println("Op��o inv�lida");
			}
		} while (opcao !=7);
		leitor.close();
	}//main
}//class
















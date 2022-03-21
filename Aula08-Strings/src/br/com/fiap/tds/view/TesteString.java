package br.com.fiap.tds.view;

public class TesteString {
	
	public static void main(String[] args) {
		
		//Exibir a informa��o: "An�lise de Sistemas"
		System.out.println(" \t \"An�lise de Sistemas\" ");
		
		//Declarar uma String com o nome do Filme
		String filme = "Se eu fosse voc� 3D";
		//Concatenar o filme com a produtora do filme
		filme += ", Globo"; //filme = filme + " Globo";
		System.out.println(filme);
		
		//Concatenar o filme com o diretor
		filme = filme.concat(", Matheus");
		System.out.println(filme);
		
		//Declarar uma String e inicializar
		String nome = "Salvio";
		//String sobrenome = "Salvio"; <- Isso da "Strings iguais" |String sobrenome = new String("Salvio"); -> Isso da "Strings diferentes"
		String sobrenome = new String ("salvio");
		//Cria uma nova String e associa a vari�vel nome
		//nome = nome + "Papliskas"; 
		
		//Sempre comparar uma string com o m�todo equals
		if (nome.equals(sobrenome)) {
			System.out.println("Strings iguais");
		} else {
			System.out.println("Strings diferentes");
		}
		
		//Compara string sem considerar as mai�sculas e min�sculas
		if (nome.equalsIgnoreCase(sobrenome)) {
			System.out.println("String iguais");
		} else {
			System.out.println("String diferentes");
		}
		
		//Tern�rio (condi��o?verdadeiro:falso)
		System.out.println(nome.equals(sobrenome)?"Strings iguais":"Strings diferentes");
		
	}//main
}//classe

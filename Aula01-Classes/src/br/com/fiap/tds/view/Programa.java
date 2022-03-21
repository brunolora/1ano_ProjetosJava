package br.com.fiap.tds.view;

public class Programa {
	
	public static void main (String [] args) {
		
		//Declara��o de duas vari�veis do tipo int
		int x = 10;
		int y = 2;
		
		//Realizar a soma de x e y
		int soma = x+y;
		
		//Exibir a soma
		System.out.println(soma);
		
		//Realizar a subtra��o
		int subtracao = x-y;
		//Exibir a subtra��o
		System.out.println("A subtra��o � " + subtracao);
		//Realizar a multipli��o
		int multiplicacao = x*y;
		//Exibir a multiplica��o
		System.out.println("A multiplica��o � " + multiplicacao);
		//Realizar a divis�o
		int divisao = x/y;
		//Exibir o resultado da divis�o
		System.out.println("A divis�o � " + divisao);
		
		//obter o resto da divisao // x=10, y=2 (mod)
		int resto = x%y;
		//Exibir o resto da divis�o	
		System.out.println("O resto da divis�o � " + resto);
		//Incremento
		x++; //incremento em 1 unidade -> x = x+1
		System.out.println("Incremento: " + x);
		
		//Decremento
		x--; //retira 1 unidade -> x = x-1;
		System.out.println("Decremento: " + x);
		
		//Atribui��o aditiva
		x += 2; //x = x+2;
		System.out.println("Adi��o aditiva: " + x);
		
		//Atribui��o subtrativa
		x -= y; // x = x-y
		System.out.println("Atribui��o subtrativa: " + x);
		//Atribui��o multiplicativa
		x *= y; //x = x*y
		System.out.println("Atribui��o multiplicativa: " + x);
		//Atribui��o de divis�o
		x /= y; //x=x/y
		System.out.println("Atribui��o de divis�o: " + x);
		//Atribui��o de resto
		x %= y; // x = x%2;
		System.out.println("Atribui��o de resto: " + x);
		
		}
		
}
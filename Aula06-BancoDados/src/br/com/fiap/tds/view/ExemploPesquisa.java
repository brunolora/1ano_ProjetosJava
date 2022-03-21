package br.com.fiap.tds.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploPesquisa {
	
	public static void main(String[] args) {
		try {
			
		
		//Obter uma conex�o com o banco
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "RM86940", "060396");
				
		//Criar o Statement
		Statement comando = conexao.createStatement();

		//Executar a pesquisa no banco
		ResultSet resultado = comando.executeQuery("select * from TB_PRODUTO");
			
		//Enquanto houver registros no resultado
		while (resultado.next()) {
			//Recuperar os dados das colunas
			int codigo = resultado.getInt("cd_produto");
			String nome = resultado.getString("nm_produto");
			double valor = resultado.getDouble("vl_produto");
			int qtd = resultado.getInt("qt_produto");
			String descricao = resultado.getString("ds_produto");
		
			System.out.println("C�digo: " + codigo + " Nome: " + nome + "Valor: "
					+ valor + " Qtd: " + qtd + " Descri��o: " + descricao);
		}
		
		//Fechar a conex�o com o banco
		conexao.close();
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}//main
}//class
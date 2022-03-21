package br.com.fiap.tds.bean;

public class Data {

	//Atributos
	private int ano, mes, dia;
	
	//M�todos
	
	//M�todos que retorna a data no formato dd/mm/aaaa
	public String getData() {
		return dia + "/" + mes + "/" + ano;
	}
	
	//M�todo para validar o dia - Ele deve estar entre 1 e 31.
	//Caso contr�rio inicializar o atributo com o valor 1
	private int validarDia(int dia) {
		//&& (e) || (ou)
		// >, <, >=, <=, ==, != (maior, menor, maior igual, menor igual, igual, diferente)
		if ( dia >= 1 && dia <= 31) {
			return dia;
		} else {
			return 1;
		}
	}
	
	
	//M�todo para validar o ano
	//Ele n�o deve ser negativo. Caso contr�rio inicializar o atributo com 2020
	private int validarAno(int ano) {
		if (ano>0) {
			return ano;
		} else {
			return 2020;
		}
	}
	
	//M�todo para validar o m�s
	//Ele deve estar entre 1 e 12. Caso contr�rio inicializar o atributo com 1
	private int validarMes(int mes) {
		if (mes>=1 && mes<=12) {
			return mes;
		} else {
			return 1;
		}
	}
	
	//M�todo que retorna o nome do m�s
	public String retornaMes() {
		if (mes == 1)
			return "Janeiro";
		else if(mes == 2)
			return "Fevereiro";
		else if(mes == 3)
			return "Mar�o";
		else if(mes == 4)
			return "Abril";
		else if(mes == 5)
			return "Maio";
		else if(mes == 6)
			return "Junho";
		else if(mes == 7)
			return "Julho";
		else if(mes == 8)
			return "Agosto";
		else if(mes == 9)
			return "Setembro";
		else if(mes == 10)
			return "Outubro";
		else if(mes == 11)
			return "Novemrbo";
		else
			return "Dezembro";




	}
	
	//Gets e Sets
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = validarAno(ano);
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = validarMes(mes);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = validarDia(dia);
	}
	
	
}

package br.com.fiap.tds.service;

import br.com.fiap.tds.exception.MesesTrabalhadosInvalidoException;
import br.com.fiap.tds.exception.SalarioInvalidoException;

/**
 * Classe que calcularssal�rios e b�nus dos Colaboradores
 * @author Pedro Silva
 * @version 1.0
 */
public class SalarioService {
	
	/**
	 * M�todo que calcula o d�cimo terceiro sal�rio do colaborador
	 * @param salario valor do s�lario
	 * @param mesesTrabalhados meses trabalhados pelo colaborador
	 * @returno valor do d�cimo terceiro sal�rio
	 * @throws MesesTrabalhadosInvalidoException exception caso os meses trabalhados n�o esteja entre 0 e 12
	 * @throws SalarioInvalidoException exception caso o sal�rio seja negativo
	 */

	public double calcular13(double salario, int mesesTrabalhados) throws MesesTrabalhadosInvalidoException, SalarioInvalidoException {
		
		//Validar se os meses trabalhados est� entre 0 e 12
		if (mesesTrabalhados < 0 || mesesTrabalhados > 12) {
			//Lan�ar uma exception
			throw new MesesTrabalhadosInvalidoException("Meses trabalhados inv�lido");
		}	
		//Validar se o sal�rio � negativo
		if (salario>0) {
			//lan�ar uma exception
			throw new SalarioInvalidoException("O sal�rio n�o pode ser negativo");
		}
		
		return salario*mesesTrabalhados/ 12;
	}
	
}
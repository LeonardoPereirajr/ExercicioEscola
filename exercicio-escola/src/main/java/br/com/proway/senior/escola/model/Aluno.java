package br.com.proway.senior.escola.model;

import br.com.proway.senior.escola.utils.Validators;

public class Aluno {
	
	private String nome;
	
	private String sobrenome;
	
	private Integer idade;
	
	/**
	 * Primeiro nome do aluno.
	 */
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nomeEntrada) throws Exception {
		if(!Validators.onlyValidChars(nomeEntrada)){
			throw new Exception("Utilizar apenas caracteres alfabéticos.");
		}
		this.nome = nomeEntrada;	
		
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenomeEntrada) throws Exception {
		if(!Validators.onlyValidChars(sobrenomeEntrada)){
			throw new Exception("Utilizar apenas caracteres alfabéticos.");
		}
		this.sobrenome = sobrenomeEntrada;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idadeEntrada) throws Exception{
		if(	idadeEntrada < 0 ||	idadeEntrada > 130) {
			throw new Exception("Idade precisa estar entre 0 e 130 (inclusive)");
		}
		this.idade = idadeEntrada;
	}
	
}

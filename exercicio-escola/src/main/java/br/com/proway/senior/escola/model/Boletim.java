package br.com.proway.senior.escola.model;

import java.util.ArrayList;

public class Boletim {

	private Integer id;
	private Aluno aluno;
	private Integer periodo;
	private Double media;
	private ArrayList<Prova> provas;

	public Boletim(Aluno aluno, Integer periodo) {
		this.aluno = aluno;
		this.periodo = periodo;
		this.media = 0.0;
		this.provas = new ArrayList<Prova>();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public Integer getPeriodo() {
		return periodo;
	}


	public Double getMedia() {
		return media;
	}
	

	public ArrayList<Prova> getProvas() {
		return this.provas;
	}

	public void setMedia(double media) {
		this.media = media;		
	}

	public void resetProvas() {
		this.provas = new ArrayList<Prova>();
	}
}

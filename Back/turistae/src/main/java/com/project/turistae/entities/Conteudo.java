package com.project.turistae.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_conteudo")
public class Conteudo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID_Post;
	private String descricao;
	private String anexo;
	private Date data;
	
	
	public Conteudo() {
		super();
	}


	public Conteudo(Long iD_Post, String descricao, String anexo, Date data) {
		super();
		ID_Post = iD_Post;
		this.descricao = descricao;
		this.anexo = anexo;
		this.data = data;
	}


	public Long getID_Post() {
		return ID_Post;
	}


	public void setID_Post(Long iD_Post) {
		ID_Post = iD_Post;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getAnexo() {
		return anexo;
	}


	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}
	

}
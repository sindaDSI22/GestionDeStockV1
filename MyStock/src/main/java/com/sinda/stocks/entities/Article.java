package com.sinda.stocks.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArticle;
	private String nomArticle;
	private int nbrArticle;
	private String marque;
	
	@ManyToOne
	private Categorie categorie;
	
	public Article() {
		super();
	}

	public Article(String nomArticle, int nbrArticle, String marque) {
		super();
		this.nomArticle = nomArticle;
		this.nbrArticle = nbrArticle;
		this.marque = marque;
	}

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	

	public int getNbrArticle() {
		return nbrArticle;
	}

	public void setNbrArticle(int nbrArticle) {
		this.nbrArticle = nbrArticle;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", nomArticle=" + nomArticle + ", nbrArticle=" + nbrArticle
				+ ", marque=" + marque + "]";
	}

	

}

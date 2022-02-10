package com.sinda.stocks.service;

import java.util.List;

import com.sinda.stocks.entities.Article;
import com.sinda.stocks.entities.Categorie;

public interface ArticleService {
	Article saveArticle(Article a);

	Article updateArticle(Article a);

	void deleteArticle(Article a);

	void deleteArticleById(Long id);

	Article getArticle(Long id);

	List<Article> getAllArticles();

	List<Article> findByNomArticle(String nom);

	List<Article> findByNomArticleContains(String nom);

	List<Article> findByNomMarque(String nom, String marque);

	List<Article> findByCategorie(Categorie categorie);

	List<Article> findByCategorieIdCat(Long id);
}

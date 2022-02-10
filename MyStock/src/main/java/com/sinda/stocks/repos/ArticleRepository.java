package com.sinda.stocks.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sinda.stocks.entities.Article;
import com.sinda.stocks.entities.Categorie;

@RepositoryRestResource(path = "rest")
public interface ArticleRepository extends JpaRepository<Article, Long> {
  List<Article> findByNomArticle(String nom);
  List<Article> findByNomArticleContains(String nom);
  
  @Query("select a from Article a where a.nomArticle like %?1 and a.marque like ?2")
  List<Article> findByNomMarque (String nom, String marque);
  @Query("select a from Article a where a.categorie = ?1")
  List<Article> findByCategorie (Categorie categorie);
  
  List<Article> findByCategorieIdCat(Long id);

  

}

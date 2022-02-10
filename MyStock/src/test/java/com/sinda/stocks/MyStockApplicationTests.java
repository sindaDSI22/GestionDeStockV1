package com.sinda.stocks;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sinda.stocks.entities.Article;
import com.sinda.stocks.entities.Categorie;
import com.sinda.stocks.repos.ArticleRepository;

import java.util.List;

@SpringBootTest
class MyStockApplicationTests {
	@Autowired
	private ArticleRepository articleRepository;

	@Test
	public void testCreateArticle() {
		Article art = new Article("ecran HP", 5, "HP");
		articleRepository.save(art);
	}

	@Test
	public void testFindArticle() {
		Article art = articleRepository.findById(1L).get();
		System.out.println(art);
	}

	@Test
	public void testUpdateArticle() {
		Article art = articleRepository.findById(1L).get();
		art.setNomArticle("Ecran HP");
		articleRepository.save(art);
	}

	@Test
	public void testDeleteArticle() {
		articleRepository.deleteById(1L);
		;
	}

	@Test
	public void testListerTousArticles() {
		List<Article> artc = articleRepository.findAll();
		for (Article A : artc) {
			System.out.println(A);
		}

	}

	@Test
	public void findByNomArticle() {
		List<Article> arts = articleRepository.findByNomArticle("ecran HP");
		for (Article a : arts) {
			System.out.println(a);
		}
	}

	@Test
	public void findByNomArticleContains() {
		List<Article> arts = articleRepository.findByNomArticleContains("ecran HP");
		for (Article a : arts) {
			System.out.println(a);
		}
	}

	@Test
	public void findByNomMarque() {
		List<Article> arts = articleRepository.findByNomMarque("ecran HP", "HP");
		for (Article a : arts) {
			System.out.println(a);
		}
	}

	@Test
	public void testfindByCategorie() {
		Categorie cat = new Categorie();
		cat.setIdCat(1L);
		List<Article> arts = articleRepository.findByCategorie(cat);
		for (Article a : arts) {
			System.out.println(a);
		}
	}

	@Test
	public void findByCategorieIdCat() {
		List<Article> arts = articleRepository.findByCategorieIdCat(1L);
		for (Article a : arts) {
			System.out.println(a);
		}
	}

}

package com.sinda.stocks.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomArticle", types = { Article.class })

public interface ArticleProjection {
  public String getNomArticle();
}

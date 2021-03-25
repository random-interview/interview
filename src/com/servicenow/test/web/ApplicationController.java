package com.servicenow.test.web;

import java.util.List;

import com.servicenow.test.data.ArticleRepo;
import com.servicenow.test.data.model.Article;
import com.servicenow.test.service.ArticleService;

public class ApplicationController {

	private ArticleRepo articleRepo;
	private ArticleService articleService;

	public List<Article> getArticles() {
		return articleService.getArticles();
	}

	public Article getSingleArticleByUrl(String url) {
		return articleRepo.getArticle(url);
	}
}

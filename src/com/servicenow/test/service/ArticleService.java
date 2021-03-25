package com.servicenow.test.service;

import java.util.List;

import com.servicenow.test.data.ArticleRepo;
import com.servicenow.test.data.model.Article;

public class ArticleService extends SecurityService {

	private ArticleRepo articleRepo;

	public ArticleService() {
		this.articleRepo = new ArticleRepo();
	}

	public List<Article> getArticles() {
		authorize();

		List<Article> articles = articleRepo.getArticles(getUserId());
		return process(articles);
	}

	private List<Article> process(List<Article> articles) {
		//TRANSLATE ARTICLE TITLES
		return articles;
	}
}

package com.servicenow.test.data;

import java.util.ArrayList;
import java.util.List;

import com.servicenow.test.data.model.Article;

public class ArticleRepo {

	public List<Article> getArticles(String userId) {
		return new ArrayList<>();
	}

	public Article getArticle(String url) {
		return new Article();
	}
}

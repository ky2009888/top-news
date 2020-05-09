package com.top.news.model.mess.admin;


import com.top.news.model.article.pojos.ApArticleConfig;
import com.top.news.model.article.pojos.ApArticleContent;
import com.top.news.model.article.pojos.ApAuthor;
import lombok.Data;

@Data
public class AutoReviewClNewsSuccess {
    private ApArticleConfig apArticleConfig;
    private ApArticleContent apArticleContent;
    private ApAuthor apAuthor;

}

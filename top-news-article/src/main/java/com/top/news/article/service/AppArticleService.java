package com.top.news.article.service;


import com.top.news.model.article.dtos.ArticleHomeDto;
import com.top.news.model.common.dtos.ResponseResult;

/**
 * @author Lenovo
 */
public interface AppArticleService {
    /**
     * type  1 加载更多  2 加载更新
     * @param dto
     * @param type
     * @return
     */
    ResponseResult load(ArticleHomeDto dto, Short type);
}

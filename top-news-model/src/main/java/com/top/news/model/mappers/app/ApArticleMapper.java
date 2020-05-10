package com.top.news.model.mappers.app;

import com.top.news.model.article.dtos.ArticleHomeDto;
import com.top.news.model.article.pojos.ApArticle;
import com.top.news.model.user.pojos.ApUserArticleList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Lenovo
 */
public interface ApArticleMapper {
    /**
     * 根据文章的首页的dto参数和上拉和下拉进行查询
     *
     * @param dto  首页查询参数
     * @param type 上拉和下拉的参数
     * @return List<ApArticle>
     */
    List<ApArticle> loadArticleListByLocation(@Param("dto") ArticleHomeDto dto, @Param("type") Short type);

    /**
     * 根据文章列表进行查询
     *
     * @return List<ApArticle>
     */
    List<ApArticle> loadArticleListByIdList(List<ApUserArticleList> list);
}

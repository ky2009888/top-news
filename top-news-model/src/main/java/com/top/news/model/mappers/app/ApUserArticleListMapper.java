package com.top.news.model.mappers.app;


import com.top.news.model.article.dtos.ArticleHomeDto;
import com.top.news.model.user.pojos.ApUser;
import com.top.news.model.user.pojos.ApUserArticleList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApUserArticleListMapper {
    List<ApUserArticleList> loadArticleIdListByUser(@Param("user") ApUser user, @Param("dto") ArticleHomeDto dto, @Param("type") Short type);
}

package com.top.news.article.controller.v1;


import com.top.news.article.apis.ArticleHomeControllerApi;
import com.top.news.article.service.AppArticleService;
import com.top.news.common.article.constans.ArticleConstans;
import com.top.news.model.article.dtos.ArticleHomeDto;
import com.top.news.model.common.dtos.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Lenovo
 */
@RestController
@RequestMapping("/api/v1/article")
public class ArticleHomeController implements ArticleHomeControllerApi {
    /**
     * 定义文章项目服务的句柄.
     */
    @Resource
    private AppArticleService appArticleService;

    @Override
    @GetMapping("/load")
    public ResponseResult load(ArticleHomeDto dto) {
        return appArticleService.load(dto, ArticleConstans.LOADTYPE_LOAD_MORE);
    }

    @Override
    @GetMapping("/loadmore")
    public ResponseResult loadMore(ArticleHomeDto dto) {
        return appArticleService.load(dto, ArticleConstans.LOADTYPE_LOAD_MORE);
    }

    @Override
    @GetMapping("/loadnew")
    public ResponseResult loadNew(ArticleHomeDto dto) {
        return appArticleService.load(dto, ArticleConstans.LOADTYPE_LOAD_NEW);
    }
}

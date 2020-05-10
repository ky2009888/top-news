package com.top.news.article;

import com.top.news.article.service.AppArticleService;
import com.top.news.common.article.constans.ArticleConstans;
import com.top.news.model.common.dtos.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * 功能描述:
 * 项目名称:top-news
 * 创建日期:2020/5/10
 */
@SpringBootTest(classes = ArticleJarApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
public class ArticleTest {
    /**
     * 定义文章首页查询服务句柄.
     */
    @Resource
    private AppArticleService appArticleService;

    /**
     * 文章查询测试
     */
    @Test
    public void testArticle() {
        ResponseResult load = appArticleService.load(null, ArticleConstans.LOADTYPE_LOAD_MORE);
        log.info("{}", load.getData());
    }
}

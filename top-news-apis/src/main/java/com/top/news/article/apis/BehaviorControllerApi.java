package com.top.news.article.apis;


import com.top.news.model.behavior.dtos.ShowBehaviorDto;
import com.top.news.model.common.dtos.ResponseResult;

/**
 * @author Lenovo
 */
public interface BehaviorControllerApi {

    /**
     * 保存用户点击文章的行为
     * @param dto
     * @return
     */
    ResponseResult saveShowBehavior(ShowBehaviorDto dto);
}

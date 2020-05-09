package com.top.news.behavior.service;


import com.top.news.model.behavior.dtos.ShowBehaviorDto;
import com.top.news.model.common.dtos.ResponseResult;

/**
 * @author Lenovo
 */
public interface AppShowBehaviorService {
    ResponseResult saveShowBehavior(ShowBehaviorDto dto);
}

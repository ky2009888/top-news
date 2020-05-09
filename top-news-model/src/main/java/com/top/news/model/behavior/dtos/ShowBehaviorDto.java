package com.top.news.model.behavior.dtos;


import com.top.news.model.annotation.IdEncrypt;
import com.top.news.model.article.pojos.ApArticle;
import lombok.Data;

import java.util.List;

@Data
public class ShowBehaviorDto {

    // 设备ID
    @IdEncrypt
    Integer equipmentId;
    List<ApArticle> articleIds;

}

package com.top.news.model.behavior.dtos;

import com.top.news.model.annotation.IdEncrypt;
import lombok.Data;

@Data
public class ForwardBehaviorDto {
    // 设备ID
    @IdEncrypt
    Integer equipmentId;
    // 文章ID
    @IdEncrypt
    Integer articleId;
    @IdEncrypt
    Integer dynamicId;
}

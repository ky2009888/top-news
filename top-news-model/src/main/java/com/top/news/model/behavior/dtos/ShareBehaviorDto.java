package com.top.news.model.behavior.dtos;

import com.top.news.model.annotation.IdEncrypt;
import lombok.Data;

@Data
public class ShareBehaviorDto {
    // 设备ID
    @IdEncrypt
    Integer equipmentId;
    // 文章ID
    @IdEncrypt
    Integer articleId;

    /**
     * 分享渠道
     * 0 微信
     * 1 微信朋友圈
     * 2 QQ
     * 3 QQ 空间
     * 4 微博
     */
    Short type;

}

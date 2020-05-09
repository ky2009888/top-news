package com.top.news.model.media.dtos;

import com.top.news.model.annotation.IdEncrypt;
import lombok.Data;

@Data
public class CommentReplytDto {

    @IdEncrypt
    private Integer commentId;
    private String content;

}

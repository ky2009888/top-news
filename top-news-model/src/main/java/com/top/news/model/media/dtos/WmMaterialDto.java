package com.top.news.model.media.dtos;

import com.top.news.model.annotation.IdEncrypt;
import lombok.Data;

@Data
public class WmMaterialDto {

    @IdEncrypt
    private Integer id;

//    private String url;
}

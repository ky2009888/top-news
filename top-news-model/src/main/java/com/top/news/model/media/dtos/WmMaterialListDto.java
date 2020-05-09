package com.top.news.model.media.dtos;

import com.top.news.model.common.dtos.PageRequestDto;
import lombok.Data;

@Data
public class WmMaterialListDto extends PageRequestDto {
    Short isCollected; //1 查询收藏的
}

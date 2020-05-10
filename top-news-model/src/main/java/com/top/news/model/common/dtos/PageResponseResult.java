package com.top.news.model.common.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Lenovo
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PageResponseResult extends ResponseResult {
    private Integer currentPage;
    private Integer size;
    private Integer total;

    public PageResponseResult(Integer currentPage, Integer size, Integer total) {
        this.currentPage = currentPage;
        this.size = size;
        this.total = total;
    }
}

package com.liangzhicheng.modules.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品信息类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {

    /**
     * 商品类型：1李宁，2安踏，3鸿星尔克
     */
    private String goodsType;

}

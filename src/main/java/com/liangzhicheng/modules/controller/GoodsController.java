package com.liangzhicheng.modules.controller;

import com.liangzhicheng.modules.entity.Goods;
import com.liangzhicheng.modules.response.Result;
import com.liangzhicheng.modules.service.IGoods;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class GoodsController {

    @Resource
    private ApplicationContext applicationContext;

    @GetMapping(value = "/get/{goodsType}")
    public Result get(@PathVariable("goodsType") String goodsType){
        Goods goods = new Goods(goodsType);
        //根据商品类型获取对应的策略bean
        IGoods goodsObject = applicationContext.getBean(goods.getGoodsType(), IGoods.class);
        return goodsObject.get(goods);
    }

}

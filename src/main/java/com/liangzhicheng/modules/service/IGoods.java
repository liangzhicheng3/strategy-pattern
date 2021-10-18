package com.liangzhicheng.modules.service;

import com.liangzhicheng.modules.entity.Goods;
import com.liangzhicheng.modules.response.Result;

/**
 * 策略接口
 */
public interface IGoods {

    Result get(Goods goods);

}

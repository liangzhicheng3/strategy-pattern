package com.liangzhicheng.modules.service.impl;

import com.liangzhicheng.modules.entity.Goods;
import com.liangzhicheng.modules.response.Result;
import com.liangzhicheng.modules.service.IGoods;
import org.springframework.stereotype.Service;

/**
 * 策略接口实现类
 */
@Service("Anta")
public class AntaImpl implements IGoods {

    @Override
    public Result get(Goods goods) {
        return new Result("安踏");
    }

}

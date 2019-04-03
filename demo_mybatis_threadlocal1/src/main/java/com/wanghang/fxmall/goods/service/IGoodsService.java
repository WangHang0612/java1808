package com.wanghang.fxmall.goods.service;

import com.wanghang.fxmall.goods.bean.WxbGood;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface IGoodsService {
    List<WxbGood> queryGoodsByPage(Integer page);
    void inGoods(WxbGood wxbGood);
}

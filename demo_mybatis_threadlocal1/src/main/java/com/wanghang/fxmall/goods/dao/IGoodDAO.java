package com.wanghang.fxmall.goods.dao;

import com.wanghang.fxmall.goods.bean.WxbGood;


import java.util.List;

public interface IGoodDAO {
    List<WxbGood> queryGoodsByPage(Integer page);
    void inGoods(WxbGood wxbGood);
}

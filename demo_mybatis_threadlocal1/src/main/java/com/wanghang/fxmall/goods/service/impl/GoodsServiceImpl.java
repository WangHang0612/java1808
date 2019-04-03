package com.wanghang.fxmall.goods.service.impl;

import com.wanghang.fxmall.commons.info.SystemConstantsUtils;
import com.wanghang.fxmall.goods.bean.WxbGood;
import com.wanghang.fxmall.goods.dao.IGoodDAO;
import com.wanghang.fxmall.goods.dao.impl.GoodsDAOImpl;
import com.wanghang.fxmall.goods.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private IGoodDAO goodDAO = new GoodsDAOImpl();

    @Override
    public List<WxbGood> queryGoodsByPage(Integer page) {
        if(page < 1){
            throw new IndexOutOfBoundsException("页码不能小于1");
        }
        int index = (page-1)* SystemConstantsUtils.Page.PAGE_SIZE;
        List<WxbGood> wxbGoods = goodDAO.queryGoodsByPage(index);
        return wxbGoods;
    }

    @Override
    public void inGoods(WxbGood wxbGood){

        goodDAO.inGoods(wxbGood);
    }
}

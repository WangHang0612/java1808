package com.wanghang.fxmall.goods.dao.impl;

import com.wanghang.fxmall.commons.info.SystemConstantsUtils;
import com.wanghang.fxmall.commons.mybatis.MybatisSessionFactoryUtils;
import com.wanghang.fxmall.goods.bean.WxbGood;
import com.wanghang.fxmall.goods.dao.IGoodDAO;
import com.wanghang.fxmall.goods.mapper.GoodsMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * mybatis的商品数据访问层
 * 注意 异常在dao层不要捕获
 */
@Component
public class GoodsDAOImpl implements IGoodDAO {
    @Autowired
    private SqlSession session;

    @Override
    public List<WxbGood> queryGoodsByPage(Integer page) {
        GoodsMapper goodsMapper = session.getMapper(GoodsMapper.class);
        List<WxbGood> wxbGoods = goodsMapper.queryGoodsByPage(page, SystemConstantsUtils.Page.PAGE_SIZE);
        return wxbGoods;
    }

    @Override
    public void inGoods(WxbGood wxbGood) {
        GoodsMapper goodsMapper = session.getMapper(GoodsMapper.class);
        goodsMapper.inGoods(wxbGood);
        session.commit();
    }
}

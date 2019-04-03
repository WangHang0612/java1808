package com.wanghang;

import com.wanghang.fxmall.goods.bean.WxbGood;
import com.wanghang.fxmall.goods.dao.IGoodDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {
    @Autowired
    private IGoodDAO goodDAO;
    @Test
    public void testCase(){
        List<WxbGood> goodList = goodDAO.queryGoodsByPage(1);
        for(WxbGood wxbGood:goodList){
            System.out.println(wxbGood.getGoodName());
        }

    }
}

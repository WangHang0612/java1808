package com.wanghang.fxmall.commons.mybatis;

import com.wanghang.fxmall.goods.service.IGoodsService;
import com.wanghang.fxmall.goods.service.impl.GoodsServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtils {
  public static IGoodsService iGoodsService(){
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      GoodsServiceImpl bean = context.getBean(GoodsServiceImpl.class);
      return bean;
  }
}

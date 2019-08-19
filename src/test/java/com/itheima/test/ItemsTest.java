package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao dao = applicationContext.getBean(ItemsDao.class);
        Items items = dao.findById(1);
        System.out.println(items.getName());
    }
    @Test
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService service = applicationContext.getBean(ItemsService.class);
        Items items = service.findById(1);
        System.out.println("service:"+items.getName());
    }
}

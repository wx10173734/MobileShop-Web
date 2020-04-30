package com.huatec.edu.mobileshop.test;

import com.huatec.edu.mobileshop.dao.GoodsDao;
import com.huatec.edu.mobileshop.entity.Goods;
import com.huatec.edu.mobileshop.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestGoods {
    SqlSession session = MybatisUtil.getSqlSession();
    GoodsDao goodsDao = session.getMapper(GoodsDao.class);

    //insert
    @Test
    public void testInsert(){
        Goods goods = new Goods(null,"123","123","123","123",1.1,
                1.1,1.1,1, 1, 1,1.1,"123","123",
                null, null, 1, 1,"123","123","123","123");
        goodsDao.saveGoods(goods);
        session.commit();
        session.close();

    }

    //select
    @Test
    public void testSelect(){
        List<Goods> list = goodsDao.findAllGoods();
        for (Goods goods :list){
            System.out.println(goods);
        }
        session.close();
    }

    //update
    @Test
    public void testUpdate(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("name","啊哈哈哈哈");
        map.put("goods_id","1");
        goodsDao.updateNameById(map);
        session.commit();
        session.close();
    }

    //delete
    @Test
    public void testDelete(){
        goodsDao.deleteById(1);
        session.commit();
        session.close();
    }
}

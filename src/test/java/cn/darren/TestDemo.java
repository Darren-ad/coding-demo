package cn.darren;

import cn.darren.pojo.Comment;
import cn.darren.pojo.Goods;
import cn.darren.pojo.User;
import cn.darren.service.CommentService;
import cn.darren.service.GoodsService;
import cn.darren.service.UserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author: gad
 * @Date: 2022/4/2910:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {
    
    @Autowired
    private GoodsService goodsService;
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private CommentService commentService;
    
    /*
    @Test
    public void testGoods(){
        
        //Java Bean 转 JSON字符串
       Goods goods = goodsService.queryGoodsById(1);
        String s = JSON.toJSONString(goods);
        System.out.println(s);
        
        //JSON字符串 转 JSON对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat ymd = new SimpleDateFormat("yyyy/MM/dd");
        JSONObject jsonObject = JSON.parseObject(s);
        //获取日期类型value
        String endTime = sdf.format(jsonObject.getDate("endTime"));
        String beginTime = ymd.format(jsonObject.getDate("beginTime"));
        System.out.println(beginTime);
        System.out.println(endTime);
        //获取Integer类型value
        Integer id = jsonObject.getInteger("id");
        System.out.println(id);
        BigDecimal price = jsonObject.getBigDecimal("price");
        System.out.println(price);
        
        
        //总结：
        //JavaBean转JSON字符串：JSON.toJSONString(Obj);
        
        /*
        
        {
          "balance": 10000,
          "beginTime": 1649260800000,
          "content": "iphone 12 pro 在2021年秋季发布会发布的新品手机",
          "endTime": 1667318399000,
          "id": 1,
          "imgUrl": "https://unsplash.com/photos/QKuAz8zJRng",
          "price": 5680,
          "title": "iphone 12  pro"
        }
        
         
    }*/


    @Test
    public void testUser(){
        List<User> users = userService.queryAll();
        String s = JSON.toJSONString(users);
        System.out.println(s);
        /*
        
        [
          {
            "address": "浙江省杭州市上城区",
            "age": "44",
            "gender": "男",
            "id": 1,
            "lastLoginTime": 1651137240000,
            "nickname": "张三",
            "registerTime": 1651136400000,
            "telephone": "19999999988"
          },
          {
            "address": "浙江省杭州市上城区",
            "age": "33",
            "gender": "男",
            "id": 2,
            "lastLoginTime": 1651137240000,
            "nickname": "李四",
            "registerTime": 1651136400000,
            "telephone": "19999999988"
          },
          {
            "address": "浙江省杭州市上城区",
            "age": "18",
            "gender": "女",
            "id": 3,
            "lastLoginTime": 1651137240000,
            "nickname": "秀芹",
            "registerTime": 1651136400000,
            "telephone": "19999999988"
          }
        ]
        
        
         */
    }
    
    @Test
    public void testComment(){
        List<Comment> comments = commentService.queryCommentsBySid(1);
        String s = JSON.toJSONString(comments);
        System.out.println(s);
        
        /*
        
        [
          {
            "commentTime": 1651137382000,
            "content": "牛逼",
            "id": 1,
            "sid": 1,
            "uid": 1
          },
          {
            "commentTime": 1651137398000,
            "content": "666",
            "id": 2,
            "sid": 1,
            "uid": 2
          },
          {
            "commentTime": 1651137417000,
            "content": "好棒啊",
            "id": 3,
            "sid": 1,
            "uid": 3
          }
        ]
        
         */
    }
}

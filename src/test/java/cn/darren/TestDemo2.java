package cn.darren;

import cn.darren.common.CommonResult;
import cn.darren.common.GeneralBean;
import cn.darren.service.GoodsService;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Description
 * @Author: gad
 * @Date: 2022/4/2915:09
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo2 {
    
    @Resource
    private GoodsService goodsService;
    
    @Test
    public void test1(){
        CommonResult<GeneralBean> result = goodsService.queryGoodsById(1);
        String s = JSON.toJSONString(result);
        System.out.println(s);
    }
    
}

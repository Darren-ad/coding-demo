package cn.darren.controller;

import cn.darren.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author: gad
 * @Date: 2022/4/2914:57
 */

@RestController
@RequestMapping("/goods")
@Slf4j
public class GoodsController {
    
    @Resource
    private GoodsService goodsService;
    
    @RequestMapping("/query/{id}")
    public Object queryGoodsById(@PathVariable int id){
        return goodsService.queryGoodsById(id);
    }
}

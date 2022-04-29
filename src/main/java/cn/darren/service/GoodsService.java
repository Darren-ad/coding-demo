package cn.darren.service;

import cn.darren.common.CommonResult;
import cn.darren.common.GeneralBean;
import cn.darren.pojo.Goods;

import java.util.List;


public interface GoodsService {

    /**
     * 通过商品id查询商品
     * @param id
     * @return
     */
    public CommonResult<GeneralBean> queryGoodsById(int id);


    /**
     * 查询所有商品
     * @return
     */
    public List<Goods> queryAll();
    
}

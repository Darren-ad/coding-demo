package cn.darren.mapper;

import cn.darren.pojo.Goods;

import java.util.List;

public interface GoodsMapper {

    /**
     * 查询所有商品
     * @return
     */
    public List<Goods> queryAll();

    /**
     * 通过id查询商品
     * @param id
     * @return
     */
    public Goods queryById(int id);
    
}

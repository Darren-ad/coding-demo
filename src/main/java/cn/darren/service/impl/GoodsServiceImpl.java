package cn.darren.service.impl;

import cn.darren.common.CommentLinkUser;
import cn.darren.common.CommonResult;
import cn.darren.common.GeneralBean;
import cn.darren.mapper.CommentMapper;
import cn.darren.mapper.GoodsMapper;
import cn.darren.mapper.UserMapper;
import cn.darren.pojo.Comment;
import cn.darren.pojo.Goods;
import cn.darren.pojo.User;
import cn.darren.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author: gad
 * @Date: 2022/4/29 10:17
 */
@Service
@Slf4j
public class GoodsServiceImpl implements GoodsService{
    
    
    @Resource
    private GoodsMapper goodsMapper;
    
    @Resource
    private CommentMapper commentMapper;
    
    @Resource
    private UserMapper userMapper;


    /**
     * 通过商品id查询商品
     *
     * @param id
     * @return
     */
    @Override
    public CommonResult<GeneralBean> queryGoodsById(int id) {
        
        CommonResult<GeneralBean> result = new CommonResult<>();
        result.setResult("0");
        result.setMsg("success");

        GeneralBean generalBean = new GeneralBean();
        List<CommentLinkUser> commentList = new ArrayList<>();
        Goods goods = goodsMapper.queryById(id);
        BeanUtils.copyProperties(goods, generalBean);
        Integer goodsId = goods.getId();
        List<Comment> comments = commentMapper.queryCommentsBySid(goodsId);
        for (Comment comment : comments){
            CommentLinkUser commentLinkUser = new CommentLinkUser();
            Integer uid = comment.getUid();
            User user = userMapper.queryById(uid);
            commentLinkUser.setId(String.valueOf(uid));
            commentLinkUser.setCommentTime(comment.getCommentTime());
            commentLinkUser.setContent(comment.getContent());
            commentLinkUser.setNickname(user.getNickname());
            commentLinkUser.setTelephone(user.getTelephone());
            commentList.add(commentLinkUser);
        }
        generalBean.setComments(commentList);
        result.setData(generalBean);
        return result;
    }

    /**
     * 查询所有商品
     *
     * @return
     */
    @Override
    public List<Goods> queryAll() {
        return goodsMapper.queryAll();
    }
}

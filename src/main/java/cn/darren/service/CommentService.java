package cn.darren.service;

import cn.darren.pojo.Comment;

import java.util.List;

public interface CommentService {

    /**
     * 通过商品id查询评论列表
     * @param sid
     * @return
     */
    public List<Comment> queryCommentsBySid(int sid);
    
    
}

package cn.darren.service.impl;

import cn.darren.mapper.CommentMapper;
import cn.darren.pojo.Comment;
import cn.darren.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author: gad
 * @Date: 2022/4/2910:27
 */
@Service
@Slf4j
public class CommentServiceImpl implements CommentService {
    
    @Resource
    private CommentMapper commentMapper;
    
    /**
     * 通过商品id查询评论列表
     *
     * @param sid
     * @return
     */
    @Override
    public List<Comment> queryCommentsBySid(int sid) {
        return commentMapper.queryCommentsBySid(sid);
    }
}

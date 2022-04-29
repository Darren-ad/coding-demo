package cn.darren.common;

import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @Author: gad
 * @Date: 2022/4/2914:53
 */
@Data
public class CommentLinkUser {
    
    private String id;
    
    private String nickname;
    
    private String telephone;
    
    private String content;//评论内容
    
    private Date commentTime;//评论时间
}

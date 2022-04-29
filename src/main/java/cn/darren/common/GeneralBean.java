package cn.darren.common;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description
 * @Author: gad
 * @Date: 2022/4/2914:49
 */
@Data
public class GeneralBean {
    
    private Integer id;
    
    private String title;
    
    private String imgUrl;
    
    private BigDecimal price;
    
    private Integer balance;
    
    private String content;
    
    private List<CommentLinkUser> comments;
}

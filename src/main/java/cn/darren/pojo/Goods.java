package cn.darren.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description
 * @Author: gad
 * @Date: 2022/4/2817:20
 */

@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements Serializable {
    
    private Integer id;
    
    private String title;
    
    private String imgUrl;
    
    private BigDecimal price;
    
    private Integer balance;
    
    private String content;
    
    private Date beginTime;
    
    private Date endTime;
    
}

package cn.darren.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @Author: gad
 * @Date: 2022/4/2817:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Comment implements Serializable {
    
    private Integer id;
    
    private Integer sid;
    
    private Integer uid;
    
    private String content;
    
    private Date commentTime;
}

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
 * @Date: 2022/4/2817:23
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class User implements Serializable {
    
    private Integer id;
    
    private String nickname;
    
    private String gender;
    
    private String age;
    
    private String telephone;
    
    private String address;
    
    private Date registerTime;
    
    private Date lastLoginTime;
    
    
}

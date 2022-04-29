package cn.darren.common;

import lombok.Data;

/**
 * @Description
 * @Author: gad
 * @Date: 2022/4/2914:47
 */

@Data
public class  CommonResult<T> {
    
    private String result;
    
    private String msg;
    
    private T data;
    
}

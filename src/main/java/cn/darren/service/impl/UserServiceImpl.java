package cn.darren.service.impl;

import cn.darren.mapper.UserMapper;
import cn.darren.pojo.User;
import cn.darren.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author: gad
 * @Date: 2022/4/2910:26
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    
    @Resource
    private UserMapper userMapper;
    
    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }

    /**
     * 通过id查询用户
     *
     * @param id
     * @return
     */
    @Override
    public User queryById(int id) {
        return userMapper.queryById(id);
    }
}

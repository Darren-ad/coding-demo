package cn.darren.service;

import cn.darren.pojo.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    public List<User> queryAll();

    /**
     * 通过id查询用户
     * @param id
     * @return
     */
    public User queryById(int id);
    
}

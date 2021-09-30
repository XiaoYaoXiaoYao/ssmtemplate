package cn.xiaoyao.ssm.service;

import cn.xiaoyao.ssm.dao.UserMapper;
import cn.xiaoyao.ssm.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    public User toHello(int id) {
        User user = userMapper.getUser(id);
        return  user;

    }
}

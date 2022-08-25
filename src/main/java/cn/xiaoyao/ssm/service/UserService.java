package cn.xiaoyao.ssm.service;

import cn.xiaoyao.ssm.dao.UserMapper;
import cn.xiaoyao.ssm.pojo.User;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    public User toHello(int id) {
        User user = userMapper.getUser(id);
        return  user;

    }

    @Scheduled(cron = "0/5 * * * * ? ")
    public void quartz(){
        System.out.println("定时任务开起"+new Date());
    }

    public int updateUserById(Integer id) {
        return userMapper.updateUserById(id);
    }
}

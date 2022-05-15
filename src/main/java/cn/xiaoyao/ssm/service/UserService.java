package cn.xiaoyao.ssm.service;

import cn.xiaoyao.ssm.dao.UserMapper;
import cn.xiaoyao.ssm.pojo.User;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
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

    public List<User> selectUserList(User user) {
        return userMapper.selectUserList(user);
    }

    public void importUser(MultipartFile file) throws Exception {
        EasyExcel.read(file.getInputStream(), User.class, new PageReadListener<User>(dataList -> {
            for (User user : dataList) {
                Integer result = userMapper.insertUser(user);
                log.info("读取到一条数据{}", JSON.toJSONString(user));

            }
        })).sheet().doRead();
    }
}

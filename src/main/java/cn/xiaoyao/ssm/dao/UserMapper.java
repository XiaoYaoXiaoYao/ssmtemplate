package cn.xiaoyao.ssm.dao;


import cn.xiaoyao.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User  getUser(@Param("userId") Integer id);

    List<User> selectUserList(User user);

    Integer insertUser(User user);
}

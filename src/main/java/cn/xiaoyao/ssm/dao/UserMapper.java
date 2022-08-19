package cn.xiaoyao.ssm.dao;


import cn.xiaoyao.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User  getUser(@Param("userId") Integer id);

    int updateUserById(Integer id);
}

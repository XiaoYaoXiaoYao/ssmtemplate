package cn.xiaoyao.ssm.pojo;

import lombok.Data;

import java.util.Date;


@Data
public class User {

    private Integer userId;
    private String userName;
    private Date birthday;
    private String  sex;
    private String  address;

}

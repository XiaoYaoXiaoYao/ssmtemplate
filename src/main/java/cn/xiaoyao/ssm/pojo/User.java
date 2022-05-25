package cn.xiaoyao.ssm.pojo;

import cn.xiaoyao.ssm.utils.easyexcel.converter.CustomStringStringConverter;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

import java.util.Date;


@Data
public class User implements InitializingBean , BeanNameAware {

    @ExcelIgnore
    private Integer userId;

    @ExcelProperty("用户名")
    private String userName;

    @ExcelProperty("出生日期")
    private Date birthday;

    @ExcelProperty(value = "性别",converter = CustomStringStringConverter.class)
    private Integer sex;

    @ExcelProperty("地址")
    private String address;


    public  void  initUser() {
        System.out.println("进行user的初始化方法 init-method");
    }


    public  void  destoryUser() {
        System.out.println("进行user的销毁方法");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化方法:afterPropertiesSet");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("填充完属性之后,调用的Aware接口方法");

    }
}

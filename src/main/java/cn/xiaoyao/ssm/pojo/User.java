package cn.xiaoyao.ssm.pojo;

import cn.xiaoyao.ssm.utils.easyexcel.converter.CustomStringStringConverter;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;


@Data
public class User {

    @ExcelIgnore
    private Integer userId;

    @ExcelProperty("用户名")
    private String userName;

    @ExcelProperty("出生日期")
    private Date birthday;

    @ExcelProperty(value = "性别",converter = CustomStringStringConverter.class)
    private String sex;

    @ExcelProperty("地址")
    private String address;

}

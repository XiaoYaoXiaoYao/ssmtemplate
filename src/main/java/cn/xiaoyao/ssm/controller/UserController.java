package cn.xiaoyao.ssm.controller;

import cn.xiaoyao.ssm.pojo.User;
import cn.xiaoyao.ssm.service.UserService;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author xiaoyao
 */
@Controller
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String toHello(@RequestParam Integer id, Model model) {
        User user=userService.toHello(id);
        model.addAttribute(user);
        return  "hello";
    }

    @RequestMapping("/export")
    public void toHello(HttpServletResponse response) throws Exception {

        User user = new User();

        List<User> userList = userService.selectUserList(user);
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        String fileName = URLEncoder.encode("测试", "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), User.class).sheet("模板").doWrite(userList);
    }

    @RequestMapping("/importUser")
    @ResponseBody
    public String importUser(@RequestParam("file") MultipartFile file) throws Exception {
        userService.importUser(file);
        return "success";

    }





}

package cn.xiaoyao.ssm.controller;

import cn.xiaoyao.ssm.pojo.User;
import cn.xiaoyao.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String toHello(@RequestParam Integer id, Model model) {
        User user=userService.toHello(id);
        model.addAttribute(user);
        return  "hello";
    }



    @RequestMapping("/testUpdate/{id}")
    @ResponseBody
    public String testUpdate(@PathVariable Integer id) {
       int  count=userService.updateUserById(id);
        return  count+"";
    }




}

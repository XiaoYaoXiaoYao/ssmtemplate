package cn.xiaoyao.ssm.controller;

import cn.xiaoyao.ssm.dao.TOrderMapper;
import cn.xiaoyao.ssm.pojo.TOrder;
import cn.xiaoyao.ssm.pojo.User;
import cn.xiaoyao.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private TOrderMapper tOrderMapper;

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


    @RequestMapping("/testdb")
    @ResponseBody
    public String testdb() {


        long l = System.currentTimeMillis();
        List<TOrder> tOrderList = tOrderMapper.selectAllList();
        System.out.println(tOrderList.size());
        System.out.println((System.currentTimeMillis()-l)/1000);
        return "ok";
    }




}

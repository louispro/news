package com.louis.news.controller;

import com.louis.news.mapper.RoleMapper;
import com.louis.news.pojo.Role;
import com.louis.news.pojo.User;
import com.louis.news.service.RoleService;
import com.louis.news.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 赖小燚
 * www.louis.com
 */
@Controller
public class UserController {

    @Autowired
    private RoleService roleService;
    @Autowired
    private UserService userService;

    //查询所有状态的用户的集合
    public String findUserList(String keywords, Integer userListRoleId, Model model){
        //获取角色列表
        List<Role> roleList = roleService.findRoleList();
        model.addAttribute("roleList",roleList);
        //获取用户列表
        List<User> userList = userService.findUserList(keywords,userListRoleId);
        model.addAttribute("userList",userList);
        model.addAttribute("keywords",keywords);
        model.addAttribute("userListRoleId",userListRoleId);
        return "user/user_list";
    }

    //用户登录
    @PostMapping("login")
    public String login(@RequestParam("loginName") String loginName, @RequestParam("password") String password, Model model, HttpSession session, HttpServletRequest request){
        User user = userService.findUser(loginName,password);
        if(user == null){
            model.addAttribute("msg","用户名或密码错误，请重新登录");
            return "redirect:http://localhost:8080/login.jsp";
        }else{
            //用户存在，但用户未启用或被禁用
            if(!user.getStatus().equals("2")){
                model.addAttribute("msg","账号未启用或被禁用，请联系管理员");
                return "redirect:http://localhost:8080/login.jsp";
            }
        }
        session.setAttribute("login_user",user);
        return "main";
    }


}

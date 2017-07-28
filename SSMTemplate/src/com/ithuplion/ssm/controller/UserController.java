package com.ithuplion.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ithuplion.ssm.pojo.User;
import com.ithuplion.ssm.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	/**
	 * 用户查询操作
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryUser")
	public String queryUser(Model model) throws Exception{
		List<User> userList = userService.findUserById();
		model.addAttribute("user", userList);
		return "userTest";
	}
	/**
	 * 用户登录
	 * @param loginname
	 * @param password
	 * @return
	 */
	@RequestMapping("/userLogin")
	public String userLogin(@RequestParam("loginname") String loginname,
							@RequestParam("password") String password){
		
		return "userLogin";
	}
}

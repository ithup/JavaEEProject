package com.ithuplion.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ithuplion.pojo.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/list")
	public String list(Model model){
		User user1=new User();
		user1.setId(1);
		user1.setUsername("tom111");
		user1.setSex("man");
		user1.setBirthday(new Date());
		user1.setAddress("beijing");
		User user2=new User();
		user2.setId(2);
		user2.setUsername("tom222");
		user2.setSex("man");
		user2.setBirthday(new Date());
		user2.setAddress("beijing");
		User user3=new User();
		user3.setId(3);
		user3.setUsername("tom333");
		user3.setSex("man");
		user3.setBirthday(new Date());
		user3.setAddress("beijing");
		List<User> lists=new ArrayList<User>();
		lists.add(user1);
		lists.add(user2);
		lists.add(user3);
		model.addAttribute("user", lists);
		return "list";
	}
	@RequestMapping("/updateById/{id}")
	public String updateById(@PathVariable Integer id,Model model){
		User user=new User();
		user.setId(id);
		user.setUsername("ÖÜÈý");
		user.setSex("ÄÐ");
		user.setBirthday(new Date());
		user.setAddress("¹óÑô");
		model.addAttribute("user", user);
		return "editUser";
		
	}
}

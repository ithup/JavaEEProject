package com.ithuplion.ssm.mapper;

import java.util.List;

import com.ithuplion.ssm.pojo.User;

public interface UserMapper {
   public List<User> findUserById()throws Exception;
}
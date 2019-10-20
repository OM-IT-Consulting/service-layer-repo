package com.om.springboot.mappers.user;


import com.om.springboot.model.user.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void insertUser(User user);
    User findUserById(Long id);
    User findByUsernameOrEmail(String userNameOrEmail);
}

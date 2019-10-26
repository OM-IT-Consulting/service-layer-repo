package com.om.springboot.service.user;

import com.om.springboot.dto.model.user.UserDto;
import com.om.springboot.mappers.user.UserMapper;
import com.om.springboot.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    public UserDto existsByUsername(String userName){
        User user = userMapper.findByUsernameOrEmail(userName);
        return com.om.springboot.dto.mapper.user.UserMapper.toUserDto(user);
    }

    public UserDto existsByEmail(String emailId){
        User user = userMapper.findByUsernameOrEmail(emailId);
        return com.om.springboot.dto.mapper.user.UserMapper.toUserDto(user);
    }
}

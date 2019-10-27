package com.om.springboot.service.user;

import com.om.springboot.dto.model.user.UserDto;
import com.om.springboot.exception.ApplicationException;
import com.om.springboot.exception.EntityType;
import com.om.springboot.exception.ExceptionType;
import com.om.springboot.mappers.user.UserMapper;
import com.om.springboot.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static com.om.springboot.exception.EntityType.USER;
import static com.om.springboot.exception.ExceptionType.ENTITY_NOT_FOUND;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Override
    public UserDto existsByUsername(String userName){
        User user = userMapper.findByUsername(userName);
        if(user != null) {
            return com.om.springboot.dto.mapper.user.UserMapper.toUserDto(user);
        }
        throw exception(USER, ENTITY_NOT_FOUND,userName);
    }

    public UserDto existsByEmail(String emailId){
        User user = userMapper.findByEmail(emailId);
        if(user != null) {
            return com.om.springboot.dto.mapper.user.UserMapper.toUserDto(user);
        }
        throw exception(USER, ENTITY_NOT_FOUND,emailId);
    }

    /**
     * Returns a new RuntimeException
     *
     * @param entityType
     * @param exceptionType
     * @param args
     * @return
     */
    private RuntimeException exception(EntityType entityType, ExceptionType exceptionType, String... args) {
        return ApplicationException.throwException(entityType, exceptionType, args);
    }
}

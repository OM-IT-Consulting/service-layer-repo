package com.om.springboot.service.user;

import com.om.springboot.dto.model.user.UserDto;

public interface UserService {

    /**
     * Check any user exists with the same user name
     *
     * @param userName
     * @return
     */
    UserDto existsByUsername(String userName);

    /**
     * Check any user exists with the same emailId
     *
     * @param emailId
     * @return
     */
    UserDto existsByEmail(String emailId);

}

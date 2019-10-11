package com.om.springboot.service;

import com.om.springboot.dto.model.test.TestUserDto;
import org.springframework.stereotype.Component;

public interface TestUserService {

    /**
     * Register a new user
     *
     * @param testDto
     * @return
     */
    TestUserDto signup(TestUserDto testDto);
}

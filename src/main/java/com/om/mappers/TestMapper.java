package com.om.mappers;

import com.om.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface TestMapper {
    void insertTest(Test test);
    Test findTestById(Integer id);
    List<Test> findAllTest();
}

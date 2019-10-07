package com.om.services;

import com.om.mappers.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

@RunWith(SpringRunner.class)
public class SpringbootMyBatisApplicationTests {

    @Autowired
    private TestMapper testMapper;

    @Test
    public void findAllTests() {
        List<com.om.domain.Test> tests = testMapper.findAllTest();
        assertNotNull(tests);
        assertTrue(!tests.isEmpty());
    }


    public void findTestById() {
        com.om.domain.Test test = testMapper.findTestById(1);
        assertNotNull(test);
    }


    public void createTest() {
        com.om.domain.Test test = new com.om.domain.Test(0, "1234", "sivaram");
        testMapper.insertTest(test);
        com.om.domain.Test  newTest = testMapper.findTestById(test.getId());
        assertEquals("sivaram", newTest.getTestname());
        assertEquals("1234", newTest.getTestid());
    }

}

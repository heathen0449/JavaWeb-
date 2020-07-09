package com.winter.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProblemOptionMapperTest  {
    @Autowired
    private ProblemOptionMapper he;
    @Test
    public void testSelectByProId() {
        String id= "09739294313671083790";
        he.selectByProId(id);

    }
}
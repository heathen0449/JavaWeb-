package com.winter.mapper;


import com.winter.model.ProblemInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProblemInfoMapperTest {
    @Autowired
    private ProblemInfoMapper ha;
    @Test
    public void testInsert() {
        ProblemInfo thing = new ProblemInfo();
        thing.setId("15702293274117456632");
        thing.setQuestionnaireId("23668494889325156782728834378358");
        thing.setProblemName("撒的");
        thing.setKindId("1");
        ha.insert(thing);
    }
}
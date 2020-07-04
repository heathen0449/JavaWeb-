package com.winter.service.impl;


import com.winter.beans.ResultResponse;
import com.winter.mapper.QuestionnaireInfoMapper;
import com.winter.model.QuestionnaireInfo;
import com.winter.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "QuestionnaireService")
public class QuestServiceImpl implements QuestionnaireService {
    @Autowired
    private QuestionnaireInfoMapper quesMapper;

    @Override
    public ResultResponse addQues(QuestionnaireInfo quest) {
        return null;
    }
}

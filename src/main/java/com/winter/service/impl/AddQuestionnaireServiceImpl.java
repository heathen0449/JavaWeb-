package com.winter.service.impl;

import com.winter.beans.ResultResponse;
import com.winter.mapper.QuestionnaireInfoMapper;
import com.winter.model.QuestionnaireInfo;
import com.winter.service.AddQuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;

public class AddQuestionnaireServiceImpl implements AddQuestionnaireService {

    @Autowired
    private QuestionnaireInfoMapper questionnaire;

    @Override
    public ResultResponse addQuestionnaire(QuestionnaireInfo question) {
        return null;
    }
}

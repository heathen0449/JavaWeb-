package com.winter.service;

import com.winter.beans.ResultResponse;
import com.winter.model.QuestionnaireInfo;
import com.winter.model.Test;

import javax.xml.transform.Result;

public interface AddQuestionnaireService {
    ResultResponse addQuestionnaire(QuestionnaireInfo question);
}

package com.winter.mapper;

import com.winter.model.QuestionnaireInfoType;

public interface QuestionnaireInfoTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(QuestionnaireInfoType record);

    int insertSelective(QuestionnaireInfoType record);

    QuestionnaireInfoType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(QuestionnaireInfoType record);

    int updateByPrimaryKey(QuestionnaireInfoType record);
}
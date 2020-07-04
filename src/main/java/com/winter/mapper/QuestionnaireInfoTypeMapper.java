package com.winter.mapper;

import com.winter.model.QuestionnaireInfoType;

public interface QuestionnaireInfoTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuestionnaireInfoType record);

    int insertSelective(QuestionnaireInfoType record);

    QuestionnaireInfoType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuestionnaireInfoType record);

    int updateByPrimaryKey(QuestionnaireInfoType record);
}
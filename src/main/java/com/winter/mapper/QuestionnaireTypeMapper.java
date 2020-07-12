package com.winter.mapper;

import com.winter.model.QuestionnaireType;

public interface QuestionnaireTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(QuestionnaireType record);

    int insertSelective(QuestionnaireType record);

    QuestionnaireType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(QuestionnaireType record);

    int updateByPrimaryKey(QuestionnaireType record);
}
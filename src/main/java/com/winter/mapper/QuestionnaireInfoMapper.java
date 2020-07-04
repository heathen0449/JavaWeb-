package com.winter.mapper;

import com.winter.model.QuestionnaireInfo;

public interface QuestionnaireInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(QuestionnaireInfo record);

    int insertSelective(QuestionnaireInfo record);

    QuestionnaireInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(QuestionnaireInfo record);

    int updateByPrimaryKeyWithBLOBs(QuestionnaireInfo record);

    int updateByPrimaryKey(QuestionnaireInfo record);
}
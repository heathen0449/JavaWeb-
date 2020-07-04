package com.winter.mapper;

import com.winter.model.QuestionnaireInfo;

public interface QuestionnaireInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuestionnaireInfo record);

    int insertSelective(QuestionnaireInfo record);

    QuestionnaireInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuestionnaireInfo record);

    int updateByPrimaryKeyWithBLOBs(QuestionnaireInfo record);

    int updateByPrimaryKey(QuestionnaireInfo record);
}
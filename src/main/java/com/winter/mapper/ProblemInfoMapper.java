package com.winter.mapper;

import com.winter.model.ProblemInfo;

public interface ProblemInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(ProblemInfo record);

    int insertSelective(ProblemInfo record);

    ProblemInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProblemInfo record);

    int updateByPrimaryKey(ProblemInfo record);
}
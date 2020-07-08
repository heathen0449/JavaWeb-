package com.winter.mapper;

import com.winter.model.ProblemInfo;
import com.winter.model.ProblemInfoKey;

public interface ProblemInfoMapper {
    int deleteByPrimaryKey(ProblemInfoKey key);

    int insert(ProblemInfo record);

    int insertSelective(ProblemInfo record);

    ProblemInfo selectByPrimaryKey(ProblemInfoKey key);

    int updateByPrimaryKeySelective(ProblemInfo record);

    int updateByPrimaryKey(ProblemInfo record);
}
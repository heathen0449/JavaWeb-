package com.winter.mapper;

import com.winter.model.ProblemInfo;
import com.winter.model.ProblemInfoKey;

import java.util.List;

public interface ProblemInfoMapper {
    int deleteByPrimaryKey(ProblemInfoKey key);

    int insert(ProblemInfo record);

    int insertSelective(ProblemInfo record);

    ProblemInfo selectByPrimaryKey(ProblemInfoKey key);

    int updateByPrimaryKeySelective(ProblemInfo record);

    int updateByPrimaryKey(ProblemInfo record);

    List <ProblemInfo> selectByQuesId(String id);
}
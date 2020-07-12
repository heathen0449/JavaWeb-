package com.winter.mapper;

import com.winter.model.ProblemType;

public interface ProblemTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(ProblemType record);

    int insertSelective(ProblemType record);

    ProblemType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProblemType record);

    int updateByPrimaryKey(ProblemType record);
}
package com.winter.mapper;

import com.winter.model.ProblemType;

public interface ProblemTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProblemType record);

    int insertSelective(ProblemType record);

    ProblemType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProblemType record);

    int updateByPrimaryKey(ProblemType record);
}
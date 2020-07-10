package com.winter.mapper;

import com.winter.model.ProblemOption;
import com.winter.model.ProblemOptionKey;

import java.util.List;

public interface ProblemOptionMapper {
    int deleteByPrimaryKey(ProblemOptionKey key);

    int insert(ProblemOption record);

    int insertSelective(ProblemOption record);

    ProblemOption selectByPrimaryKey(ProblemOptionKey key);

    int updateByPrimaryKeySelective(ProblemOption record);

    int updateByPrimaryKey(ProblemOption record);

    List<ProblemOption> selectByProId(String id);
}
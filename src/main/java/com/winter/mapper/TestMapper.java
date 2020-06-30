package com.winter.mapper;
//本接口为数据接口


import com.winter.model.Test;

/**
 * 测试数据层接口
 */
public interface TestMapper {

    /**
     *  保存测试数据
     * @param test 测试数据
     * @return
     */
    int insert(Test test);
}

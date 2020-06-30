package com.winter.model;

/**
 * 测试信息实体类
 * @作者 sun
 */

//数据实体类--映射的数据表
public class Test {

    //自增主键
    private Integer id;
    //内容
    private String context;

    public Integer getId() {
        return id;
    }

    public String getContext() {
        return context;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setContext(String context) {
        this.context = context;
    }
}

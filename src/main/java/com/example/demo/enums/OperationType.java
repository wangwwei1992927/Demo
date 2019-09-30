package com.example.demo.enums;

/**
 * description: 描述
 * @author WangWei
 * @date 2019/9/25 17:27 
 */
public enum  OperationType {

    /**
     * 操作类型
     */
    UNKNOWN("unknown"),
    DELETE("delete"),
    SELECT("select"),
    UPDATE("update"),
    INSERT("insert");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    OperationType(String s) {
        this.value = s;
    }
}

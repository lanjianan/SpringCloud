package com.springboot.cloud.common.core.enums;

/**
 * @author: dongwei
 * @date: 2020/08/15 16:03
 * @description: 资源类型枚举
 */
public enum ResourceTypeEnum {
    MENU("0", "菜单"),
    BUTTON("1","按钮");


    private String code;

    private String message;

    ResourceTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

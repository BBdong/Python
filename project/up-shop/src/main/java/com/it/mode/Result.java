package com.it.mode;

import lombok.Data;

import java.io.Serializable;

/**
 *请求响应结果
 */
@Data
public class Result implements Serializable {

    private static final long serialVersionUID = 1L;

    private static String SUCCESS_CODE = "1000000";

    private static String SUCCESS_MESSAGE = "success";

    private static String SYSTEM_ERROR_CODE = "5000001";

    private static String SYSTEM_ERROR_MESSAGE = "系统错误";

    private static String PARAM_ERROR_CODE = "5100000";

    private static String PARAM_ERROR_MESSAGE = "参数错误";

    /**
     * 结果编码
     */
    private String code;

    /**
     * 结果描述
     */
    private String message;

    /**
     * 结果内容
     */
    private Object data;

    /**
     * 请求处理成功
     * @return Result
     */
    public static Result success() {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setMessage(SUCCESS_MESSAGE);
        return result;
    }

    /**
     * 系统错误
     * @return Result
     */
    public static Result systemError() {
        Result result = new Result();
        result.setCode(SYSTEM_ERROR_CODE);
        result.setMessage(SYSTEM_ERROR_MESSAGE);
        return result;
    }

    /**
     * 参数错误
     * @return Result
     */
    public static Result paramError() {
        Result result = new Result();
        result.setCode(PARAM_ERROR_CODE);
        result.setMessage(PARAM_ERROR_MESSAGE);
        return result;
    }

    /**
     * 自定义构造器
     * @param code
     * @param message
     * @param data
     * @return
     */
    public static Result result(String code,String message,Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }
}

package com.it.UpException;

/**
 * DeviceThreatException异常类
 */
public class UpException extends  RuntimeException{

    public UpException() {
        super();
    }

    public UpException(String message) {
        super(message);
    }

    public UpException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpException(Throwable cause) {
        super(cause);
    }

    protected UpException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

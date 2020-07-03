package com.rs.exception;

/**
 * @Description TODO
 * @createTime 2020年06月25日
 */
public class SysException extends Exception {
    private String message;

    public SysException(String message) {
        this.message = message;
    }

    public SysException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SysException{" +
                "message='" + message + '\'' +
                '}';
    }
}

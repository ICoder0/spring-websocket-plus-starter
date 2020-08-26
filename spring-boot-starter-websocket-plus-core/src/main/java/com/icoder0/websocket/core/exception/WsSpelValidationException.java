package com.icoder0.websocket.core.exception;

/**
 * @author bofa1ex
 * @since 2020/8/12
 */
public class WsSpelValidationException extends WsException {

    public WsSpelValidationException() {
        super(WsBusiCode.ILLEGAL_REQUEST_ERROR);
    }

    public WsSpelValidationException(String message) {
        super(WsBusiCode.ILLEGAL_REQUEST_ERROR, message);
    }

    public WsSpelValidationException(String message, Throwable cause) {
        super(WsBusiCode.ILLEGAL_REQUEST_ERROR, message, cause);
    }
}
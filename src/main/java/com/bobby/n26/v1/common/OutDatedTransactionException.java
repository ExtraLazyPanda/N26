package com.bobby.n26.v1.common;

public class OutDatedTransactionException extends Exception {
    public OutDatedTransactionException() {
    }

    public OutDatedTransactionException(String message) {
        super(message);
    }

    public OutDatedTransactionException(String message, Throwable cause) {
        super(message, cause);
    }

    public OutDatedTransactionException(Throwable cause) {
        super(cause);
    }

    public OutDatedTransactionException(String message, Throwable cause,
        boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

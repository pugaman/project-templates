package com.template.exception;

/**
 * Created by pgolovenkov on 13.03.2017.
 */
public class TemplateException extends Exception{

    public TemplateException(String message) {
        super(message);
    }

    public TemplateException(String message, Throwable cause) {
        super(message, cause);
    }

}

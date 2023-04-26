package com.godev.rest.exceptions;

import com.godev.exceptions.Issue;
import com.godev.exceptions.IssueEnum;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Issue handlerMethodArgumentNotValidException(MethodArgumentNotValidException e){
        return new Issue(IssueEnum.ARGUMENT_NOT_VALID,
                e.getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).toList());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Issue handlerHttpMessageNotReadableException(HttpMessageNotReadableException e){
        return new Issue(IssueEnum.ARGUMENT_NOT_VALID, e.getMessage().split(":")[0]);
    }

    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    public Issue handlerHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e){
        return new Issue(IssueEnum.FORMAT_REQUEST_NOT_VALID, e.getMessage());
    }
}

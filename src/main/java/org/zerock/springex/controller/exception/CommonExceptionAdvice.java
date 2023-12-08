package org.zerock.springex.controller.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Arrays;

@Log4j2
@ControllerAdvice
public class CommonExceptionAdvice {

//    @ResponseBody // 문자열이나 JSON데이터를 그대로 전송할 때 사용되는 어노테이션
//    @ExceptionHandler(NumberFormatException.class) // 해당 타입의 예외를 파라미터로 전달 받을 수 있게하는 어노테이션
//    public String exceptNumber(NumberFormatException e){
//        log.info("----------Error Report---------------------");
//        log.info(e.getMessage());
//
//        return "NUMBER FORMAT EXCEPTION";
//    }
//
//    @ResponseBody
//    @ExceptionHandler(Exception.class)
//    public String exceptCommon(Exception e){
//        log.info("----------Error Report---------------------");
//        log.info(e.getMessage());
//
//        StringBuffer buffer = new StringBuffer("<ul>");
//
//        buffer.append("<li>" + e.getMessage() + "</li>");
//
//        Arrays.stream(e.getStackTrace()).forEach(stackTraceElement -> {
//            buffer.append("<li>" + stackTraceElement + "</li>");
//        });
//
//        buffer.append("</ul>");
//
//        return buffer.toString();
//    }
//
//
//    @ExceptionHandler(NoHandlerFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public String notFound(){
//        return "custom404";
//    }


}

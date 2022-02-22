package com.hakbu.msdirector.exception;

import com.hakbu.msdirector.DTO.ResponseDTO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.webjars.NotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<ResponseDTO> handleNotFoundException(NotFoundException e){
        final ResponseDTO response = new ResponseDTO("ERROR_100", "잘못된 정보");
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
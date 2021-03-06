package com.example.hotelmanagementservice.Controller;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import net.minidev.json.JSONObject;

@ControllerAdvice
public class RoomExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(RoomException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    JSONObject roomHandler(RoomException ex) {

        JSONObject json = new JSONObject();
        json.put("status", HttpStatus.BAD_REQUEST);
        json.put("message", ex.getMessage());
        return json;
    }
}

package com.example.web_school_app.model;

import lombok.Data;

import java.lang.reflect.Type;

@Data  //take care of impelementation of getter and setter methods
public class Holiday {
    private final String day;
    private final String reason;
    private final Type type;
    public enum Type{
        FESTIVAL,FEDERAL
    }
}

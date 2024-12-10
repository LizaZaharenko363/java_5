package com.example.lab5;

import jakarta.inject.Named;
import jakarta.enterprise.context.Dependent;

@Named(value = "valueBean")
@Dependent
public class ItemBean {

    private String value;

    public ItemBean() {
        this.value = "";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
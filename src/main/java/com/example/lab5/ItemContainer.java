package com.example.lab5;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "ItemContainer")
@ApplicationScoped
public class ItemContainer {

    private List<String> data = new ArrayList<>();

    public List<String> getData() {
        return data;
    }

    public void addItem(String item) {
        data.add(item);
    }

    public void removeItem(String item) {
        data.remove(item);
    }
}
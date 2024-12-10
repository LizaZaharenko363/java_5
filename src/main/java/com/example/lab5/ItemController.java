package com.example.lab5;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import java.util.List;

@Named(value = "itemController")
@RequestScoped
public class ItemController {

    @Inject
    private ItemContainer itemContainer;

    private String newItem="";

    public String getNewItem() {
        return newItem;
    }

    public void setNewItem(String newItem) {
        this.newItem = newItem;
    }

    @POST
    public void addItem() {
        if (newItem != null && !newItem.isEmpty()) {
            itemContainer.addItem(newItem);
            this.newItem = "";
        }

    }

    public void removeItem(String item) {
        itemContainer.removeItem(item);
    }

    @GET
    public List<String> getData() {
        return itemContainer.getData();
    }

}
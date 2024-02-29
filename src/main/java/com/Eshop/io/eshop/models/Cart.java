package com.Eshop.io.eshop.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cart extends BaseModel{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.Eshop.io.eshop.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String user_name;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

   public void setDetails(){
       Item item=new Item();
       Cart cart=new Cart();
       item.setName(cart.getName());
   }


}

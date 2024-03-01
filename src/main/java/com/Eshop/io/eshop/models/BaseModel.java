package com.Eshop.io.eshop.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class BaseModel {
    public long id;
    public Date createdOn;
    private Date modifiedOn;
    public String createdBy;
    private String modifiedBy;
}

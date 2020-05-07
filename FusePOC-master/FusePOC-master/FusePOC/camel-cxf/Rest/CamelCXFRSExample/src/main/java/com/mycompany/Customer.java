package com.mycompany;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "Customer")
@XmlType ( name = "Customer", namespace = "http://www.myserviceapi.com", 
propOrder = { "name", "id" } )
@XmlAccessorType ( XmlAccessType.FIELD )
public class Customer {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
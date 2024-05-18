package com.conygre.test.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Nick Todd on 03/04/2017.
 */
@Component
public class Person {
    @Autowired
    private Address address;


    public Person(Address p) {
        this.address = p;
    }
    public Person(){}


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}

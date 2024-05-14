package org.example;

import javax.annotation.PostConstruct;

public class A {
    B b;
    @PostConstruct
    public void init(){
        this.b = b;
    }
}

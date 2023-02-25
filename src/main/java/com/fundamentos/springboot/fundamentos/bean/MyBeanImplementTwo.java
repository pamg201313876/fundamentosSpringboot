package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanImplementTwo implements  MyBean {

    @Override
    public void print() {
        System.out.println("Hola mundo desde la implementación de myBean2");
    }
}

package com.fundamentos.springboot.fundamentos.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanWithDependencyImplement implements  MyBeanWithDependency {

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation){
        this.myOperation = myOperation;
    }


    @Override
    public void printWithDependency() {
        System.out.println("Hola deesde MyBeanWithDependencyImplement ");
        int number = 1;
        System.out.println(myOperation.sum(1));
    }
}

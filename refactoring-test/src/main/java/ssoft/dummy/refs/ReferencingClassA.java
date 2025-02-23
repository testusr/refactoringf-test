package ssoft.dummy.refs;

import ssoft.dummy.beans.MyBeanA;

public class ReferencingClassA {
    private MyBeanA myBeanA = new MyBeanA();
    public MyBeanA anotherBeanA = new MyBeanA();
    MyBeanA andAnotherBeanA = new MyBeanA();

    public static void aReference(){
        var myBeanA = new MyBeanA();
        myBeanA.aMethodWithoutParameters();
        myBeanA.setaBoolean(true);
        myBeanA.aMethodWithParameters(1, 2);
        myBeanA.setaLong(3L);
        myBeanA.setaString("hello");
        System.out.println(myBeanA.aMethodWithoutParameters());
    }

    MyBeanA doSomethingWithBeans() {
        this.myBeanA.setaString("helloOO");
        this.myBeanA.setaBoolean(true);
        return this.myBeanA;
    }


}

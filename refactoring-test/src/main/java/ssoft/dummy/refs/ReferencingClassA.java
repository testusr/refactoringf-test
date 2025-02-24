package ssoft.dummy.refs;

import ssoft.dummy.beans.MyBeanA;

public class ReferencingClassA {
    public MyBeanA anotherBeanA = new MyBeanA();
    MyBeanA andAnotherBeanA = new MyBeanA();
    private MyBeanA myBeanA = new MyBeanA();

    public static void aReference() {
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
        boolean myBoolean = this.myBeanA.isaBoolean();
        this.myBeanA.getaString();
        printThisForMe(this.myBeanA.getaLong());
        return this.myBeanA;
    }

    private void printThisForMe(long l) {
        System.out.println(l);
    }
}

// should be converted to:
//package ssoft.dummy.refs;
//
//import ssoft.dummy.beans.MyBeanA;
//
//public class ReferencingClassA {
//    public MyBeanA anotherBeanA = MyBeanA.builder().build();
//    MyBeanA andAnotherBeanA = MyBeanA.builder().build();
//    private MyBeanA myBeanA = MyBeanA.builder().build();
//
//    public static void aReference() {
//        var myBeanA = MyBeanA.builder().build();
//        myBeanA.aMethodWithoutParameters();
//
//        myBeanA = myBeanA.toBuilder().withABoolean(true).build();
//        myBeanA.aMethodWithParameters(1, 2);
//
//        myBeanA = myBeanA.toBuilder()
//                .withALong(3L)
//                .withAString("hello")
//                .build();
//        System.out.println(myBeanA.aMethodWithoutParameters());
//    }
//
//    MyBeanA doSomethingWithBeans() {
//        this.myBeanA = this.myBeanA.toBuilder()
//                .withAString("helloOO")
//                .withABoolean(true)
//                .build();
//
//        boolean myBoolean = this.myBeanA.aBoolean();
//        this.myBeanA.aString(); // Note: This line does nothing unless used
//        printThisForMe(this.myBeanA.aLong());
//
//        return this.myBeanA;
//    }
//
//    private void printThisForMe(long l) {
//        System.out.println(l);
//    }
//}
package ssoft.dummy.refs;

import ssoft.dummy.beans.MyBeanA;

public class ReferencingClassA {
  private MyBeanA myBeanA = new MyBeanA();
  public MyBeanA anotherBeanA = new MyBeanA();
  MyBeanA andAnotherBeanA = new MyBeanA();

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
    return this.myBeanA;
  }

}
/*
 * // should be comverted to record usage
 * public class ReferencingClassA {
 * private MyBeanA myBeanA = MyBeanA.builder().build();
 * public MyBeanA anotherBeanA = MyBeanA.builder().build();
 * MyBeanA andAnotherBeanA = MyBeanA.builder().build();
 * 
 * public static void aReference() {
 * var myBeanA = MyBeanA().builder().build();
 * myBeanA.aMethodWithoutParameters();
 * 
 * myBeanA = myBeanA.toBuilder().setaBoolean(true).build();
 * myBeanA.aMethodWithParameters(1, 2);
 * 
 * myBeanA = myBeanA.toBuilder().withaLong(3L)
 * .withaString("hello")
 * .build();
 * System.out.println(myBeanA.aMethodWithoutParameters());
 * }
 * 
 * MyBeanA doSomethingWithBeans() {
 * this.myBeanA = this.myBeanA.builder().withaString("helloOO")
 * .setaBoolean(true)
 * .build();
 * return this.myBeanA;
 * }
 * 
 * }
 */

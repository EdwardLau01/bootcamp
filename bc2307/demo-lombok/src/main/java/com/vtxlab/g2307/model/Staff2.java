package com.vtxlab.g2307.model;

import javax.annotation.processing.SupportedSourceVersion;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Staff2 extends Human{
  private double salary;

    // You have to manually code the constructor with Parent's attribute
    public Staff2(String name, double salary){
      super(name);
      this.salary = salary;
    }
  
    public static void main (String[] args) {
      Staff staff = new Staff("John", 3000.0);
      Staff staff2 = new Staff("Peter", 3000.0);
      System.out.println(staff.equals(staff2)); // false
      Staff staff3 = new Staff("Peter", 3000.0);
      System.out.println(staff3.equals(staff2)); // true

      Staff2 staff3 = Staff2.builder()//
      .salary(2000) //
      .name("Mary") //
      .build();


    }
  
}

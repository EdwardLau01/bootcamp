package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

// @NoArgsConstructor
@RequiredArgsConstructor // The minimal args to create Student Object
@AllArgsConstructor
public class Student {
  private int age;

  public static void main(String[] args) {
    // No final and no @NoArgsConstructor attriibute in the class
    Student student = new Student(); // come from RequiredArgsConstructor
    Student student2 = new Student(10);
  }
}

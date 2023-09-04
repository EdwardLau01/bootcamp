package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

//@AllArgsConstructor
// @RequiredArgsConstructor
// @Builder
@SuperBuilder
@ToString(callSuper = true)
public class Address {
  private String addLine1;
  private String addLine2;
  private String addLine3;
  @NonNull
  private Country country;

  public Address(Country country){
    if(country == null)
      throw new NullPointerException();
    this.country = country;
  }

  public static void main(String[] args) {
    Address a1 = new Address(Country.HK); // RequiredArgsConstructor
    // Address a3 = new Address(null); // error

    Address a2 = Address.builder()//
    .addLine1("asdf") //
    .addLine2("asd") //
    .addLine3("zxc") //
    .country(Country.US) // run-time error
    .build();

    System.out.println(a2);
  }
}

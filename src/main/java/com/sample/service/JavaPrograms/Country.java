package com.sample.service.JavaPrograms;

public enum Country {

  ALL("Great Britain & Republic of Ireland"),
  GBR("Great Britain"),
  IRL("Republic of Ireland"),
  POL("Poland"),
  HUN("Hungary"),
  CZE("Czech Republic"),
  FRA("France"),
  SVK("Slovakia"),
  CHN("China"),
  IND("India"),
  JPN("Japan"),
  THA("Thailand"),
  MYS("Malaysia"),
  KOR("South Korea"),
  TUR("Turkey"),
  ROI("ROI");

  private final String countryName;

  Country(String countryName) {
    this.countryName = countryName;
  }

  public String getCountryName() {
    return countryName;
  }

  public String getCode() {
    return this.name();
  }

}



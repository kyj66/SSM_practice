package com.itheima.ssm.domain;


import java.io.Serializable;

public class Product implements Serializable {

  private String id;
  private String productNum;
  private String productName;
  private String cityName;
  private java.sql.Timestamp departureTime;
  private double productPrice;
  private String productDesc;
  private long productStatus;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getProductNum() {
    return productNum;
  }

  public void setProductNum(String productNum) {
    this.productNum = productNum;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public java.sql.Timestamp getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(java.sql.Timestamp departureTime) {
    this.departureTime = departureTime;
  }


  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }


  public String getProductDesc() {
    return productDesc;
  }

  public void setProductDesc(String productDesc) {
    this.productDesc = productDesc;
  }


  public long getProductStatus() {
    return productStatus;
  }

  public void setProductStatus(long productStatus) {
    this.productStatus = productStatus;
  }

}

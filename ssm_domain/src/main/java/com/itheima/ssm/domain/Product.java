package com.itheima.ssm.domain;

import java.util.Date;

/**
 * 产品信息
 */
public class Product {

  private String id;
  private String productNum;
  private String productName;
  private String cityName;
  private Date departureTime;
  private String departureTimeStr;
  private double productPrice;
  private String productDesc;
  private Integer productStatus;
  private String productStatusStr;


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

  public Date getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(Date departureTime) {
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


  public Integer getProductStatus() {
    return productStatus;
  }

  public void setProductStatus(Integer productStatus) {
    this.productStatus = productStatus;
  }

  public String getDepartureTimeStr() {
    return departureTimeStr;
  }

  public void setDepartureTimeStr(String departureTimeStr) {
    this.departureTimeStr = departureTimeStr;
  }

  public String getProductStatusStr() {
    return productStatusStr;
  }

  public void setProductStatusStr(String productStatusStr) {
    this.productStatusStr = productStatusStr;
  }
}

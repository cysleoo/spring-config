package com.study.springbootconfig.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ssliu
 * @date 2020-07-27
 */
@ConfigurationProperties("test.conf")
@Component
public class PropertiesConfig {

  private String pro1;
  private String pro2;
  private String pro3;
  private String pro4;
  private List<Integer> list;

  public String getPro1() {
    return pro1;
  }

  public void setPro1(String pro1) {
    this.pro1 = pro1;
  }

  public String getPro2() {
    return pro2;
  }

  public void setPro2(String pro2) {
    this.pro2 = pro2;
  }

  public String getPro3() {
    return pro3;
  }

  public void setPro3(String pro3) {
    this.pro3 = pro3;
  }

  public String getPro4() {
    return pro4;
  }

  public void setPro4(String pro4) {
    this.pro4 = pro4;
  }

  public List<Integer> getList() {
    return list;
  }

  public void setList(List<Integer> list) {
    this.list = list;
  }
}

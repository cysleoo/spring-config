package com.study.springbootconfig.read;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

import com.study.springbootconfig.SpringbootConfigApplicationTests;

/**
 * @author ssliu
 * @date 2020-07-27
 */
public class ValueTest extends SpringbootConfigApplicationTests {

  @Value("${value.test}")
  String test;

  private static String staticTest;

  @Value("${value.test}")
  void setStaticTest(String value){
    staticTest = value;
  }


  @Test
  void textValue(){
    System.out.println(test);
  }

  @Test
  void testStaticValue(){
    System.out.println(staticTest);
  }








}

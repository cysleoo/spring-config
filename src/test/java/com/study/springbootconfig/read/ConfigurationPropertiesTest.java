package com.study.springbootconfig.read;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;
import com.study.springbootconfig.SpringbootConfigApplicationTests;
import com.study.springbootconfig.config.PropertiesConfig;

class ConfigurationPropertiesTest extends SpringbootConfigApplicationTests {

  @Autowired
  PropertiesConfig propertiesConfig;

  private static final Gson gson = new Gson();

  /**
   * 正确的使用方式
   */
  @Test
  void testAutowired() {
    String format = String
        .format("%s,%s,%s,%s", propertiesConfig.getPro1(), propertiesConfig.getPro2(),
            propertiesConfig.getPro3(), propertiesConfig.getPro4());
    System.out.println(format);
  }

  /**
   * list 测试
   */
  @Test
  void testNew() {
    List<Integer> list = propertiesConfig.getList();
    System.out.println(gson.toJson(list));

  }

}

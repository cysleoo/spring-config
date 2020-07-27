package com.study.springbootconfig;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ssliu
 */
@SpringBootApplication
public class SpringbootConfigApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootConfigApplication.class, args);
    Properties properties = System.getProperties();
  }

}

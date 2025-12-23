package com.ohgiraffers.common.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ConfigurationCondition;

public class Applicaiton {
  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationContext.class);

    

    MemberDTO member = context.getBean("member2", MemberDTO.class);
    System.out.println(member);
  }
}

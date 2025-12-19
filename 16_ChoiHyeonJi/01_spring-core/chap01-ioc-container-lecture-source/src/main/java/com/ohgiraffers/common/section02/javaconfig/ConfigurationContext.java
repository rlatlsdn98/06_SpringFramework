package com.ohgiraffers.common.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* Java 기반 Spring 설정 클래스
* - @Configuration : Spring 설정 클래스임을 명시
* - @Bean
* - 메서드 레벨에 작성
* - 메서드에서 반환되는 객체를 Spring Bean으로 등록
* - xml의 <bean> 태그와 같은 역할
* */
@Configuration
public class ConfigurationContext {

  @Bean(name = "member2") // 생성 주기를 IoC 컨테이너가 관리하기 시작 // 코드만 써놓고 실행은 IoC 컨테이너가 자동으로 함.
  public MemberDTO getMember() {
    return new MemberDTO(
        1,
        "user01",
        "pass01",
        "홍길동");
  }


}

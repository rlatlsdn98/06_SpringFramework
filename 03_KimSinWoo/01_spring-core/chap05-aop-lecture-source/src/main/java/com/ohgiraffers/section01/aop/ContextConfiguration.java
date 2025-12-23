package com.ohgiraffers.section01.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/* proxyTargetClass = true
* - proxy(대체자) 객체 생성의 방식으로 CGLIB방식을 사용
*   -> false이면 인터페이스를 이용
*   -> true이면 class이용이 가능하다
* */
@Configuration // 설정용 Bean 등록(내부 메서드 자동 수행)
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ContextConfiguration {

}

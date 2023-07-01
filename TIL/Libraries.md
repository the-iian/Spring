> **Gradle은 의존관계가 있는 라이브러리를 함께 다운로드한다.**

## **스프링부트 라이브러리**

build.gradle - 의존관계를 관리 (dependencies 기재)

스프링부트는 자동으로 라이브러리를 당겨와 의존관계를 관리해준다

- spring-boot-starter-web
  - spring-boot-starter-tomcat : 톰캣 (웹서버)
  - spring-webmvc : 스프링 웹 MVC

**톰캣 (WAS, 웹서버)**

고대에는 웹서버와 분리되어있어서 서버에 직접 톰캣을 설치해서 자바 코드를 밀어넣는식으로 작업했지만 현재는 소스 라이브러리에 웹서버가 내장되있다. 이런걸 임베디드(내장)하고있다고 함

(=실행만 해도 웹서버가 떠서 8080에 들어갈 수 있음)

- spring-boot-stater-thymeleaf : html, css역할, 타임리프 템플릿 엔진 (View)

- spring-boot-starter(공통) : 스프링 부트 + 스프링 코어 + 로깅
  - spring-boot
    - spring-core
- spring-boot-starter-logging
  - logback, slf4j

**logging 라이브러리**

현업에선 system.out.println으로 출력하면 안되고 logging으로 출력해야한다. 로그로 남겨야 심각한 에러만 따로 모아볼 수 있고 로그파일들이 관리가 된다.

**logback, slf4j**(인터페이스)

시대의 흐름에 따른 트렌드 변화로 많이 사용됨

실제 로그를 어떤 구현체로 출력할지 logback을 많이 선택한다. 성능 빠르고, 여러가지 지원 기능이 좋음.

## **TEST 라이브러리**

- spring-boot-starter-test
  - juit : 자바 진영 핵심 **테스트 프레임워크**
  - mockito, assertj : 테스트코드를 좀 더 편하게 작성하게 도와주는 라이브러리
  - spring-test : 스프링 통합 테스트 지원

juit4에서 juit5로 넘어가는 추세이다.

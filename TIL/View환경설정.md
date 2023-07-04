### View 환경설정

- 스프링부트가 제공하는 Welcome Page 기능

\`main/resources/static/index.html\`을 올려두면 Welcome page 기능을 제공한다.

- Controller에서 리턴값으로 문자를 반환하면 viewResolver가 화면을 찾아서 처리함
  - \`resources:templates/\`+\[viewname(=hello)\]+\`.html\`

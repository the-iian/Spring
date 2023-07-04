### View 환경설정
<br>

- 스프링부트가 제공하는 Welcome Page 기능

\`main/resources/static/index.html\`을 올려두면 Welcome page 기능을 제공한다.

<br>

![20230705_002755](https://github.com/the-iian/Spring/assets/135327147/f270e2c9-769f-4127-8eee-bb01ceb0ec5e)

<br>
- Controller에서 리턴값으로 문자를 반환하면 viewResolver가 화면을 찾아서 처리함
<br>
- \`resources:templates/\`+\[viewname(=hello)\]+\`.html\`

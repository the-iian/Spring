package hello.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/sbb") // url함수 호출
    @ResponseBody  // 문자열 인식 어노테이션
    public String sbb(){
        return "안녕하세요 sbb에 오신것을 환영합니다.";
    }
}

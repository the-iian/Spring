package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!");
        return "hello";
    }


    // 템플릿엔진 방식
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
        // 템플릿엔진 : view라는 템플릿이 있는 상황에서 조작하는 방식
    }

    // API - 문자를 바로 반환 (이렇게 문자로 출력하는건 사용할 일이 없음)
    @GetMapping("hello-string")
    @ResponseBody // http에서 body부에 이 데이터를 직접 넣어주겠다는 의미, view없이 문자가 그대로 내려감.
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    
    // 데이터를 요청받을 때 사용하는 API 방식
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello(); // 객체 생성
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

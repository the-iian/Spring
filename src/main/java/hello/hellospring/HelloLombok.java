package hello.hellospring;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor  // final쓸때 같이 사용
@Getter

public class HelloLombok {
    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("헬로", 5);

        System.out.println("helloLombok.getHello()=" + helloLombok.getHello());
        System.out.println("helloLombok.getLombok()=" + helloLombok.getLombok());
    }
}

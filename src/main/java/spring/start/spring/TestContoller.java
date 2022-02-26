package spring.start.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("spring")
public class TestContoller {

    @RequestMapping("test")
    public void test(){
        System.out.println("멘탈 존나 깨지네 ㅎㅎㅎㅎ ㅅㅍ ");
    }
}

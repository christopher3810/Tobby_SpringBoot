package tobyspring.myboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {
    @GetMapping("/hello")
    public String hello(String name){
        return "Hellow" + name;
    }

}

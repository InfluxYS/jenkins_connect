package influx.jenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;


@RestController
public class DefaultController {

    @GetMapping("/home")
    public String home2(){
        return "hello world";
    }


    @GetMapping("/")
    public String home(){
        return "this is home";
    }


    @PostConstruct
    void init(){
        System.out.println("this bean is load!");
    }


}

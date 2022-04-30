package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.AspectTestOneImplOne;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.AspectTestOneImplTwo;

/**
 * @author lsl
 * @date 2022/4/30 22:26
 */
@RestController()
@RequestMapping(value = "/aopTwo")
@Slf4j
public class ControllerAopTwo {
    @Autowired
    AspectTestOneImplOne aspectTestOneImplOne;
    @Autowired
    AspectTestOneImplTwo aspectTestOneImplTwo;

    @GetMapping("/fuckyou")
    public void aOne() {

        aspectTestOneImplOne.methodOne();
        aspectTestOneImplOne.methodTwo();
        aspectTestOneImplOne.methodThree();

    }

    @GetMapping("/fuckyouto")
    public void aTwo() {
        System.out.println("xx");
        aspectTestOneImplTwo.methodOne();

    }

}

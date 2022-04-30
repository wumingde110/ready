//package controller;
//
//import service.AspectTestOneImplOne;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author lsl
// * @date 2022/4/30 22:26
// */
//@RestController(value = "/aopa")
//@Slf4j
//public class ControllerAopTwo {
//    @Autowired
//    AspectTestOneImplOne aspectTestOneImplOne;
//
//    @GetMapping(value = "/aOne")
//    public void aOne() {
//        System.out.println("xx");
//        aspectTestOneImplOne.methodOne();
//        aspectTestOneImplOne.methodTwo();
//        aspectTestOneImplOne.methodThree();
//
//    }
//
//}

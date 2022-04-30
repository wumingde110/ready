package controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lsl
 * @date 2022/4/30 21:59
 */
@RestController(value = "/aop")
@Slf4j
public class ControllerAopOne {
    @GetMapping(value = "/cOne")
    public void cOne(@RequestParam(name = "name", defaultValue = "cOne") String name) {
        log.info("cOne name=", name);
    }

    @GetMapping(value = "/cTwo")
    public String cTwo(@RequestParam(name = "name", defaultValue = "cTwo") String name) {
        log.info("cTwo name=", name);
        System.out.println(name);
        return name;
    }

    @GetMapping(value = "/cThree")
    public void cThree() {
        throw new NullPointerException("cThree exception");
    }
//
//    public void cOne() {
//
//    }
}

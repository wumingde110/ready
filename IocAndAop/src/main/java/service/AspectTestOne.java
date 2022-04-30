package service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lsl
 * @date 2022/4/30 22:19
 */
@Slf4j
public class AspectTestOne {
    public void methodOne() {
        log.info("This is AspectTestOne methodOne");
    }

    public void methodTwo() {
        log.info("This is AspectTestOne methodTwo");
    }
}

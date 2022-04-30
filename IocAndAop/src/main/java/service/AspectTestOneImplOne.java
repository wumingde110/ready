package service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author lsl
 * @date 2022/4/30 22:23
 */
@Service
@Slf4j
public class AspectTestOneImplOne extends AspectTestOne{

    @Override
    public void methodTwo() {
        super.methodTwo();
    }

    public void methodThree() {
        log.info("This is AspectTestOneImplOne methodThree");
    }
}

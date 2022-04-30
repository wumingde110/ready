package service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author lsl
 * @date 2022/4/30 22:23
 */
@Service
@Slf4j
public class AspectTestOneImplTwo implements AspectTestTwo{
    @Override
    public void methodOne() {
        log.info("This is AspectTestOneImplTwo methodOne");
    }
}

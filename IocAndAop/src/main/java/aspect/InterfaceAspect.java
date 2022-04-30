package aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author lsl
 * @date 2022/4/30 23:12
 */
@Component
@Aspect
@Slf4j
public class InterfaceAspect {
    @Pointcut(value = "within(service.AspectTestTwo+)")
    public void interfaceAspect(){

    }

    @Before(value = "interfaceAspect()")
    public void beforeInterfaceAspect(){
        log.info("beforeInterfaceAspect");
    }
}

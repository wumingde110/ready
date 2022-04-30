package aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author lsl
 * @date 2022/4/30 22:14
 */
@Component
@Aspect
@Slf4j
public class ClassAspect {
    @Pointcut(value = "within(service.AspectTestOneImplOne)")
    public void classAspect(){
    }

    @Before(value = "classAspect()")
    public void beforeClassAspect(){
        log.info("beforeClassAspect");
    }
}

package aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author lsl
 * @date 2022/4/30 21:39
 * match all controller
 */
@Component
@Aspect
@Slf4j
public class AllControllerAspect {
    @Pointcut(value = "execution(* controller..*.*(..))")
    public void allControllerPointCut() {
    }

    @Before(value = "allControllerPointCut()")
    public void beforeAllControllerPointCut(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        log.info("class: " + signature.getDeclaringType() + " method: " + signature.getName() + " begin " + System.currentTimeMillis());
        List<Object> parameters = Arrays.asList(joinPoint.getArgs());
        log.info("parameter: " + parameters.toString());
    }

    @Around(value = "allControllerPointCut()")
    public Object aroundAllControllerPointCut(ProceedingJoinPoint point) {
        Object result = null;
        try {
            log.info("around begin");
            result = point.proceed();
        } catch (Throwable throwable) {
            log.error("AllControllerAspect around ,error=", throwable);
        }
        return result;
    }

    @AfterReturning(value = "allControllerPointCut()", returning = "returnResult")
    public void afterReturningAllControllerPointCut(JoinPoint joinPoint, Object returnResult) {
        Signature signature = joinPoint.getSignature();
        if (returnResult == null) {
            log.info("class: " + signature.getDeclaringType() + " method: " + signature.getName() + " is void");
            return;
        }
        log.info("class: " + signature.getDeclaringType() + " method: " + signature.getName() + " returnResult " + returnResult.toString() + " " + System.currentTimeMillis());
    }

    @AfterThrowing(value = "allControllerPointCut()", throwing = "ex")
    public void afterThrowingAllControllerPointCut(Throwable ex) {
        log.error("error=", ex);
    }

    @After(value = "allControllerPointCut()")
    public void afterAllControllerPoinCut(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        log.info("class: " + signature.getDeclaringType() + " method: " + signature.getName() + " end " + System.currentTimeMillis());
    }
}

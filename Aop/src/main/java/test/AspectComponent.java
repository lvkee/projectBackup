package test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * aop组件
 */
@Aspect
@Component
public class AspectComponent {

    @Pointcut("execution(* test.*Service*.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("test of get args(获取参数args的测试)");
        System.out.println(args[0].toString());
        System.out.println("before aspect executed(在切面执行之前):"+ joinPoint.toString());
        String [] str1 = args[0].toString().split("[,]");
        String [] str2 = str1[1].split("[=]");
        if (Integer.parseInt(str2[1]) < 18){
            throw new RuntimeException("add person throw exception(添加用户抛出异常)");
        }
    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("after aspect executed(在切面执行之后):"+joinPoint.toString());
    }


    @AfterReturning(pointcut = "pointCut()", returning = "returnVal")
    public void afterReturning(JoinPoint joinPoint, Object returnVal) {
        System.out.println("afterReturning executed, return result is" +
                " (afterReturning执行,返回结果是)"
                + returnVal +joinPoint.toString());
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around start(around启动)");
        try {
            pjp.proceed();
        } catch (Throwable ex) {
            System.out.println("error in around(around出错)");
            throw ex;
        }
        System.out.println("around end(around结束)");
    }

    @AfterThrowing(pointcut = "pointCut()", throwing = "error")
    public void afterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("(AfterThrowing出错后的报错)error:" + error+"  "+joinPoint.toString());
    }
}


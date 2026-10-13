
package hemashre.com;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.employee.EmployeeService.*(..))")
    public void logBefore(JoinPoint joinPoint) {

        String methodName =
                joinPoint.getSignature().getName();

        if (methodName.equals("addEmployee")) {
            System.out.println("Logging: Adding employee");
        } else if (methodName.equals("displayEmployee")) {
            System.out.println("Logging: Displaying employee");
        } else if (methodName.equals("calculateSalary")) {
            System.out.println("Logging: Calculating salary");
        }
    }
}

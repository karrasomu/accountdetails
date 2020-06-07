package myorg.api.servicing.accountdetails.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author 
 * Aspect class to log/process the Cross Cutting Concerns
 */
@Aspect
@Component
public class ErrorAspect {
	private final Logger logger = LoggerFactory.getLogger(ErrorAspect.class);

	/**
	 * @param joinPoint
	 * Method is to log/process any information before the executing the Joinpoint/execution method
	 */
	@Before("execution(* myorg.api.servicing.accountdetails.service.AccountDetailsServiceImpl.process(..))")
	public void logBefore(JoinPoint joinPoint) {
		logger.info("Sample Before Pointcut Is Created");
	}
}

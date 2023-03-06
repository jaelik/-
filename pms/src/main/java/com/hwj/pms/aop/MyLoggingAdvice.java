package com.hwj.pms.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Advice :부가 기능을 담당하는 역할, 로깅을 담당할 클래스 
public class MyLoggingAdvice {
	private static final Logger logger = LoggerFactory.getLogger(MyLoggingAdvice.class);
	
	public Object aroundAdvice(ProceedingJoinPoint joinPoint)throws Throwable {
		//추가 로직 
		logger.info(joinPoint.getSignature().toString());
		
		//메소드 실행 
		return joinPoint.proceed();
	}
}

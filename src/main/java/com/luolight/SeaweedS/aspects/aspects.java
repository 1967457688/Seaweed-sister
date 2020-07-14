package com.luolight.SeaweedS.aspects;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.luolight.SeaweedS.annotations.HomeLogin;
import com.luolight.SeaweedS.models.SsUser;
import com.luolight.SeaweedS.services.impls.SsUserSI;
import com.luolight.SeaweedS.utils.Constans;
import com.luolight.SeaweedS.utils.U;

/**
 * 检测登录
 * @author Liang
 * @version 1.0
 */

@Component
@Aspect
public class aspects {
	
	@Autowired
	private SsUserSI userService;

	
	/**
	 * 用户登录以及接口授权检测
	 * @param pjd
	 * @return
	 */
	@Around("execution(* com.luolight.SeaweedS.controllers.*.*(..))")
	public HashMap<String, Object> checkLoginPower(ProceedingJoinPoint pjd) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		
		//记录本次请求
		U.logAction(request.getRemoteHost() + "    " + request.getRequestURL() + "    " + request.getHeader("User-Agent"));
		
//		//检测是否授权
//		Object access_token = request.getParameter(Constans.ACCESSTOKEN);
//		if(null == access_token) {
//			U.logAction(U.getNowTime() + "    " + request.getRemoteHost() + "    " + Constans.INVALIDACCESSTOKEN[1]);
//			return Constans.returnCon(null, Constans.INVALIDACCESSTOKEN[0], Constans.INVALIDACCESSTOKEN[1]);
//		}
//		//检测授权是否正确
//		String accessToken = access_token + "";
//		if(!ProperU.read(Constans.PROSOURCE, "accessTokenAndroid").equals(accessToken) && !ProperU.read(Constans.PROSOURCE, "accessTokenIos").equals(accessToken)) {
//			U.logAction(U.getNowTime() + "    " + request.getRemoteHost() + "    " + Constans.INVALIDACCESSTOKEN[1]);
//			return Constans.returnCon(null, Constans.INVALIDACCESSTOKEN[0], Constans.INVALIDACCESSTOKEN[1]);
//		}
//		
		HashMap<String, Object> result = null;
		SsUser user = new SsUser();
		
		//检测用户登录（只检测部分接口）
		//获得请求的方法
		MethodSignature joinPointObject = (MethodSignature) pjd.getSignature();
        Method method = joinPointObject.getMethod();
		if(hasAnnotationOnMethod(method, HomeLogin.class)) {
			//检测是否存在token值
			Object token = request.getParameter(Constans.TOKEN);
			if(null == token) {
				U.logAction(U.getNowTime() + "    " + request.getRemoteHost() + "    " + Constans.INVALIDTOKEN[1]);
				return Constans.returnCon(null, Constans.INVALIDTOKEN[0], Constans.INVALIDTOKEN[1]);
			}
			if(token.equals("")) {
				//如果登录检测可有可无，那么配置默认信息
				user.setId(-1);
				user.setType((short) 2);
				user.setPhoto("");
				user.setNickName("游客");
				user.setPhoneNumber("13811111111");
				request.getSession().setAttribute("userInfo", user);
			}else {
				//查询是否有对应token的用户
				user = userService.SelectByToken(token+"");
				if(null == user) {
					U.logAction(U.getNowTime() + "    " + request.getRemoteHost() + "    " + Constans.INVALIDTOKEN[1]);
					return Constans.returnCon(null, Constans.INVALIDTOKEN[0], Constans.INVALIDTOKEN[1]);
				}
				//用户token存在，将当前用户信息放入request中
				request.getSession().setAttribute("userInfo", user);
			}
		}else {
			//如果不需要检测登录，那么配置默认信息
			user.setId(-1);
			user.setType((short) 2);
			user.setPhoto("");
			user.setNickName("游客");
			user.setPhoneNumber("13811111111");
			request.getSession().setAttribute("userInfo", user);
		}
		
		//执行方法
		try {
			result = (HashMap<String, Object>) pjd.proceed();
		} catch (Throwable e) {
			U.exceptionLog(new RuntimeException(e), request.getRemoteHost());
			return Constans.returnCon(null, Constans.ERROR[0], Constans.ERROR[1]);
		}
		
		return result;
	}
	
	/**
     * 判断某方法上是否含有某注�?
     * @param method
     * @param annotationClazz
     * @return
     */
    private boolean hasAnnotationOnMethod(Method method,Class annotationClazz){
        //使用反射获取注解信息
        Annotation a = method.getAnnotation(annotationClazz);
        if (a == null){
            return false;
        }
        return true;
    }

}

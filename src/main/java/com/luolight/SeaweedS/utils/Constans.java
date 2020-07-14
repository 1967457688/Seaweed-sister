package com.luolight.SeaweedS.utils;

import java.util.HashMap;

/**
 * 常量工具类
 * @author Liang
 * @version 1.0
 */

public class Constans {
	
	//总配置文件
	public static final String PROSOURCE = "D:/work/myEclipse1/workspace1/pro/sea/pro.properties";
//	public static final String PROSOURCE = "/usr/local/seaweed-sister/pro/pro.properties";
	
	//服务器域名地址
	public static final String HOSTURL = "http://www.seaweedsister.com";
	
	//用户默认头像
	public static final String USERPHOTO = "http://www.seaweedsister.com/img/logo.png";
	
	//数据库排序
	public static String ORDERBYDESC = "desc";
	public static String ORDERBYASC = "asc";

	//图片资源
	public static final String IMGHANDLER = "/img";
	
	//accessToken、token
	public static final String ACCESSTOKEN = "access_token";
	public static final String TOKEN = "token";
	
	//调度任务服务器约定调用密匙
	public static final String SCHEDULEDSECRET = "01374947";
	
	//用户名已经存在和不存在
	public static final String USERNAMEEXIST = "yes";
	public static final String USERNAMENONEXIST = "no";
	
	//添加会员默认密码
	public static final String DEFAULTPASS = "123456";
	//添加会员默认性别
	public static final Short DEFAULTSEX = 1;
	//添加会员默认名称
	public static final String DEFAULTNAME = "未填写昵称";
	
	//返回code
	public static final String[] SUCCESS = {"200", "success"};
	public static final String[] FAILURE = {"201", "当前操作失败，请重新操作！"};
	public static final String[] ERROR = {"202", "系统错误，请重新操作！"};
	public static final String[] INVALIDOPERATION = {"203", "无效操作！"};
	public static final String[] INVALIDACCESSTOKEN = {"101", "非法操作！"};
	public static final String[] NOTENOUGHPARAM = {"102", "系统错误，请重新操作！"};
	public static final String[] INVALIDPARAM = {"103", "无效的操作，请重新操作！"};
	public static final String[] INVALIDTOKEN = {"104", "当前账号异地登录，请重新登录！"};
	public static final String[] INVALIDCOOKIE = {"105", "当前操作已过最大时效，请重新操作！"};
	public static final String[] ABNORMALLOGIN = {"106", "abnormal login"};
	public static final String[] USERNAMEPASSERROR = {"107", "用户名或密码错误，请重新输入！"};
	public static final String[] USEROUTTIMEERROR = {"1071", "当前验证码已过期，请重新输入！"};
	public static final String[] USERCODEERROR = {"1072", "当前验证码错误，请重新输入！"};
	public static final String[] USERHAVEERROR = {"1073", "当前手机号码已注册，请直接登录！"};
	public static final String[] NOTENOUGHINTE = {"108", "积分不足!"};
	public static final String[] NOTENOUGHSTOCK = {"109", "库存不足!"};
	public static final String[] INVALIDUSERNAME = {"110", "当前用户不存在!"};
	public static final String[] UPINFOINVALID = {"111", "您还未填写升级所需的资料!"};
	public static final String[] UPINTERESENTFUL = {"112", "所购买商品未达到升级要求!"};
	public static final String[] SURESENDREPEAT = {"113", "当前订单已发货，请勿重新发货！"};
	public static final String[] SURERECEIVEREPEAT = {"114", "当前订单已收货，请勿重新收货！"};
	public static final String[] ORDERDISEXISTS = {"115", "当前订单不存在，操作异常！"};
	public static final String[] BINDPHONEINVAILD = {"116", "输入号码与当前绑定手机号码一致，无需更换！"};
	public static final String[] BINDPHONEHAVE = {"117", "当前手机号码已绑定，请更换手机号码！"};
	
	//统一的的数据返回格式
	public static HashMap<String, Object> returnCon(final Object con,final String code,final String msg){
		HashMap<String, Object> result =  new HashMap<String, Object>();
		result.put("con", con);
		result.put("code", code);
		result.put("msg", msg);
		return result;
	}
	
	//统一的数据返回格式-调用异常
	public static HashMap<String, Object> returnNullParamCon(){
		HashMap<String, Object> result =  new HashMap<String, Object>();
		result.put("con", null);
		result.put("code", "-1");
		result.put("msg", null);
		return result;
	}
	
	
}

package com.luolight.SeaweedS.utils;


import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

/**
 * 阿里大鱼手机验证码工具类
 * @author Liang
 * @version 1.0
 */

public class ALiDaYuU {
	
	//阿里大鱼手机短信验证码工具类配置文件地址
	private static String pro = ProperU.read(Constans.PROSOURCE, "alidayu");
	
    //产品名称
	private static String product = ProperU.read(pro, "sendMsg.product");
	
    //产品域名
	private static String domain = ProperU.read(pro, "sendMsg.domain");

    //accessKeyId
	private static String accessKeyId = ProperU.read(pro, "sendMsg.accessKeyId");
	
	//accessKeySecret
	private static String accessKeySecret = ProperU.read(pro, "sendMsg.accessKeySecret");

	//默认连接超时时间
	private static String defaultConnectTimeout = ProperU.read(pro, "sendMsg.defaultConnectTimeout");
	
	//默认读取超时时间
	private static String defaultReadTimeout = ProperU.read(pro, "sendMsg.defaultReadTimeout");
	
	/**
	 * 
	 * @param phoneNumber 手机号码
	 * @param signNameName 签名名称
	 * @param templateCodeName 模板代号
	 * @param sendTemplateName 模板内容名称
	 * @param sendMsg 发送的消息
	 */
	public static void sendSms(String phoneNumber, String signNameName, String templateCodeName, String sendTemplateName, String[] sendMsg){
        //可自助调整超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", defaultConnectTimeout);
        System.setProperty("sun.net.client.defaultReadTimeout", defaultReadTimeout);

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
        try {
			DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
		} catch (ClientException e1) {
			e1.printStackTrace();
		}
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(phoneNumber);
        //必填:短信签名-可在短信控制台中找到
        String signName = ProperU.read(pro, signNameName);
        request.setSignName(signName);
        //必填:短信模板-可在短信控制台中找到
        String templateCode = ProperU.read(pro, templateCodeName);
        request.setTemplateCode(templateCode);
        //可选:模板中的变量替换JSON串
        //先判断参数是否足够，然后再拼接
        String sendTemplate = ProperU.read(pro, sendTemplateName);
        if(sendMsg.length != sendTemplate.split("-").length) return;
        request.setTemplateParam(U.contactJsonStr(sendTemplate.split("-"), sendMsg));
        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse = null;
        try {
        	sendSmsResponse = acsClient.getAcsResponse(request);
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
	
}

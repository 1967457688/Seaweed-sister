package com.luolight.SeaweedS.utils;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
	public static String pid = "2088131993278834";
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2018112062233560";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQC7WkGlwbdjUYAC" +
    		"3Kf+dPU4iWqizkDeOP/x8kWankvzY1YI13coz3gMVPGJ0Xx9m8/asSZVepnINcuV" +
    		"Sn29Mej+n8CB6spfow2g4wfj4ByH1zzy7you0hAxxJA4OHay9Rj17N7/KtAxkp7R" +
    		"H3MDfIKr1YWmz8DelNPdyMehhZ5QPya6ksNKBLdaMJdEITc8wqugE6QpXwciDeID" +
    		"WmT055lv3Qqilj90lO13/oA8t/PhfvIEyb8NJpVQuSPezzVyZ3zpVULMtAaQ8Hi0" +
    		"yQ3t+Hz0/qHtGy8uuYp4vxeur569sm5WGu+AfYya9XPSnqnuxsMx/FRNY71vPuK6" +
    		"znVZs87hAgMBAAECggEBAJBix5MCDt4Y8knCWimtY0r2BFuCDtX0IbQJnYDCnA/v" +
    		"r19TBn9KHN+MGzW2X3XCPdbxjXR07s0wQDxG006ah1CsN0UoeFxqIdeq/+qrTfGW" +
    		"fF9Q2DaLJ3XjYa4iPcA/ScRFj7og+aAqugC6dv3p2B6riLv9AkvHcNxMnyUo/9Ag" +
    		"9xCPrHWsSW7zMt3NiouBSXGj5glLqZuFa7jD6aS/c2rpGgKWzWRg33XSMx8EF0iw" +
    		"Ue4deVgKU9dNuJBAicRgE4JGwaqcwwRMsYh1iRTemEstSzN5pXjAyCnw+drDPUi0" +
    		"4kdjj188qKgW8QTHjo7aF6dP/ZmWqwfZrAVZ4xcZo10CgYEA96FfoEgb2ywmf61Z" +
    		"te31NfAe/iu3TK8zCVc97oTz++8qsxqrArjzv3FOtnw5YlzkLUQ1o60Ar8O5YDyG" +
    		"GzrfHLG2Lda3754MimQHWq2BbVTjCVPo8liRtqXIJX7CifvzCI5XI0MpRqSoEbOk" +
    		"G26Y/QjnKE8BFuYzVbjseSpRh0sCgYEAwa9T/Hv7sHy902aqgsw53gZg8iKwHL5A" +
    		"DhbiGHjggC3T0Lzv/JLYpXbZ/qGvtP/UVF50EOLSyZGiTgwpwhBvLi7sHrDTlps5" +
    		"qYIlD/hBGtvNhwwJUGJWMLzyJvUwzW6D5wIR3uiEHctxtuj4R3UCZkKruukCexMR" +
    		"3fAJYt1tCwMCgYBQui4HfZp/L/x5ARVO5v1akSY5bBz8hd0YfXV2LaewiP6dluML" +
    		"JypnTdQAT60RcQD99M+bxUmFA0SKqBB8DgwwOYsPlIEwP5ENCKERIaEg+FxvbQhz" +
    		"AQa3yYHfH1ziSN2o+2ZS25E4M3OLGco1GzAKxX0+Ocs8IN25Y2jL80zS0wKBgQCR" +
    		"xpJh4DcpOFnvOMBxPaD4OLjSxcTjfVXcxOBbJu9hyhw4aVv/L88bin68pZkHk92N" +
    		"uqGE7BNWXuRX9dOgGppzmiFhYBmAq0gVCr02bdUij/j7AdYoyDqy6CMhqz2WAO4J" +
    		"+obUzRBTFIJ79pCXx7uMl/WE8kdJtqql7jpCTQH7XQKBgQCH6P3Ct/dLzaHsZtNW" +
    		"M7uC06aHHN3k0SsHR1mDl1NgOh1RRCdoN8ESdxDKxQ15czUNOLGdOrkr/0NEDOrL" +
    		"4dlyn0H21RgE7RvNEYjKbvvptD8M/R1Uoj9qMcuNe8R0m8BvdQZet9810oRKnZoi" +
    		"bkZcZj5qWsxTF9g6K3+nmcU5pQ==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArNkzFTMSkEMcWPsxEZ+nkaQd/vW0f8vBYjnhxMl32igARn48Jv1uXyViBSXCjtGUwKd/dNTQNjxYYLVTTH2cCkpt6KSE/1YRqNAJQGWzWpS8riQo1std8DqypWUc2GlL/P2ed82KeupXksdHGMOTcU5XI8uQ7IAXX9pt5eN6S6Y2la2qbzdsydocr/5cKQUqgLYFHdmJ9EYGxw868pgoYztHxH2GJUF9mle3wzzgz1Y5imPPclzy/vMZef0DLp+Kjh5Rg4s8/6hIVmmgsLl3ISnQKETfDyWS9DR7UpZGkuc8DPYzN4luhPDVAkSEtN1fF/PKvNyHmr8IOMB72C0ySQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://app.huoxiaoxiao.com/notify/buyNotifyAlipay";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	
}



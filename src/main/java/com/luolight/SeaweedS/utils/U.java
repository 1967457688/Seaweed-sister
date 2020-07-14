package com.luolight.SeaweedS.utils;

import org.apache.commons.codec.binary.Hex;
import org.springframework.util.Base64Utils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * 超级工具�?
 * 
 * @author Liang
 * @version 1.0
 */

public class U {

	public static Random random = new Random();

	public static String pricesShow(BigDecimal prices) {
		int price = prices.toBigInteger().intValue();
		if(price/1000 >= 1) {
			return new BigDecimal(price).divide(new BigDecimal(1000)).setScale(2, RoundingMode.DOWN).toString() + "k";
		}
		return prices.setScale(2, RoundingMode.DOWN).toString();
	}
	
	public static String getOutTrandeNo() {
		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + randomSix();
	}

	public static void sort1(ArrayList<Integer> arr){
		for(int i = 0;i < arr.size();i ++) {
			int p = random.nextInt(arr.size());
			Integer tmp = arr.get(i);
			arr.set(i, arr.get(p));
			arr.set(p, tmp);
		}
	}
	
	/**
	 * 修改时间的天数
	 * @param time
	 * @return
	 */
	public static String updateTime(String time, int days) {
		String[] times = time.split("-");
		int day = (Integer.parseInt(times[2]) + days);
		if(day < 10) {
			return times[0] + "-" + times[1] + "-0" + day;
		}else {
			return times[0] + "-" + times[1] + "-" + day;
		}
	}
	
	/**
	 * 生成积分详情流水号
	 * @param time
	 * @param orderId
	 * @return
	 */
	public static String productNo(String time, String orderId) {
		return time.replace(" ", "").replaceAll("-", "").replaceAll(":", "") + orderId;
	}
	
	/**
	 * 比较两个时间的大小
	 * @param time1
	 * @param time2
	 * @return
	 * @throws ParseException
	 */
	public static int compareTime(String time1, String time2) throws ParseException {
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return time.parse(time1).compareTo(time.parse(time2));
	}

	public static BigDecimal makeBd(BigDecimal bd) {
		if(bd == null) bd = new BigDecimal("0.00");
		String bdS = bd.toString();
		if(bdS.indexOf(".") == -1) return new BigDecimal(bdS + ".00");
		int pointIndex = bdS.length() - bdS.indexOf(".");
		if(pointIndex < 4) {
			if(pointIndex == 2) {
				return new BigDecimal(bdS + "0");
			}
			return bd;
		}
		return new BigDecimal(bdS.substring(0, bdS.indexOf(".")+3));
	}
	
	// 通过参数拼接json字符�?
	// "{\"name\":\"Tom\", \"code\":\"123\"}"
	public static String contactJsonStr(String[] jsonKeys, String[] jsonValues) {
		StringBuffer sb = new StringBuffer("{");
		for (int i = 0; i < jsonKeys.length; i++) {
			sb.append("\"" + jsonKeys[i] + "\":\"" + jsonValues[i] + "\"");
			if (i != jsonKeys.length - 1)
				sb.append(",");
		}
		return sb.append("}").toString();
	}
	
	
	public static String showOrderNo(String time) {
		return time.replaceAll("-", "").replaceAll(":", "").replace(" ", "").substring(2, 8);
	}
	
	public static String createOrderNo(Integer uid) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date) + uid + randomFour();
	}

	// 生成四位随机�?
	public static String randomFour() {
		return ((int) ((Math.random() * 9 + 1) * 1000)) + "";
	}
	
	// 生成六位随机数
	public static String randomSix() {
		return ((int)((Math.random() * 9 + 1) * 100000)) + "";
	}
	
	//生成token值
	public static String generatorToken() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 验盐
	 * @param password
	 * @param md5
	 * @return
	 */
	public static boolean verify(String password, String salt, String passwordSalt) {
		
		return md5Hex(password + salt).equals(passwordSalt);
	}
	
	/**
	 * 获取十六进制字符串形式的MD5摘要
	 * @param src
	 * @return
	 */
	public static String md5Hex(String src) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			byte[] bs = md5.digest(src.getBytes());
			return new String(new Hex().encode(bs));
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * 获取会员随机用户名
	 * @return
	 */
	public static String getMemberRandom() {
		return md5Hex(getNowTime()).substring(26);
	}
	
	/**
	 * 获取销总随机用户名
	 * @return
	 */
	public static String getLeaderRandom() {
		return md5Hex(getNowTime()).substring(26);
	}
	
	/**
	 * 操作日志记录
	 * @param con 内容
	 */
	public static void logAction(String con) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			File file = new File(ProperU.read(Constans.PROSOURCE, "actionLogsFile") + new SimpleDateFormat("yyyy_MM_dd_HH").format(date) + ".txt");
			if(!file.exists()) file.createNewFile();
			PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));
			pw.println(sdf.format(date) + "  " + con);
			pw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 操作日志记录
	 * @param con 内容
	 */
	public static void logFreeze(String con) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			File file = new File(ProperU.read(Constans.PROSOURCE, "freezeLogsFile") + new SimpleDateFormat("yyyy_MM_dd_HH").format(date) + ".txt");
			if(!file.exists()) file.createNewFile();
			PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));
			pw.println(sdf.format(date) + "  " + con);
			pw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 用户登录登出行为日志记录
	 * @param con 内容
	 */
	public static void logLogin(String con) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			File file = new File(ProperU.read(Constans.PROSOURCE, "loginLogsFile") + new SimpleDateFormat("yyyy_MM_dd_HH").format(date) + ".txt");
			if(!file.exists()) file.createNewFile();
			PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));
			pw.println(sdf.format(date) + "  " + con);
			pw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 操作异常日志记录
	 * @param con 内容
	 */
	public static void exceptionLog(Exception e, String ip) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			File file = new File(ProperU.read(Constans.PROSOURCE, "exceptionLogsFile") + new SimpleDateFormat("yyyy_MM_dd_HH").format(date) + ".txt");
			if(!file.exists()) file.createNewFile();
			PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));
			pw.println(sdf.format(date) + "____" + ip);
			StringWriter sw = new StringWriter();   
            PrintWriter pw1 = new PrintWriter(sw, true);   
            e.printStackTrace(pw1);   
            pw1.flush();   
            sw.flush();   
			pw.println(sw.toString());
			pw.close();
		}catch(Exception e1) {
			e.printStackTrace();
		}
	}
	
	public static String getNowTime() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	
	public static String getPayTime() {
		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	}
	
	public static String getNowDay() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
	
	public static String getNowTimes() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
	
	public static String addTimeHourNowDay(String time, int h, int m) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long time1 = sdf.parse(time).getTime();
		long time2 = time1/1000 + ((h == 0 ? 1 : h) * (m == 0 ? 60 : m) * 60);
		return sdf.format(Long.valueOf(time2+"000"));
	}
	
	public static String subTimeHourNowDay(String time, int h, int m) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long time1 = sdf.parse(time).getTime();
		long time2 = time1/1000 - ((h == 0 ? 1 : h) * (m == 0 ? 60 : m) * 60);
		return sdf.format(Long.valueOf(time2+"000"));
	}
	
	public static String getTime() {
		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	}
	
	public static String getTime(String date) {
		try {
			return new SimpleDateFormat("yyyyMMdd").format(DateFormat.getDateInstance().parse(date));
		} catch (ParseException e) {
			U.exceptionLog(e, "127.0.0.1");
		}
		return date;
	}
	
	public static Integer[] getUid(String uids) {
		String[] str = uids.split(",");
		int strLength = 0;
		if(str[0].equals("") || str[0] == null) strLength ++;
		Integer[] result = new Integer[str.length - strLength];
		for(int i = strLength;i < str.length;i ++) {
			result[i-strLength] = Integer.parseInt(str[i]);
		}
		return result;
	}
	
	public static int[] getId(String uids) {
		String[] str = uids.split(",");
		int strLength = 0;
		if(str[0].equals("") || str[0] == null) strLength ++;
		int[] result = new int[str.length - strLength];
		for(int i = strLength;i < str.length;i ++) {
			result[i-strLength] = Integer.parseInt(str[i]);
		}
		return result;
	}
	
	public static Integer checkNullInt(Integer obj) {
		if(null == obj) {
			return 0;
		}else {
			return obj;
		}
	}
	
	public static BigDecimal checkNullBigDecimal(BigDecimal bd) {
		if(null == bd) {
			return new BigDecimal("0.00");
		}else {
			return bd;
		}
	}
	
	public static String checkNullString(String obj) {
		if(null == obj) {
			return "";
		}else {
			return obj;
		}
	}
	
	
	/*
	 * 用于转换字符串中的+，url中会将+变成空格
	 */
	public static String makeUrlNoneValue(String str) {
		if(str.indexOf("+") != -1) {
			return str.replaceAll("[+]", "%2B");
		}else {
			return str;
		}
	}
	
	public static String key = "Po8liRtq";
	
	/**
	* 加密
	* @param datasource byte[]
	* @param password String
	* @return byte[]
	*/
	public static byte[] encrypt(byte[] datasource) { 
		try{
			SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG" );
	        secureRandom.setSeed(key.getBytes());
			DESKeySpec desKey = new DESKeySpec(key.getBytes());
			//创建一个密匙工厂,然后用它把DESKeySpec转换成
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey securekey = keyFactory.generateSecret(desKey);
			//Cipher对象实际完成加密操作
			Cipher cipher = Cipher.getInstance("DES");
			//用密匙初始化Cipher对象
			cipher.init(Cipher.ENCRYPT_MODE, securekey, secureRandom);
			//现在,获取数据并加密
			//正式执行加密操作
			return Base64Utils.encode(cipher.doFinal(datasource));
		}catch(Throwable e){
			e.printStackTrace();
		}
		return null;
	}

	
	/**
	* 解密
	* @param src byte[]
	* @param password String
	* @return byte[]
	* @throws Exception
	*/
	public static byte[] decrypt(byte[] src) throws Exception {
		// DES算法要求有一个可信任的随机数源
		SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG" );
        secureRandom.setSeed(key.getBytes());
		// 创建一个DESKeySpec对象
		DESKeySpec desKey = new DESKeySpec(key.getBytes());
		// 创建一个密匙工厂
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		// 将DESKeySpec对象转换成SecretKey对象
		SecretKey securekey = keyFactory.generateSecret(desKey);
		// Cipher对象实际完成解密操作
		Cipher cipher = Cipher.getInstance("DES");
		// 用密匙初始化Cipher对象
		cipher.init(Cipher.DECRYPT_MODE, securekey, secureRandom);
		// 真正开始解密操作
		return cipher.doFinal(Base64Utils.decode(src));
	}
	

	public static void main(String[] args) throws Exception {
//		System.out.println("无<data>");
//		System.out.println(makeRemark("无<data>"));
//		System.out.println(U.verify(new String(U.decrypt("n/rnPq8US4g=".getBytes())), "7744", "dae65cb1e53359ee43e0948e0d318cb3"));
//		Integer a = new Integer(1);
//		Integer b = new Integer(1);
//		System.out.println(a==b);
//		Integer c = 1;
//		Integer d = 1;
//		System.out.println(c==d);
		//System.out.println(new String(U.encrypt((U.getTime("2019-03-29 14:46:00") + "-" + 1).getBytes())));
//		ArrayList<String> a = new ArrayList<String>();
//		a.add("a");
//		a.add("b");
//		a.add("a");
//		a.add("c");
//		a.add("c");
//		a.add("a");
//		for(int i = a.size() - 1;i >= 0;i --) {
//			if(a.get(i).equals("a")) {
//				a.remove(i);
//			}
//		}
//		for(int i = 0;i < a.size();i ++) {
//			if(a.get(i).equals("a")) {
//				a.remove(i);
//			}
//		}
		
		
		
		//System.out.println(U.compareTime("2019-01-16 15:21:00", "2019-01-15 15:21:00"));
		
		//System.out.println(U.addTimeHourNowDay("2019-01-15 14:45:59", (short)30, 0));
		//System.out.println(U.addTimeHourNowDay("2019-01-15 14:45:59", 0, (short)10));
		
		//System.out.println(U.count(new BigDecimal("10.00")));
		
		//System.out.println(U.md5Hex("225827" + "4132"));
		
		//BigDecimal bd = new BigDecimal("1342");
		//System.out.println(makeBd(bd));
		
		
		//System.out.println(generatorToken());
		//System.out.println(pricesShow(new BigDecimal("12224.564")));
		//System.out.println(getCurrentTimestamp());
//		System.out.println(new String(encrypt("118".getBytes())));
//		System.out.println(new String(decrypt("n/rnPq8US4g=".getBytes())));
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		arr.add(4);
//		arr.add(5);
//		for(Integer a : arr) {
//			System.out.println(a);
//		}
//		sort1(arr);
//		for(Integer a : arr) {
//			System.out.println(a);
//		}
		//System.out.println(countProfit(new BigDecimal(130), new BigDecimal(50), new BigDecimal(0.3)));
		//System.out.println(productNo("2018-09-05 15:16:23", "123456"));
		//System.out.println((((Math.random() * 9 + 1) * 100000)) + "");
		//System.out.println(U.verify("123456", "5213", "afa48da531396a9d6ea1a8ef9487d907"));
//		System.out.println(U.md5Hex("123456" + "1234").substring(27));
//		Date date = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(sdf.format(date));
//		PrintWriter pw = null;
//		try {
//			pw = new PrintWriter(new FileOutputStream(new File("D:/work/logs/a.txt"), true));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		pw.println(sdf.format(date));
//		pw.close();
		
//		ArrayList<Integer> photosNumsAl = new ArrayList<Integer>();
//		String[] str = "3,3,4".split(",");
//		photosNumsAl.add(0, Integer.parseInt(str[0]));
//		photosNumsAl.add(1, Integer.parseInt(str[1]));
//		photosNumsAl.add(2, Integer.parseInt(str[2]));
//		System.out.println(photosNumsAl.get(1));
		
//		XxdUser model = new XxdUser();
//		model.setBankCard("");
//		model.setBankLocation("aaaa");
//		cancelDisAbleStr(model);
//		System.out.println(Integer.parseInt(model.getBankCard()));
//		System.out.println(model.getBankLocation());
		
		System.out.println(getUrlHost("https://docs.open.alipay.com/api_1/koubei.trade.itemorder.query"));
		
	}
	
	/**
	 * 生成32位编码
	 * 
	 * @return string
	 */
	public static String getUUid() {
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}

	/**
	 * 获取IP
	 * 
	 * @param request
	 * @return
	 */
	public static String getRemortIP(HttpServletRequest request) {
		String remoteAddr = request.getRemoteAddr();
		String forwarded = request.getHeader("X-Forwarded-For");
		String realIp = request.getHeader("X-Real-IP");
		String ip = null;
		if (realIp == null) {
			if (forwarded == null) {
				ip = remoteAddr;
			} else {
				ip = remoteAddr + "/" + forwarded.split(",")[0];
			}
		} else {
			if (realIp.equals(forwarded)) {
				ip = realIp;
			} else {
				if (forwarded != null) {
					forwarded = forwarded.split(",")[0];
				}
				ip = realIp + "/" + forwarded;
			}
		}
		return ip;
	}

	/**
	 * SignStr 待签名字符串
	 * 
	 * @param params
	 * @return
	 */
	public static String createLinkString(Map<String, String> map) {
		List<String> keys = new ArrayList<String>(map.keySet());
		Collections.sort(keys);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < keys.size(); i++) {
			String key = keys.get(i);
			Object value = map.get(key);
			System.out.println("key::" + key + "::value::" + value);
			if ("sign".equals(key) || "sign_type".equals(key) || value == null || value == "") {
				continue;
			}
			if (i == keys.size() - 1) {
				sb.append(key).append("=").append(value);
			} else {
				sb.append(key).append("=").append(value).append("&");
			}
		}
		String sbStr = sb.toString();
		System.out.println("===========签名串：" + sbStr);
		return sbStr;
	}

	private static final String SYMBOLS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private static final Random RANDOM = new SecureRandom();

	/**
	 * XML格式字符串转换为Map
	 *
	 * @param strXML XML字符串
	 * @return XML数据转换后的Map
	 * @throws Exception
	 */
	public static HashMap<String, String> xmlToMap(String strXML) throws Exception {
		try {
			HashMap<String, String> data = new HashMap<String, String>();
			DocumentBuilder documentBuilder = WXPayXmlUtil.newDocumentBuilder();
			InputStream stream = new ByteArrayInputStream(strXML.getBytes("UTF-8"));
			org.w3c.dom.Document doc = documentBuilder.parse(stream);
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getDocumentElement().getChildNodes();
			for (int idx = 0; idx < nodeList.getLength(); ++idx) {
				Node node = nodeList.item(idx);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					org.w3c.dom.Element element = (org.w3c.dom.Element) node;
					data.put(element.getNodeName(), element.getTextContent());
				}
			}
			try {
				stream.close();
			} catch (Exception ex) {
				// do nothing
			}
			return data;
		} catch (Exception ex) {
			throw ex;
		}

	}

	/**
	 * 将Map转换为XML格式的字符串
	 *
	 * @param data Map类型数据
	 * @return XML格式的字符串
	 * @throws Exception
	 */
	public static String mapToXml(Map<String, String> data) throws Exception {
		org.w3c.dom.Document document = WXPayXmlUtil.newDocument();
		org.w3c.dom.Element root = document.createElement("xml");
		document.appendChild(root);
		for (String key : data.keySet()) {
			String value = data.get(key);
			if (value == null) {
				value = "";
			}
			value = value.trim();
			org.w3c.dom.Element filed = document.createElement(key);
			filed.appendChild(document.createTextNode(value));
			root.appendChild(filed);
		}
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		DOMSource source = new DOMSource(document);
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		transformer.transform(source, result);
		String output = writer.getBuffer().toString(); // .replaceAll("\n|\r", "");
		try {
			writer.close();
		} catch (Exception ex) {
		}
		return output;
	}

	/**
	 * 获取随机字符串 Nonce Str
	 *
	 * @return String 随机字符串
	 */
	public static String generateNonceStr() {
		char[] nonceChars = new char[32];
		for (int index = 0; index < nonceChars.length; ++index) {
			nonceChars[index] = SYMBOLS.charAt(RANDOM.nextInt(SYMBOLS.length()));
		}
		return new String(nonceChars);
	}

	/**
	 * 生成 MD5
	 *
	 * @param data 待处理数据
	 * @return MD5结果
	 */
	public static String MD5(String data) throws Exception {
		java.security.MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] array = md.digest(data.getBytes("UTF-8"));
		StringBuilder sb = new StringBuilder();
		for (byte item : array) {
			sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
		}
		return sb.toString().toUpperCase();
	}

	/**
	 * 生成 HMACSHA256
	 * 
	 * @param data 待处理数据
	 * @param key  密钥
	 * @return 加密结果
	 * @throws Exception
	 */
	public static String HMACSHA256(String data, String key) throws Exception {
		Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
		SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
		sha256_HMAC.init(secret_key);
		byte[] array = sha256_HMAC.doFinal(data.getBytes("UTF-8"));
		StringBuilder sb = new StringBuilder();
		for (byte item : array) {
			sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
		}
		return sb.toString().toUpperCase();
	}

	/**
	 * 获取当前时间戳,单位秒
	 * 
	 * @return
	 */
	public static long getCurrentTimestamp() {
		return System.currentTimeMillis() / 1000;
	}

	/**
	 * 获取当前时间戳,单位毫秒
	 * 
	 * @return
	 */
	public static long getCurrentTimestampMs() {
		return System.currentTimeMillis();
	}

	public static String makeRemark(String remark) {
		return remark.replaceAll("<data>", "");
	}
	
	
	
	public static String postXml(String url, String con) throws IOException {
		OkHttpClient okHttpClient = new OkHttpClient(); // 创建OkHttpClient对象
		RequestBody reqBody = RequestBody.create(MediaType.parse("application/xml; charset=utf-8"), con);
		Request request = new Request.Builder().url(url).post(reqBody).build(); // 创建一个请求
		Response response = okHttpClient.newCall(request).execute(); // 返回实体
		if (response.isSuccessful()) { // 判断是否成功
			return response.body().string();
		} else {
			return "";
		}
	}

	
	public static String getNotifyCon(int size, ServletInputStream inp) throws IOException {
		// 用于缓存每次读取的数据  
        byte[] buffer = new byte[size];  
        // 用于存放结果的数组  
        byte[] xmldataByte = new byte[size];  
        int count = 0;  
        int rbyte = 0;  
        // 循环读取  
        while (count < size) {   
            // 每次实际读取长度存于rbyte中  
            rbyte = inp.read(buffer);   
            for(int i=0;i<rbyte;i++) {
                xmldataByte[count + i] = buffer[i];
            }  
            count += rbyte;  
        }
        return new String(xmldataByte, "UTF-8"); 
	}
	
	public static void wxNotifyReturn(PrintWriter pw) throws Exception {
		Map<String, String> xml = new HashMap<String, String>();
		xml.put("return_code", "SUCCESS");
		xml.put("return_msg", "OK");
		pw.print(U.mapToXml(xml));
		pw.close();
	}
	
//	public static void alipayRefund(XxdBuyOrderWxpay buyOrderAlipay, String reason) throws Exception{
//		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, "RSA2");
//		AlipayTradeRefundRequest request = new AlipayTradeRefundRequest();
//		request.setBizContent("{" +
//		"\"out_trade_no\":\""+buyOrderAlipay.getOutTradeNo()+"\"," +
//		"\"trade_no\":\""+buyOrderAlipay.getTransactionId()+"\"," +
//		"\"refund_amount\":"+buyOrderAlipay.getTotalFee()+"," +
//		"\"refund_reason\":\""+reason+"\"" +
//		"}");
//		AlipayTradeRefundResponse response = alipayClient.execute(request);
//		if(response.isSuccess()){
//			U.logAction("支付宝拼团失败退款成功！退款单号："+buyOrderAlipay.getBuy_order_id());
//		} else {
//			U.logAction("支付宝拼团失败退款失败！退款单号："+buyOrderAlipay.getBuy_order_id());
//		}
//	}
//	
//	public static void wxpayRefund(XxdBuyOrderWxpay buyOrderWxpay, String reason, String out_refund_no) throws Exception {
//		HashMap<String, String> reqMap = new HashMap<String, String>();
//		reqMap.put("appid", Constans.APPID);
//		reqMap.put("mch_id", Constans.MCHID);
//		reqMap.put("nonce_str", U.generateNonceStr());
//		reqMap.put("out_trade_no", buyOrderWxpay.getOutTradeNo());
//		reqMap.put("transaction_id", buyOrderWxpay.getTransactionId());
//		reqMap.put("out_refund_no", out_refund_no);
//		BigDecimal am = buyOrderWxpay.getTotalFee().multiply(new BigDecimal(100));
//		reqMap.put("total_fee", am.toBigInteger().toString());
//		reqMap.put("refund_fee", am.toBigInteger().toString());
//		reqMap.put("refund_desc", reason);
//		reqMap.put("notify_url", Constans.WXNOTIFY[4]);
//		reqMap.put("op_user_id", "0");
//		String md5str = U.createLinkString(reqMap);// 排序
//		String sign = MD5Tool.md5(md5str + "&key=" + Constans.APIKEY, Constans.CHARSET).toUpperCase();// 签名并转大写
//		reqMap.put("sign", sign);
//		
//		String reqXml = U.mapToXml(reqMap);
//		U.logAction(reqXml);
//		String resXml = U.posts(Constans.WXREFUND, reqXml);
//		U.logAction("拼团失败退款微信发起的退款请求的结果是："+resXml);
//		
//		HashMap<String, String> resMap = U.xmlToMap(resXml);
//		
//		HashMap<String, Object> makeResult = U.makeWxAppPayResult(reqMap, resMap);
//		
//		if(null == makeResult) {
//			//当微信支付本身系统出错，我们只需要重新请求一次即可
//			makeResult = U.makeWxAppPayResult(reqMap, resMap);
//		}
//		if(null == makeResult) {
//			//返回信息为微信支付官方问题
//			U.logAction("微信退款，微信系统错误！关联信息out_trade_no:"+buyOrderWxpay.getOutTradeNo());
//		}
//	}
	
	/**
	 * url提取host
	 * @param url
	 * @return
	 */
	public static String urlToHost(String url) {
		url = url.replaceAll("https://", "").replaceAll("http://", "").replaceAll("//", "");
		return url.substring(0, url.indexOf("/"));
	}
	
	public static String getUrlHost(String url) {
		url = url.replaceAll("https://", "").replaceAll("http://", "").replaceAll("//", "");
		url = url.substring(0, url.indexOf("/"));
		url = url.replaceAll(".com", "");
		return url.substring(url.lastIndexOf(".") + 1, url.length());
	}
	
}

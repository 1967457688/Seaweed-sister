package com.luolight.SeaweedS.controllers;

import java.io.IOException;
import java.util.HashMap;

import com.luolight.SeaweedS.services.impls.MainSI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luolight.SeaweedS.models.SsUser;
import com.luolight.SeaweedS.services.impls.SsUserSI;
import com.luolight.SeaweedS.utils.Constans;

@Controller
@RequestMapping(value = "/main", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
@ResponseBody
@CrossOrigin(origins = "*")
public class MainC {
	
	@Autowired
	private MainSI mainSI;

	@Autowired
	private SsUserSI userService;

	/**
	 * 检测url
	 * 返回代号-2
	 * @return
	 */
	@PostMapping("/getCheckUrl")
	@ResponseBody
	public HashMap<String, Object> getCheckUrl(String url){
		if(null == url) {
			return Constans.returnNullParamCon();
		}
		return mainSI.getCheckUrl(url);
	}
	
	/**
	 * 通过url生成html
	 * 返回代号-3
	 * @param url
	 * @return
	 * @throws IOException
	 */
	@PostMapping("/productHtml")
	@ResponseBody
	public HashMap<String, Object> productHtml(String url) throws IOException{
		if(null == url) {
			return Constans.returnNullParamCon();
		}
		return mainSI.productHtml(url);
	}
	
	
	/**
	 * 登录
	 * 返回代号-1
	 * @param ssUser
	 * @return
	 */
	@PostMapping("/login")
	@ResponseBody
	public HashMap<String, Object> login(SsUser ssUser){
		return mainSI.login(ssUser);
	}
	
	/**
	 * 注册
	 * 返回代号-4
	 * @param ssUser
	 * @return
	 */
	@PostMapping("/register")
	@ResponseBody
	public HashMap<String, Object> register(SsUser ssUser){
		mainSI.register(ssUser);
		return Constans.returnCon(ssUser.getId(), "41", null);
	}
	
	/**
	 * 完善资料
	 * 返回代号-5
	 * @param ssUser
	 * @return
	 */
	@PostMapping("/perfectInfo")
	@ResponseBody
	public HashMap<String, Object> perfectInfo(SsUser ssUser){
		mainSI.perfectInfo(ssUser);
		return Constans.returnCon(null, "51", null);
	}
	
	
	
}
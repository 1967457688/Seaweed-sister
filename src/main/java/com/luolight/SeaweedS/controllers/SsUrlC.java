package com.luolight.SeaweedS.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luolight.SeaweedS.models.SsUrl;
import com.luolight.SeaweedS.services.impls.SsUrlSI;
import com.luolight.SeaweedS.utils.Constans;

@Controller
@RequestMapping(value = "SsUrl",produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
public class SsUrlC {

	@Autowired
	private SsUrlSI serviceImpl;

	@RequestMapping(value = "/insert")
	@ResponseBody
	public HashMap<String, Object> insert(SsUrl model){
		Integer con = serviceImpl.insert(model);
		return Constans.returnCon(con, Constans.SUCCESS[0], Constans.SUCCESS[1]);
	}

	@RequestMapping(value = "/deleteByPrimaryKey")
	@ResponseBody
	public HashMap<String, Object> deleteByPrimaryKey(Integer primaryKey){
		Integer con = serviceImpl.deleteByPrimaryKey(primaryKey);
		return Constans.returnCon(con, Constans.SUCCESS[0], Constans.SUCCESS[1]);
	}

	@RequestMapping(value = "/updateByPrimaryKeySelective")
	@ResponseBody
	public HashMap<String, Object> updateByPrimaryKeySelective(SsUrl model){
		Integer con = serviceImpl.updateByPrimaryKeySelective(model);
		return Constans.returnCon(con, Constans.SUCCESS[0], Constans.SUCCESS[1]);
	}

	@RequestMapping(value = "/selectByPrimaryKey")
	@ResponseBody
	public HashMap<String, Object> selectByPrimaryKey(Integer primaryKey){
		SsUrl con = serviceImpl.selectByPrimaryKey(primaryKey);
		return Constans.returnCon(con, Constans.SUCCESS[0], Constans.SUCCESS[1]);
	}

	@RequestMapping(value = "/selectAll")
	@ResponseBody
	public HashMap<String, Object> selectAll(){
		ArrayList<SsUrl> con = serviceImpl.selectAll();
		return Constans.returnCon(con, Constans.SUCCESS[0], Constans.SUCCESS[1]);
	}

}

package com.luolight.SeaweedS.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luolight.SeaweedS.models.SsStructureType;
import com.luolight.SeaweedS.services.impls.SsStructureTypeSI;
import com.luolight.SeaweedS.utils.Constans;

@Controller
@RequestMapping(value = "SsStructureType",produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
public class SsStructureTypeC {

	@Autowired
	private SsStructureTypeSI serviceImpl;

	@RequestMapping(value = "/insert")
	@ResponseBody
	public HashMap<String, Object> insert(SsStructureType model){
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
	public HashMap<String, Object> updateByPrimaryKeySelective(SsStructureType model){
		Integer con = serviceImpl.updateByPrimaryKeySelective(model);
		return Constans.returnCon(con, Constans.SUCCESS[0], Constans.SUCCESS[1]);
	}

	@RequestMapping(value = "/selectByPrimaryKey")
	@ResponseBody
	public HashMap<String, Object> selectByPrimaryKey(Integer primaryKey){
		SsStructureType con = serviceImpl.selectByPrimaryKey(primaryKey);
		return Constans.returnCon(con, Constans.SUCCESS[0], Constans.SUCCESS[1]);
	}

	@RequestMapping(value = "/selectAll")
	@ResponseBody
	public HashMap<String, Object> selectAll(){
		ArrayList<SsStructureType> con = serviceImpl.selectAll();
		return Constans.returnCon(con, Constans.SUCCESS[0], Constans.SUCCESS[1]);
	}

}

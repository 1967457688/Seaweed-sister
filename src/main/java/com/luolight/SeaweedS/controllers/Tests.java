package com.luolight.SeaweedS.controllers;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luolight.SeaweedS.utils.Constans;

@Controller
@RequestMapping(value = "/tests",produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
@ResponseBody
public class Tests {

	@PostMapping("/tests1")
	public HashMap<String, Object> tests1(){
		return Constans.returnCon(null, Constans.SUCCESS[0], Constans.SUCCESS[1]);
	}
}

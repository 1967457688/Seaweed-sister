package com.luolight.SeaweedS.controllers.luolight;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/luolight", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
@ResponseBody
@CrossOrigin(origins = "*")
public class SystemInfoC {



}

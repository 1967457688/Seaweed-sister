package com.luolight.SeaweedS.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class GeneratorsClassFile {
	
	/**
	 * 自动生成固定service接口
	 * @param name
	 * @throws IOException
	 */
	public static void generatorS(String name) throws IOException {
		File file = new File("D:/work/myEclipse1/workspace1/Seaweed-sister/src/main/java/com/luolight/SeaweedS/services/"+name+"S.java");
		if(!file.exists()) file.createNewFile();
		PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));
		//定义package
		pw.println("package com.luolight.SeaweedS.services;");
		pw.println();
		//导包
		pw.println("import java.util.ArrayList;");
		pw.println();
		pw.println("import com.luolight.SeaweedS.models."+name+";");
		pw.println();
		//�?始编写类
		pw.println("public interface "+name+"S {");
		pw.println();
		//增加抽象方法
		pw.println("	public Integer insert("+name+" model);");
		pw.println();
		//删除抽象方法
		pw.println("	public Integer deleteByPrimaryKey(Integer primaryKey);");
		pw.println();
		//修改抽象方法
		pw.println("	public Integer updateByPrimaryKeySelective("+name+" model);");
		pw.println();
		//查询方法
		pw.println("	public "+name+" selectByPrimaryKey(Integer primaryKey);");
		pw.println();
		pw.println("	public ArrayList<"+name+"> selectAll();");
		//结束
		pw.println();
		pw.println("}");
		pw.close();
	}
	
	/**
	 * 自动生成固定的service实现�?
	 * @param name
	 * @throws IOException
	 */
	public static void generatorSI(String name) throws IOException {
		File file = new File("D:/work/myEclipse1/workspace1/Seaweed-sister/src/main/java/com/luolight/SeaweedS/services/impls/"+name+"SI.java");
		if(!file.exists()) file.createNewFile();
		PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));
		//定义package
		pw.println("package com.luolight.SeaweedS.services.impls;");
		pw.println();
		//导包
		pw.println("import java.util.ArrayList;");
		pw.println();
		pw.println("import org.springframework.beans.factory.annotation.Autowired;");
		pw.println("import org.springframework.stereotype.Service;");
		pw.println();
		pw.println("import com.luolight.SeaweedS.mappers."+name+"Mapper;");
		pw.println("import com.luolight.SeaweedS.models."+name+";");
		pw.println("import com.luolight.SeaweedS.services."+name+"S;");
		pw.println();
		//注解service
		pw.println("@Service");
		//�?始编写类
		pw.println("public class "+name+"SI implements "+name+"S{");
		pw.println();
		//注入mapper
		pw.println("	@Autowired");
		pw.println("	private "+name+"Mapper mapper;");
		pw.println();
		//增加实现方法
		pw.println("	@Override");
		pw.println("	public Integer insert("+name+" model) {");
		pw.println("		return mapper.insert(model);");
		pw.println("	}");
		pw.println();
		//删除实现方法
		pw.println("	@Override");
		pw.println("	public Integer deleteByPrimaryKey(Integer primaryKey) {");
		pw.println("		return mapper.deleteByPrimaryKey(primaryKey);");
		pw.println("	}");
		pw.println();
		//修改实现方法
		pw.println("	@Override");
		pw.println("	public Integer updateByPrimaryKeySelective("+name+" model) {");
		pw.println("		return mapper.updateByPrimaryKeySelective(model);");
		pw.println("	}");
		pw.println();
		//查询实现方法
		pw.println("	@Override");
		pw.println("	public "+name+" selectByPrimaryKey(Integer primaryKey) {");
		pw.println("		return mapper.selectByPrimaryKey(primaryKey);");
		pw.println("	}");
		pw.println();
		pw.println("	@Override");
		pw.println("	public ArrayList<"+name+"> selectAll() {");
		//pw.println("		return mapper.selectAll();");
		pw.println("		return null;");
		pw.println("	}");
		//结束
		pw.println();
		pw.println("}");
		pw.close();
	}
	
	/**
	 * 自定义生成固定controller
	 * @param name
	 * @throws IOException 
	 */
	public static void generatorC(String name) throws IOException {
		File file = new File("D:/work/myEclipse1/workspace1/Seaweed-sister/src/main/java/com/luolight/SeaweedS/controllers/"+name+"C.java");
		if(!file.exists()) file.createNewFile();
		PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));
		//定义package
		pw.println("package com.luolight.SeaweedS.controllers;");
		pw.println();
		//导包
		pw.println("import java.util.ArrayList;");
		pw.println("import java.util.HashMap;");
		pw.println();
		pw.println("import org.springframework.beans.factory.annotation.Autowired;");
		pw.println("import org.springframework.stereotype.Controller;");
		pw.println("import org.springframework.web.bind.annotation.RequestMapping;");
		pw.println("import org.springframework.web.bind.annotation.ResponseBody;");
		pw.println("import org.springframework.web.bind.annotation.RequestMethod;");
		pw.println();
		pw.println("import com.luolight.SeaweedS.models."+name+";");
		pw.println("import com.luolight.SeaweedS.services.impls."+name+"SI;");
		pw.println("import com.luolight.SeaweedS.utils.Constans;");
		pw.println();
		//注解service
		pw.println("@Controller");
		pw.println("@RequestMapping(value = \""+name+"\",produces = \"application/json;charset=UTF-8\", method = RequestMethod.POST)");
		//�?始编写类
		pw.println("public class "+name+"C {");
		pw.println();
		//注入mapper
		pw.println("	@Autowired");
		pw.println("	private "+name+"SI serviceImpl;");
		pw.println();
		//增加
		pw.println("	@RequestMapping(value = \"/insert\")");
		pw.println("	@ResponseBody");
		pw.println("	public HashMap<String, Object> insert("+name+" model){");
		pw.println("		Integer con = serviceImpl.insert(model);");
		pw.println("		return Constans.returnCon(con, Constans.SUCCESS[0], Constans.SUCCESS[1]);");
		pw.println("	}");
		pw.println();
		//删除
		pw.println("	@RequestMapping(value = \"/deleteByPrimaryKey\")");
		pw.println("	@ResponseBody");
		pw.println("	public HashMap<String, Object> deleteByPrimaryKey(Integer primaryKey){");
		pw.println("		Integer con = serviceImpl.deleteByPrimaryKey(primaryKey);");
		pw.println("		return Constans.returnCon(con, Constans.SUCCESS[0], Constans.SUCCESS[1]);");
		pw.println("	}");
		pw.println();
		//修改
		pw.println("	@RequestMapping(value = \"/updateByPrimaryKeySelective\")");
		pw.println("	@ResponseBody");
		pw.println("	public HashMap<String, Object> updateByPrimaryKeySelective("+name+" model){");
		pw.println("		Integer con = serviceImpl.updateByPrimaryKeySelective(model);");
		pw.println("		return Constans.returnCon(con, Constans.SUCCESS[0], Constans.SUCCESS[1]);");
		pw.println("	}");
		pw.println();
		//查询
		pw.println("	@RequestMapping(value = \"/selectByPrimaryKey\")");
		pw.println("	@ResponseBody");
		pw.println("	public HashMap<String, Object> selectByPrimaryKey(Integer primaryKey){");
		pw.println("		"+name+" con = serviceImpl.selectByPrimaryKey(primaryKey);");
		pw.println("		return Constans.returnCon(con, Constans.SUCCESS[0], Constans.SUCCESS[1]);");
		pw.println("	}");
		pw.println();
		pw.println("	@RequestMapping(value = \"/selectAll\")");
		pw.println("	@ResponseBody");
		pw.println("	public HashMap<String, Object> selectAll(){");
		pw.println("		ArrayList<"+name+"> con = serviceImpl.selectAll();");
		pw.println("		return Constans.returnCon(con, Constans.SUCCESS[0], Constans.SUCCESS[1]);");
		pw.println("	}");
		//结束
		pw.println();
		pw.println("}");
		pw.close();
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\work\\myEclipse1\\workspace1\\Seaweed-sister\\src\\main\\java\\com\\luolight\\SeaweedS\\models");
		String[] strs = file.list();
//		String[] strs = {"XxdAlirefund", "XxdWxrefund"};
		//for(String str : strs) {
			//String className = str.replace(".java", "");
			//generatorS(className);
			//generatorSI(className);
			//generatorC(className);
		//}
		generatorS("SsUrl");
		generatorSI("SsUrl");
		generatorC("SsUrl");
		
		//generatorS("XxdUserAlipay");
		//generatorSI("XxdUserAlipay");
	}

}
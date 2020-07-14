package com.luolight.SeaweedS.services;

import java.util.ArrayList;

import com.luolight.SeaweedS.models.SsModule;

public interface SsModuleS {

	public Integer insert(SsModule model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(SsModule model);

	public SsModule selectByPrimaryKey(Integer primaryKey);

	public ArrayList<SsModule> selectAll();

	public SsModule selectByUrlHost(String urlHost);
	
}

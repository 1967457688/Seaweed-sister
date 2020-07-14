package com.luolight.SeaweedS.services;

import java.util.ArrayList;

import com.luolight.SeaweedS.models.SsModuleGood;

public interface SsModuleGoodS {

	public Integer insert(SsModuleGood model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(SsModuleGood model);

	public SsModuleGood selectByPrimaryKey(Integer primaryKey);

	public ArrayList<SsModuleGood> selectAll();

}

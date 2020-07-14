package com.luolight.SeaweedS.services;

import java.util.ArrayList;

import com.luolight.SeaweedS.models.SsModuleUser;

public interface SsModuleUserS {

	public Integer insert(SsModuleUser model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(SsModuleUser model);

	public SsModuleUser selectByPrimaryKey(Integer primaryKey);

	public ArrayList<SsModuleUser> selectAll();

}

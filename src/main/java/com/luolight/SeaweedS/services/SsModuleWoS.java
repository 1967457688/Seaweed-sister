package com.luolight.SeaweedS.services;

import java.util.ArrayList;

import com.luolight.SeaweedS.models.SsModuleWo;

public interface SsModuleWoS {

	public Integer insert(SsModuleWo model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(SsModuleWo model);

	public SsModuleWo selectByPrimaryKey(Integer primaryKey);

	public ArrayList<SsModuleWo> selectAll();

}

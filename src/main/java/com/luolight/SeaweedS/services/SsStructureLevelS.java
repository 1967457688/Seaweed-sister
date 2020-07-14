package com.luolight.SeaweedS.services;

import java.util.ArrayList;

import com.luolight.SeaweedS.models.SsStructureLevel;

public interface SsStructureLevelS {

	public Integer insert(SsStructureLevel model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(SsStructureLevel model);

	public SsStructureLevel selectByPrimaryKey(Integer primaryKey);

	public ArrayList<SsStructureLevel> selectAll();

}

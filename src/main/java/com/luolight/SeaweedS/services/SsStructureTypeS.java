package com.luolight.SeaweedS.services;

import java.util.ArrayList;

import com.luolight.SeaweedS.models.SsStructureType;

public interface SsStructureTypeS {

	public Integer insert(SsStructureType model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(SsStructureType model);

	public SsStructureType selectByPrimaryKey(Integer primaryKey);

	public ArrayList<SsStructureType> selectAll();

}

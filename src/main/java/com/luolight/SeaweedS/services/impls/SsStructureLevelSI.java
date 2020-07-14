package com.luolight.SeaweedS.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luolight.SeaweedS.mappers.SsStructureLevelMapper;
import com.luolight.SeaweedS.models.SsStructureLevel;
import com.luolight.SeaweedS.services.SsStructureLevelS;

@Service
public class SsStructureLevelSI implements SsStructureLevelS{

	@Autowired
	private SsStructureLevelMapper mapper;

	@Override
	public Integer insert(SsStructureLevel model) {
		return mapper.insert(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(SsStructureLevel model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public SsStructureLevel selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<SsStructureLevel> selectAll() {
		return null;
	}

}

package com.luolight.SeaweedS.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luolight.SeaweedS.mappers.SsStructureTypeMapper;
import com.luolight.SeaweedS.models.SsStructureType;
import com.luolight.SeaweedS.services.SsStructureTypeS;

@Service
public class SsStructureTypeSI implements SsStructureTypeS{

	@Autowired
	private SsStructureTypeMapper mapper;

	@Override
	public Integer insert(SsStructureType model) {
		return mapper.insert(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(SsStructureType model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public SsStructureType selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<SsStructureType> selectAll() {
		return null;
	}

}

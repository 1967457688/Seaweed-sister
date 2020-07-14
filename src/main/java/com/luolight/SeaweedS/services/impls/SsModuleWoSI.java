package com.luolight.SeaweedS.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luolight.SeaweedS.mappers.SsModuleWoMapper;
import com.luolight.SeaweedS.models.SsModuleWo;
import com.luolight.SeaweedS.services.SsModuleWoS;

@Service
public class SsModuleWoSI implements SsModuleWoS{

	@Autowired
	private SsModuleWoMapper mapper;

	@Override
	public Integer insert(SsModuleWo model) {
		return mapper.insert(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(SsModuleWo model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public SsModuleWo selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<SsModuleWo> selectAll() {
		return null;
	}

}

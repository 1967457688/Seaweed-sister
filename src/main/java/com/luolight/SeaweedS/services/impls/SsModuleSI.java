package com.luolight.SeaweedS.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luolight.SeaweedS.mappers.SsModuleMapper;
import com.luolight.SeaweedS.models.SsModule;
import com.luolight.SeaweedS.services.SsModuleS;

@Service
public class SsModuleSI implements SsModuleS{

	@Autowired
	private SsModuleMapper mapper;

	@Override
	public Integer insert(SsModule model) {
		return mapper.insert(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(SsModule model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public SsModule selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<SsModule> selectAll() {
		return null;
	}

	@Override
	public SsModule selectByUrlHost(String urlHost) {
		return mapper.selectByUrlHost(urlHost);
	}

}

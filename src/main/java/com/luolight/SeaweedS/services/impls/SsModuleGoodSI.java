package com.luolight.SeaweedS.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luolight.SeaweedS.mappers.SsModuleGoodMapper;
import com.luolight.SeaweedS.models.SsModuleGood;
import com.luolight.SeaweedS.services.SsModuleGoodS;

@Service
public class SsModuleGoodSI implements SsModuleGoodS{

	@Autowired
	private SsModuleGoodMapper mapper;

	@Override
	public Integer insert(SsModuleGood model) {
		return mapper.insert(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(SsModuleGood model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public SsModuleGood selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<SsModuleGood> selectAll() {
		return null;
	}

}

package com.luolight.SeaweedS.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luolight.SeaweedS.mappers.SsModuleUserMapper;
import com.luolight.SeaweedS.models.SsModuleUser;
import com.luolight.SeaweedS.services.SsModuleUserS;

@Service
public class SsModuleUserSI implements SsModuleUserS{

	@Autowired
	private SsModuleUserMapper mapper;

	@Override
	public Integer insert(SsModuleUser model) {
		return mapper.insert(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(SsModuleUser model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public SsModuleUser selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<SsModuleUser> selectAll() {
		return null;
	}

}

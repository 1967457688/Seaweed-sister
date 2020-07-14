package com.luolight.SeaweedS.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luolight.SeaweedS.mappers.SsUserMapper;
import com.luolight.SeaweedS.models.SsUser;
import com.luolight.SeaweedS.services.SsUserS;

@Service
public class SsUserSI implements SsUserS{

	@Autowired
	private SsUserMapper mapper;

	@Override
	public Integer insert(SsUser model) {
		return mapper.insert(model);
	}

	@Override
	public Integer insertSelective(SsUser model) {
		return mapper.insertSelective(model);
	}
	
	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(SsUser model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public SsUser selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<SsUser> selectAll() {
		return null;
	}

	@Override
	public SsUser SelectByToken(String token) {
		// TODO Auto-generated method stub
		return mapper.SelectByToken(token);
	}
	
	@Override
	public SsUser selectByUsername(String username) {
		return mapper.selectByUsername(username);
	}

}

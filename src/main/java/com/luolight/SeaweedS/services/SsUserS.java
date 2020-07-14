package com.luolight.SeaweedS.services;

import java.util.ArrayList;

import com.luolight.SeaweedS.models.SsUser;

public interface SsUserS {

	public Integer insert(SsUser model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(SsUser model);

	public SsUser selectByPrimaryKey(Integer primaryKey);

	public ArrayList<SsUser> selectAll();
	
	public SsUser SelectByToken(String token);
	
	public SsUser selectByUsername(String username);
	
	public Integer insertSelective(SsUser model);

}

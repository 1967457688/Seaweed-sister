package com.luolight.SeaweedS.services;

import java.util.ArrayList;

import com.luolight.SeaweedS.models.SsUrl;

public interface SsUrlS {

	public Integer insert(SsUrl model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(SsUrl model);

	public SsUrl selectByPrimaryKey(Integer primaryKey);

	public ArrayList<SsUrl> selectAll();

	public SsUrl selectByUrlHost(String urlHost);
	
}

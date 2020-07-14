package com.luolight.SeaweedS.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luolight.SeaweedS.mappers.SsUrlMapper;
import com.luolight.SeaweedS.models.SsUrl;
import com.luolight.SeaweedS.services.SsUrlS;

@Service
public class SsUrlSI implements SsUrlS{

	@Autowired
	private SsUrlMapper mapper;

	@Override
	public Integer insert(SsUrl model) {
		return mapper.insert(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(SsUrl model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public SsUrl selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<SsUrl> selectAll() {
		return null;
	}

	@Override
	public SsUrl selectByUrlHost(String urlHost) {
		return mapper.selectByUrlHost(urlHost);
	}
	
}

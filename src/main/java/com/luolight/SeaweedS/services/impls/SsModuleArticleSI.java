package com.luolight.SeaweedS.services.impls;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luolight.SeaweedS.mappers.SsModuleArticleMapper;
import com.luolight.SeaweedS.models.SsModuleArticle;
import com.luolight.SeaweedS.services.SsModuleArticleS;

@Service
public class SsModuleArticleSI implements SsModuleArticleS{

	@Autowired
	private SsModuleArticleMapper mapper;

	@Override
	public Integer insert(SsModuleArticle model) {
		return mapper.insert(model);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer primaryKey) {
		return mapper.deleteByPrimaryKey(primaryKey);
	}

	@Override
	public Integer updateByPrimaryKeySelective(SsModuleArticle model) {
		return mapper.updateByPrimaryKeySelective(model);
	}

	@Override
	public SsModuleArticle selectByPrimaryKey(Integer primaryKey) {
		return mapper.selectByPrimaryKey(primaryKey);
	}

	@Override
	public ArrayList<SsModuleArticle> selectAll() {
		return null;
	}

}

package com.luolight.SeaweedS.services;

import java.util.ArrayList;

import com.luolight.SeaweedS.models.SsModuleArticle;

public interface SsModuleArticleS {

	public Integer insert(SsModuleArticle model);

	public Integer deleteByPrimaryKey(Integer primaryKey);

	public Integer updateByPrimaryKeySelective(SsModuleArticle model);

	public SsModuleArticle selectByPrimaryKey(Integer primaryKey);

	public ArrayList<SsModuleArticle> selectAll();

}

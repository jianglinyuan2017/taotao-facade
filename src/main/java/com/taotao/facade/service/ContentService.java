package com.taotao.facade.service;

import java.util.List;

import com.taotao.comm.util.TaotaoResult;
import com.taotao.pojo.TbContent;

public interface ContentService {
	
	public List<TbContent> getContentList(long contentCategoryId);
	
	public String getPageContentList();

}

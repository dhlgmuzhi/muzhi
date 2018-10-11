package com.muzhi.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muzhi.common.pojo.ClassificationResult;
import com.muzhi.common.pojo.MuZhiResult;
import com.muzhi.common.pojo.classification.menu1;
import com.muzhi.common.pojo.classification.menu2;
import com.muzhi.common.util.ExceptionUtil;
import com.muzhi.common.util.JsonUtils;
import com.muzhi.mapper.TbClassification1Mapper;
import com.muzhi.mapper.TbClassification2Mapper;
import com.muzhi.pojo.TbClassification1;
import com.muzhi.pojo.TbClassification1Example;
import com.muzhi.pojo.TbClassification2;
import com.muzhi.pojo.TbClassification2Example;
import com.muzhi.service.PageService;

/**
 * 后台添加商品Service
 * @author 陈汇奇
 *
 */
@Service
public class PageServiceImpl implements PageService {
	
	@Autowired
	private TbClassification1Mapper classification1Mapper;

	@Autowired
	private TbClassification2Mapper classification2Mapper;


	@Override
	public MuZhiResult getClissficationList() {
		try {
			TbClassification1Example example1 = new TbClassification1Example();
			List<TbClassification1> list1 = classification1Mapper.selectByExample(example1);

			TbClassification2Example example2 = new TbClassification2Example();
			List<TbClassification2> list2 = classification2Mapper.selectByExample(example2);
			
			//将数据结构化
			ClassificationResult result = new ClassificationResult();
			HashMap<String,List<menu2>> hashMap = new HashMap<String,List<menu2>>();
			
			for (TbClassification1 classification1 : list1) {
				
				List<menu2> menu2List = new ArrayList<menu2>();
				
				for(TbClassification2 classification2 : list2){
					//如果是父子关系，添加
					if(classification2.getParentId().longValue() == classification1.getId()){
						menu2List.add(new menu2(classification2.getName(), classification2.getId()));
					}
				}
			
				hashMap.put(classification1.getName(), menu2List);
			}
			
			//将数据设置到返回结果中
			result.setHashMap(hashMap);
			String json = JsonUtils.objectToJson(result);
			System.err.println(json);
			return MuZhiResult.ok(json);
		} catch (Exception e) {
			e.printStackTrace();
			return MuZhiResult.build(200, ExceptionUtil.getStackTrace(e));
		}
	}

}

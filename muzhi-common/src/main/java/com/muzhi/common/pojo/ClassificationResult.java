package com.muzhi.common.pojo;

import java.util.HashMap;
import java.util.List;

import com.muzhi.common.pojo.classification.menu1;
import com.muzhi.common.pojo.classification.menu2;

public class ClassificationResult {

	/*
	 * 一级菜单： 键（包含名称） --> 单个
	 * 二级菜单： 值（list<包含id，名称>） --> 多个（集合）
	 * 
	 */

	private HashMap<String, List<menu2>> hashMap;

	public HashMap<String, List<menu2>> getHashMap() {
		return hashMap;
	}

	public void setHashMap(HashMap<String, List<menu2>> hashMap) {
		this.hashMap = hashMap;
	}




}
package com.muzhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.muzhi.common.pojo.MuZhiResult;
import com.muzhi.service.PageService;

/**
 * 首页展示Controller
 * @author 陈汇奇
 *
 */
@Controller
public class PageController {

	@Autowired
	private PageService pageService;
	
	@RequestMapping("/{page}")
	public String showPageLogin(@PathVariable String page){
		return page;
	}


	@RequestMapping("/get/list")
	@ResponseBody
	public MuZhiResult getClissficationList(){
		MuZhiResult result = pageService.getClissficationList();
		return result;
	}
	
}

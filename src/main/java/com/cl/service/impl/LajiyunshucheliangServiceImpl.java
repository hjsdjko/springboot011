package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.LajiyunshucheliangDao;
import com.cl.entity.LajiyunshucheliangEntity;
import com.cl.service.LajiyunshucheliangService;
import com.cl.entity.view.LajiyunshucheliangView;

@Service("lajiyunshucheliangService")
public class LajiyunshucheliangServiceImpl extends ServiceImpl<LajiyunshucheliangDao, LajiyunshucheliangEntity> implements LajiyunshucheliangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LajiyunshucheliangEntity> page = this.selectPage(
                new Query<LajiyunshucheliangEntity>(params).getPage(),
                new EntityWrapper<LajiyunshucheliangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LajiyunshucheliangEntity> wrapper) {
		  Page<LajiyunshucheliangView> page =new Query<LajiyunshucheliangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<LajiyunshucheliangView> selectListView(Wrapper<LajiyunshucheliangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LajiyunshucheliangView selectView(Wrapper<LajiyunshucheliangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<LajiyunshucheliangEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<LajiyunshucheliangEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<LajiyunshucheliangEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}

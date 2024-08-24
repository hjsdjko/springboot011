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


import com.cl.dao.RenyuanxinxiDao;
import com.cl.entity.RenyuanxinxiEntity;
import com.cl.service.RenyuanxinxiService;
import com.cl.entity.view.RenyuanxinxiView;

@Service("renyuanxinxiService")
public class RenyuanxinxiServiceImpl extends ServiceImpl<RenyuanxinxiDao, RenyuanxinxiEntity> implements RenyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenyuanxinxiEntity> page = this.selectPage(
                new Query<RenyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<RenyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenyuanxinxiEntity> wrapper) {
		  Page<RenyuanxinxiView> page =new Query<RenyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<RenyuanxinxiView> selectListView(Wrapper<RenyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenyuanxinxiView selectView(Wrapper<RenyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

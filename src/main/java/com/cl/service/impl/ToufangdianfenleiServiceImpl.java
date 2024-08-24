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


import com.cl.dao.ToufangdianfenleiDao;
import com.cl.entity.ToufangdianfenleiEntity;
import com.cl.service.ToufangdianfenleiService;
import com.cl.entity.view.ToufangdianfenleiView;

@Service("toufangdianfenleiService")
public class ToufangdianfenleiServiceImpl extends ServiceImpl<ToufangdianfenleiDao, ToufangdianfenleiEntity> implements ToufangdianfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ToufangdianfenleiEntity> page = this.selectPage(
                new Query<ToufangdianfenleiEntity>(params).getPage(),
                new EntityWrapper<ToufangdianfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ToufangdianfenleiEntity> wrapper) {
		  Page<ToufangdianfenleiView> page =new Query<ToufangdianfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ToufangdianfenleiView> selectListView(Wrapper<ToufangdianfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ToufangdianfenleiView selectView(Wrapper<ToufangdianfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

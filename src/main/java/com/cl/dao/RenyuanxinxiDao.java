package com.cl.dao;

import com.cl.entity.RenyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.RenyuanxinxiView;


/**
 * 人员信息
 * 
 * @author 
 * @email 
 * @date 2024-05-06 11:50:50
 */
public interface RenyuanxinxiDao extends BaseMapper<RenyuanxinxiEntity> {
	
	List<RenyuanxinxiView> selectListView(@Param("ew") Wrapper<RenyuanxinxiEntity> wrapper);

	List<RenyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<RenyuanxinxiEntity> wrapper);
	
	RenyuanxinxiView selectView(@Param("ew") Wrapper<RenyuanxinxiEntity> wrapper);
	

}

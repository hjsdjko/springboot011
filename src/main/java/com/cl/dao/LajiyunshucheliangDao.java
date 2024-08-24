package com.cl.dao;

import com.cl.entity.LajiyunshucheliangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LajiyunshucheliangView;


/**
 * 垃圾运输车辆
 * 
 * @author 
 * @email 
 * @date 2024-05-06 11:50:50
 */
public interface LajiyunshucheliangDao extends BaseMapper<LajiyunshucheliangEntity> {
	
	List<LajiyunshucheliangView> selectListView(@Param("ew") Wrapper<LajiyunshucheliangEntity> wrapper);

	List<LajiyunshucheliangView> selectListView(Pagination page,@Param("ew") Wrapper<LajiyunshucheliangEntity> wrapper);
	
	LajiyunshucheliangView selectView(@Param("ew") Wrapper<LajiyunshucheliangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LajiyunshucheliangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LajiyunshucheliangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LajiyunshucheliangEntity> wrapper);



}

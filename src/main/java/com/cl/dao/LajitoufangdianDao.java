package com.cl.dao;

import com.cl.entity.LajitoufangdianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LajitoufangdianView;


/**
 * 垃圾投放点
 * 
 * @author 
 * @email 
 * @date 2024-05-06 11:50:50
 */
public interface LajitoufangdianDao extends BaseMapper<LajitoufangdianEntity> {
	
	List<LajitoufangdianView> selectListView(@Param("ew") Wrapper<LajitoufangdianEntity> wrapper);

	List<LajitoufangdianView> selectListView(Pagination page,@Param("ew") Wrapper<LajitoufangdianEntity> wrapper);
	
	LajitoufangdianView selectView(@Param("ew") Wrapper<LajitoufangdianEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LajitoufangdianEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LajitoufangdianEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LajitoufangdianEntity> wrapper);



}

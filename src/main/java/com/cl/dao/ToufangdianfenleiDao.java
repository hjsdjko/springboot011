package com.cl.dao;

import com.cl.entity.ToufangdianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ToufangdianfenleiView;


/**
 * 投放点分类
 * 
 * @author 
 * @email 
 * @date 2024-05-06 11:50:50
 */
public interface ToufangdianfenleiDao extends BaseMapper<ToufangdianfenleiEntity> {
	
	List<ToufangdianfenleiView> selectListView(@Param("ew") Wrapper<ToufangdianfenleiEntity> wrapper);

	List<ToufangdianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ToufangdianfenleiEntity> wrapper);
	
	ToufangdianfenleiView selectView(@Param("ew") Wrapper<ToufangdianfenleiEntity> wrapper);
	

}

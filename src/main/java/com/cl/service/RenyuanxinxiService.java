package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.RenyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.RenyuanxinxiView;


/**
 * 人员信息
 *
 * @author 
 * @email 
 * @date 2024-05-06 11:50:50
 */
public interface RenyuanxinxiService extends IService<RenyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenyuanxinxiView> selectListView(Wrapper<RenyuanxinxiEntity> wrapper);
   	
   	RenyuanxinxiView selectView(@Param("ew") Wrapper<RenyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenyuanxinxiEntity> wrapper);
   	

}


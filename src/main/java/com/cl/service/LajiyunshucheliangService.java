package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.LajiyunshucheliangEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LajiyunshucheliangView;


/**
 * 垃圾运输车辆
 *
 * @author 
 * @email 
 * @date 2024-05-06 11:50:50
 */
public interface LajiyunshucheliangService extends IService<LajiyunshucheliangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LajiyunshucheliangView> selectListView(Wrapper<LajiyunshucheliangEntity> wrapper);
   	
   	LajiyunshucheliangView selectView(@Param("ew") Wrapper<LajiyunshucheliangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LajiyunshucheliangEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<LajiyunshucheliangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<LajiyunshucheliangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<LajiyunshucheliangEntity> wrapper);



}


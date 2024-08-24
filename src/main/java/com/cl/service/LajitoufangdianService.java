package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.LajitoufangdianEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LajitoufangdianView;


/**
 * 垃圾投放点
 *
 * @author 
 * @email 
 * @date 2024-05-06 11:50:50
 */
public interface LajitoufangdianService extends IService<LajitoufangdianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LajitoufangdianView> selectListView(Wrapper<LajitoufangdianEntity> wrapper);
   	
   	LajitoufangdianView selectView(@Param("ew") Wrapper<LajitoufangdianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LajitoufangdianEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<LajitoufangdianEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<LajitoufangdianEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<LajitoufangdianEntity> wrapper);



}


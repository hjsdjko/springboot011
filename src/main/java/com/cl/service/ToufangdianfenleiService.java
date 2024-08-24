package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ToufangdianfenleiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ToufangdianfenleiView;


/**
 * 投放点分类
 *
 * @author 
 * @email 
 * @date 2024-05-06 11:50:50
 */
public interface ToufangdianfenleiService extends IService<ToufangdianfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ToufangdianfenleiView> selectListView(Wrapper<ToufangdianfenleiEntity> wrapper);
   	
   	ToufangdianfenleiView selectView(@Param("ew") Wrapper<ToufangdianfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ToufangdianfenleiEntity> wrapper);
   	

}


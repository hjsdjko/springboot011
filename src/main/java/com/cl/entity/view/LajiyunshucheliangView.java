package com.cl.entity.view;

import com.cl.entity.LajiyunshucheliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 垃圾运输车辆
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-05-06 11:50:50
 */
@TableName("lajiyunshucheliang")
public class LajiyunshucheliangView  extends LajiyunshucheliangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LajiyunshucheliangView(){
	}
 
 	public LajiyunshucheliangView(LajiyunshucheliangEntity lajiyunshucheliangEntity){
 	try {
			BeanUtils.copyProperties(this, lajiyunshucheliangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}

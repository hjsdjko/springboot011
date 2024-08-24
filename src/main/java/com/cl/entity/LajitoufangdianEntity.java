package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 垃圾投放点
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-05-06 11:50:50
 */
@TableName("lajitoufangdian")
public class LajitoufangdianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LajitoufangdianEntity() {
		
	}
	
	public LajitoufangdianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 投放点名称
	 */
					
	private String toufangdianmingcheng;
	
	/**
	 * 投放点图片
	 */
					
	private String toufangdiantupian;
	
	/**
	 * 投放点分类
	 */
					
	private String toufangdianfenlei;
	
	/**
	 * 容量/m³
	 */
					
	private Double rongliang;
	
	/**
	 * 开放时间
	 */
					
	private String kaifangshijian;
	
	/**
	 * 经度
	 */
					
	private Double longitude;
	
	/**
	 * 纬度
	 */
					
	private Double latitude;
	
	/**
	 * 地址
	 */
					
	private String fulladdress;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：投放点名称
	 */
	public void setToufangdianmingcheng(String toufangdianmingcheng) {
		this.toufangdianmingcheng = toufangdianmingcheng;
	}
	/**
	 * 获取：投放点名称
	 */
	public String getToufangdianmingcheng() {
		return toufangdianmingcheng;
	}
	/**
	 * 设置：投放点图片
	 */
	public void setToufangdiantupian(String toufangdiantupian) {
		this.toufangdiantupian = toufangdiantupian;
	}
	/**
	 * 获取：投放点图片
	 */
	public String getToufangdiantupian() {
		return toufangdiantupian;
	}
	/**
	 * 设置：投放点分类
	 */
	public void setToufangdianfenlei(String toufangdianfenlei) {
		this.toufangdianfenlei = toufangdianfenlei;
	}
	/**
	 * 获取：投放点分类
	 */
	public String getToufangdianfenlei() {
		return toufangdianfenlei;
	}
	/**
	 * 设置：容量/m³
	 */
	public void setRongliang(Double rongliang) {
		this.rongliang = rongliang;
	}
	/**
	 * 获取：容量/m³
	 */
	public Double getRongliang() {
		return rongliang;
	}
	/**
	 * 设置：开放时间
	 */
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	/**
	 * 获取：开放时间
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
	/**
	 * 设置：经度
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	/**
	 * 获取：经度
	 */
	public Double getLongitude() {
		return longitude;
	}
	/**
	 * 设置：纬度
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	/**
	 * 获取：纬度
	 */
	public Double getLatitude() {
		return latitude;
	}
	/**
	 * 设置：地址
	 */
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	/**
	 * 获取：地址
	 */
	public String getFulladdress() {
		return fulladdress;
	}

}

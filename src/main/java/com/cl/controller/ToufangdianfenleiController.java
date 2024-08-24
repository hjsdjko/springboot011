package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ToufangdianfenleiEntity;
import com.cl.entity.view.ToufangdianfenleiView;

import com.cl.service.ToufangdianfenleiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 投放点分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-05-06 11:50:50
 */
@RestController
@RequestMapping("/toufangdianfenlei")
public class ToufangdianfenleiController {
    @Autowired
    private ToufangdianfenleiService toufangdianfenleiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ToufangdianfenleiEntity toufangdianfenlei,
		HttpServletRequest request){
        EntityWrapper<ToufangdianfenleiEntity> ew = new EntityWrapper<ToufangdianfenleiEntity>();

		PageUtils page = toufangdianfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, toufangdianfenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ToufangdianfenleiEntity toufangdianfenlei, 
		HttpServletRequest request){
        EntityWrapper<ToufangdianfenleiEntity> ew = new EntityWrapper<ToufangdianfenleiEntity>();

		PageUtils page = toufangdianfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, toufangdianfenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ToufangdianfenleiEntity toufangdianfenlei){
       	EntityWrapper<ToufangdianfenleiEntity> ew = new EntityWrapper<ToufangdianfenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( toufangdianfenlei, "toufangdianfenlei")); 
        return R.ok().put("data", toufangdianfenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ToufangdianfenleiEntity toufangdianfenlei){
        EntityWrapper< ToufangdianfenleiEntity> ew = new EntityWrapper< ToufangdianfenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( toufangdianfenlei, "toufangdianfenlei")); 
		ToufangdianfenleiView toufangdianfenleiView =  toufangdianfenleiService.selectView(ew);
		return R.ok("查询投放点分类成功").put("data", toufangdianfenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ToufangdianfenleiEntity toufangdianfenlei = toufangdianfenleiService.selectById(id);
		toufangdianfenlei = toufangdianfenleiService.selectView(new EntityWrapper<ToufangdianfenleiEntity>().eq("id", id));
        return R.ok().put("data", toufangdianfenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ToufangdianfenleiEntity toufangdianfenlei = toufangdianfenleiService.selectById(id);
		toufangdianfenlei = toufangdianfenleiService.selectView(new EntityWrapper<ToufangdianfenleiEntity>().eq("id", id));
        return R.ok().put("data", toufangdianfenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ToufangdianfenleiEntity toufangdianfenlei, HttpServletRequest request){
    	toufangdianfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(toufangdianfenlei);
        toufangdianfenleiService.insert(toufangdianfenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ToufangdianfenleiEntity toufangdianfenlei, HttpServletRequest request){
    	toufangdianfenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(toufangdianfenlei);
        toufangdianfenleiService.insert(toufangdianfenlei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ToufangdianfenleiEntity toufangdianfenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(toufangdianfenlei);
        toufangdianfenleiService.updateById(toufangdianfenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        toufangdianfenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}

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

import com.cl.entity.RenyuanxinxiEntity;
import com.cl.entity.view.RenyuanxinxiView;

import com.cl.service.RenyuanxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 人员信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-05-06 11:50:50
 */
@RestController
@RequestMapping("/renyuanxinxi")
public class RenyuanxinxiController {
    @Autowired
    private RenyuanxinxiService renyuanxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RenyuanxinxiEntity renyuanxinxi,
		HttpServletRequest request){
        EntityWrapper<RenyuanxinxiEntity> ew = new EntityWrapper<RenyuanxinxiEntity>();

		PageUtils page = renyuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renyuanxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RenyuanxinxiEntity renyuanxinxi, 
		HttpServletRequest request){
        EntityWrapper<RenyuanxinxiEntity> ew = new EntityWrapper<RenyuanxinxiEntity>();

		PageUtils page = renyuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renyuanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RenyuanxinxiEntity renyuanxinxi){
       	EntityWrapper<RenyuanxinxiEntity> ew = new EntityWrapper<RenyuanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( renyuanxinxi, "renyuanxinxi")); 
        return R.ok().put("data", renyuanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RenyuanxinxiEntity renyuanxinxi){
        EntityWrapper< RenyuanxinxiEntity> ew = new EntityWrapper< RenyuanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( renyuanxinxi, "renyuanxinxi")); 
		RenyuanxinxiView renyuanxinxiView =  renyuanxinxiService.selectView(ew);
		return R.ok("查询人员信息成功").put("data", renyuanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RenyuanxinxiEntity renyuanxinxi = renyuanxinxiService.selectById(id);
		renyuanxinxi = renyuanxinxiService.selectView(new EntityWrapper<RenyuanxinxiEntity>().eq("id", id));
        return R.ok().put("data", renyuanxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RenyuanxinxiEntity renyuanxinxi = renyuanxinxiService.selectById(id);
		renyuanxinxi = renyuanxinxiService.selectView(new EntityWrapper<RenyuanxinxiEntity>().eq("id", id));
        return R.ok().put("data", renyuanxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RenyuanxinxiEntity renyuanxinxi, HttpServletRequest request){
    	renyuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(renyuanxinxi);
        renyuanxinxiService.insert(renyuanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RenyuanxinxiEntity renyuanxinxi, HttpServletRequest request){
    	renyuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(renyuanxinxi);
        renyuanxinxiService.insert(renyuanxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody RenyuanxinxiEntity renyuanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(renyuanxinxi);
        renyuanxinxiService.updateById(renyuanxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        renyuanxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	






    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,RenyuanxinxiEntity renyuanxinxi, HttpServletRequest request){
        EntityWrapper<RenyuanxinxiEntity> ew = new EntityWrapper<RenyuanxinxiEntity>();
        int count = renyuanxinxiService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renyuanxinxi), params), params));
        return R.ok().put("data", count);
    }


}

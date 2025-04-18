package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.PeisongdingdanEntity;
import com.entity.view.PeisongdingdanView;

import com.service.PeisongdingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 配送订单
 * 后端接口
 * @author 
 * @email 
 * @date 2021-10-18 18:05:05
 */
@RestController
@RequestMapping("/peisongdingdan")
public class PeisongdingdanController {
    @Autowired
    private PeisongdingdanService peisongdingdanService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PeisongdingdanEntity peisongdingdan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			peisongdingdan.setShangjiabianhao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			peisongdingdan.setYonghuming((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("qishou")) {
			peisongdingdan.setQishougonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PeisongdingdanEntity> ew = new EntityWrapper<PeisongdingdanEntity>();
		PageUtils page = peisongdingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peisongdingdan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PeisongdingdanEntity peisongdingdan, 
		HttpServletRequest request){
        EntityWrapper<PeisongdingdanEntity> ew = new EntityWrapper<PeisongdingdanEntity>();
		PageUtils page = peisongdingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peisongdingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PeisongdingdanEntity peisongdingdan){
       	EntityWrapper<PeisongdingdanEntity> ew = new EntityWrapper<PeisongdingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( peisongdingdan, "peisongdingdan")); 
        return R.ok().put("data", peisongdingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PeisongdingdanEntity peisongdingdan){
        EntityWrapper< PeisongdingdanEntity> ew = new EntityWrapper< PeisongdingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( peisongdingdan, "peisongdingdan")); 
		PeisongdingdanView peisongdingdanView =  peisongdingdanService.selectView(ew);
		return R.ok("查询配送订单成功").put("data", peisongdingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PeisongdingdanEntity peisongdingdan = peisongdingdanService.selectById(id);
        return R.ok().put("data", peisongdingdan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PeisongdingdanEntity peisongdingdan = peisongdingdanService.selectById(id);
        return R.ok().put("data", peisongdingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PeisongdingdanEntity peisongdingdan, HttpServletRequest request){
    	peisongdingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peisongdingdan);
        peisongdingdanService.insert(peisongdingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PeisongdingdanEntity peisongdingdan, HttpServletRequest request){
    	peisongdingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peisongdingdan);
        peisongdingdanService.insert(peisongdingdan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PeisongdingdanEntity peisongdingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(peisongdingdan);
        peisongdingdanService.updateById(peisongdingdan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        peisongdingdanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<PeisongdingdanEntity> wrapper = new EntityWrapper<PeisongdingdanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			wrapper.eq("shangjiabianhao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("qishou")) {
			wrapper.eq("qishougonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = peisongdingdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	




}

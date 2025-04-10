package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PeisongrenwuDao;
import com.entity.PeisongrenwuEntity;
import com.service.PeisongrenwuService;
import com.entity.vo.PeisongrenwuVO;
import com.entity.view.PeisongrenwuView;

@Service("peisongrenwuService")
public class PeisongrenwuServiceImpl extends ServiceImpl<PeisongrenwuDao, PeisongrenwuEntity> implements PeisongrenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeisongrenwuEntity> page = this.selectPage(
                new Query<PeisongrenwuEntity>(params).getPage(),
                new EntityWrapper<PeisongrenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeisongrenwuEntity> wrapper) {
		  Page<PeisongrenwuView> page =new Query<PeisongrenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeisongrenwuVO> selectListVO(Wrapper<PeisongrenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeisongrenwuVO selectVO(Wrapper<PeisongrenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeisongrenwuView> selectListView(Wrapper<PeisongrenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeisongrenwuView selectView(Wrapper<PeisongrenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

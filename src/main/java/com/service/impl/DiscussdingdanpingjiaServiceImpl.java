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


import com.dao.DiscussdingdanpingjiaDao;
import com.entity.DiscussdingdanpingjiaEntity;
import com.service.DiscussdingdanpingjiaService;
import com.entity.vo.DiscussdingdanpingjiaVO;
import com.entity.view.DiscussdingdanpingjiaView;

@Service("discussdingdanpingjiaService")
public class DiscussdingdanpingjiaServiceImpl extends ServiceImpl<DiscussdingdanpingjiaDao, DiscussdingdanpingjiaEntity> implements DiscussdingdanpingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdingdanpingjiaEntity> page = this.selectPage(
                new Query<DiscussdingdanpingjiaEntity>(params).getPage(),
                new EntityWrapper<DiscussdingdanpingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdingdanpingjiaEntity> wrapper) {
		  Page<DiscussdingdanpingjiaView> page =new Query<DiscussdingdanpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdingdanpingjiaVO> selectListVO(Wrapper<DiscussdingdanpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdingdanpingjiaVO selectVO(Wrapper<DiscussdingdanpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdingdanpingjiaView> selectListView(Wrapper<DiscussdingdanpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdingdanpingjiaView selectView(Wrapper<DiscussdingdanpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

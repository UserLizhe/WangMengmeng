package com.dao;

import com.entity.PeisongrenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeisongrenwuVO;
import com.entity.view.PeisongrenwuView;


/**
 * 配送任务
 * 
 * @author 
 * @email 
 * @date 2021-10-18 18:05:05
 */
public interface PeisongrenwuDao extends BaseMapper<PeisongrenwuEntity> {
	
	List<PeisongrenwuVO> selectListVO(@Param("ew") Wrapper<PeisongrenwuEntity> wrapper);
	
	PeisongrenwuVO selectVO(@Param("ew") Wrapper<PeisongrenwuEntity> wrapper);
	
	List<PeisongrenwuView> selectListView(@Param("ew") Wrapper<PeisongrenwuEntity> wrapper);

	List<PeisongrenwuView> selectListView(Pagination page,@Param("ew") Wrapper<PeisongrenwuEntity> wrapper);
	
	PeisongrenwuView selectView(@Param("ew") Wrapper<PeisongrenwuEntity> wrapper);
	
}

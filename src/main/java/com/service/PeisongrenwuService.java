package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeisongrenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeisongrenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeisongrenwuView;


/**
 * 配送任务
 *
 * @author 
 * @email 
 * @date 2021-10-18 18:05:05
 */
public interface PeisongrenwuService extends IService<PeisongrenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeisongrenwuVO> selectListVO(Wrapper<PeisongrenwuEntity> wrapper);
   	
   	PeisongrenwuVO selectVO(@Param("ew") Wrapper<PeisongrenwuEntity> wrapper);
   	
   	List<PeisongrenwuView> selectListView(Wrapper<PeisongrenwuEntity> wrapper);
   	
   	PeisongrenwuView selectView(@Param("ew") Wrapper<PeisongrenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeisongrenwuEntity> wrapper);
   	
}


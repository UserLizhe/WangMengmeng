package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdingdanpingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdingdanpingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdingdanpingjiaView;


/**
 * 订单评价评论表
 *
 * @author 
 * @email 
 * @date 2021-10-18 18:05:05
 */
public interface DiscussdingdanpingjiaService extends IService<DiscussdingdanpingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdingdanpingjiaVO> selectListVO(Wrapper<DiscussdingdanpingjiaEntity> wrapper);
   	
   	DiscussdingdanpingjiaVO selectVO(@Param("ew") Wrapper<DiscussdingdanpingjiaEntity> wrapper);
   	
   	List<DiscussdingdanpingjiaView> selectListView(Wrapper<DiscussdingdanpingjiaEntity> wrapper);
   	
   	DiscussdingdanpingjiaView selectView(@Param("ew") Wrapper<DiscussdingdanpingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdingdanpingjiaEntity> wrapper);
   	
}


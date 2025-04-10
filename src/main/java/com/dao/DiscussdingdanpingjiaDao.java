package com.dao;

import com.entity.DiscussdingdanpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdingdanpingjiaVO;
import com.entity.view.DiscussdingdanpingjiaView;


/**
 * 订单评价评论表
 * 
 * @author 
 * @email 
 * @date 2021-10-18 18:05:05
 */
public interface DiscussdingdanpingjiaDao extends BaseMapper<DiscussdingdanpingjiaEntity> {
	
	List<DiscussdingdanpingjiaVO> selectListVO(@Param("ew") Wrapper<DiscussdingdanpingjiaEntity> wrapper);
	
	DiscussdingdanpingjiaVO selectVO(@Param("ew") Wrapper<DiscussdingdanpingjiaEntity> wrapper);
	
	List<DiscussdingdanpingjiaView> selectListView(@Param("ew") Wrapper<DiscussdingdanpingjiaEntity> wrapper);

	List<DiscussdingdanpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdingdanpingjiaEntity> wrapper);
	
	DiscussdingdanpingjiaView selectView(@Param("ew") Wrapper<DiscussdingdanpingjiaEntity> wrapper);
	
}

package com.entity.view;

import com.entity.PeisongrenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 配送任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-10-18 18:05:05
 */
@TableName("peisongrenwu")
public class PeisongrenwuView  extends PeisongrenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeisongrenwuView(){
	}
 
 	public PeisongrenwuView(PeisongrenwuEntity peisongrenwuEntity){
 	try {
			BeanUtils.copyProperties(this, peisongrenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
